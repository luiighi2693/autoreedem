package auth.controller;

import auth.autoredeemws.*;
import auth.wsdl.ChangePassAD;
import auth.wsdl.ChangePassADResponse;
import auth.wsdl.LoginAD;
import auth.wsdl.LoginADResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


public class AuthClient extends WebServiceGatewaySupport {

    @Value( "${soap.auth.endpoint}" )
    private String soapAuthEndpoint;

    @Value( "${soap.auth.getcampainginfo.method.uri}" )
    private String getCampaingInformationAction;

    @Value( "${soap.auth.getredeemcampaign.method.uri}" )
    private String getRedeemCampaignAction;

    @Value( "${soap.auth.doexcludeproduct.method.uri}" )
    private String doExcludeProductAction;


    public GetCampaignInformationResponse getCampaingInformation(String nSeq) {
        GetCampaignInformation request = new GetCampaignInformation();
        request.setNSeq(nSeq);

        return (GetCampaignInformationResponse) getWebServiceTemplate()
                .marshalSendAndReceive(soapAuthEndpoint, request,
                        new SoapActionCallback(getCampaingInformationAction));
    }

    public RedeemCampaignResponse getRedeemCampaign(RedeemCampaignRequest request) {
        return (RedeemCampaignResponse) getWebServiceTemplate()
                .marshalSendAndReceive(soapAuthEndpoint, request,
                        new SoapActionCallback(getRedeemCampaignAction));
    }

    public ExcludeProductResponse doExcludeProduct(ExcludeProductRequest request) {
        return (ExcludeProductResponse) getWebServiceTemplate()
                .marshalSendAndReceive(soapAuthEndpoint, request,
                        new SoapActionCallback(doExcludeProductAction));
    }
}