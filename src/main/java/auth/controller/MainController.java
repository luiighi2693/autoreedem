package auth.controller;

import auth.autoredeemws.*;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@Controller
@Api(description = "Users management API")
@RequestMapping(path="/")
public class MainController {

	Logger log = Logger.getLogger(MainController.class.getName());
	private final ApplicationContext context;

	@Value( "${soap.auth.client}" )
	private String soapAuthClient;

	@Autowired
	public MainController(ApplicationContext context) {
		this.context = context;
	}

	@CrossOrigin
	@GetMapping({"campainginformation"})
	public ResponseEntity<CampaignInformationResponse> getCampaingInformation(@RequestParam("nSeq") String nSeq) {
		this.log.info("Comenzando Servicio: getCampaingInformation() nSeq: " + nSeq);
		return new ResponseEntity<>(((AuthClient)context
				.getBean(soapAuthClient))
				.getCampaingInformation(nSeq).getGetCampaignInformationResult(), HttpStatus.OK);
	}

	@CrossOrigin
	@PostMapping({"redeemcampaign"})
	public ResponseEntity<RedeemCampaignResponse> getRedeemCampaign(@RequestBody RedeemCampaignRequest redeemCampaignRequest, @RequestParam("nSeq") String nSeq) {
		this.log.info("Comenzando Servicio: getRedeemCampaign() " + redeemCampaignRequest);
		this.log.info("Comenzando Servicio: getRedeemCampaign() nSeq: " + nSeq);

		CampaignInformationResponse response = ((AuthClient)context
				.getBean(soapAuthClient))
				.getCampaingInformation(nSeq).getGetCampaignInformationResult();
		this.log.info("CampaignInformationResponse " + response);
		RedeemCampaignResponse redeemCampaignResponse;
		if (response.isAutoRedeemable() && response.getExcluded().equalsIgnoreCase("0") && response.getProductStatusId().equalsIgnoreCase("1")) {
			redeemCampaignResponse = ((AuthClient)context
					.getBean(soapAuthClient)).getRedeemCampaign(redeemCampaignRequest);
			redeemCampaignResponse.setExecuted(Boolean.TRUE);
		} else {
			redeemCampaignResponse = new RedeemCampaignResponse();
			redeemCampaignResponse.setExecuted(Boolean.FALSE);
		}

		redeemCampaignResponse.setCampaignAutoRedeemable(response.isAutoRedeemable());
		redeemCampaignResponse.setCampaignExcluded(response.getExcluded());
		redeemCampaignResponse.setCampaignProductStatusId(response.getProductStatusId());

		return new ResponseEntity<>(redeemCampaignResponse, HttpStatus.OK);
	}

	@CrossOrigin
	@PostMapping({"excludeproduct"})
	public ResponseEntity<ExcludeProductResponse> doExcludeProduct(@RequestBody ExcludeProductRequest excludeProductRequest, @RequestParam("nSeq") String nSeq) {
		this.log.info("Comenzando Servicio: getExcludeProduct() " + excludeProductRequest);
		this.log.info("Comenzando Servicio: getExcludeProduct() nSeq: " + nSeq);
		CampaignInformationResponse response = ((AuthClient)context
				.getBean(soapAuthClient))
				.getCampaingInformation(nSeq).getGetCampaignInformationResult();
		this.log.info("CampaignInformationResponse " + response);
		ExcludeProductResponse excludeProductResponse;
		if (response.isAutoRedeemable() && response.getExcluded().equalsIgnoreCase("0") && response.getProductStatusId().equalsIgnoreCase("1")) {
			excludeProductResponse = ((AuthClient)context
					.getBean(soapAuthClient)).doExcludeProduct(excludeProductRequest);
			excludeProductResponse.setExecuted(Boolean.TRUE);
		} else {
			excludeProductResponse = new ExcludeProductResponse();
			excludeProductResponse.setExecuted(Boolean.FALSE);
		}

		excludeProductResponse.setCampaignAutoRedeemable(response.isAutoRedeemable());
		excludeProductResponse.setCampaignExcluded(response.getExcluded());
		excludeProductResponse.setCampaignProductStatusId(response.getProductStatusId());

		return new ResponseEntity<>(excludeProductResponse, HttpStatus.OK);
	}

}
