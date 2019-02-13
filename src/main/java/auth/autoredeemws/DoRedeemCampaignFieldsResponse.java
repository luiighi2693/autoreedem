//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.13 a las 11:52:33 AM VET 
//


package auth.autoredeemws;

import javax.xml.bind.annotation.*;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DoRedeemCampaignFieldsResult" type="{http://www.openmobilepr.com/AutoRedeemBoostMobile}RedeemCampaignResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "doRedeemCampaignFieldsResult"
})
@XmlRootElement(name = "DoRedeemCampaignFieldsResponse")
public class DoRedeemCampaignFieldsResponse {

    @XmlElement(name = "DoRedeemCampaignFieldsResult")
    protected RedeemCampaignResponse doRedeemCampaignFieldsResult;

    /**
     * Obtiene el valor de la propiedad doRedeemCampaignFieldsResult.
     * 
     * @return
     *     possible object is
     *     {@link RedeemCampaignResponse }
     *     
     */
    public RedeemCampaignResponse getDoRedeemCampaignFieldsResult() {
        return doRedeemCampaignFieldsResult;
    }

    /**
     * Define el valor de la propiedad doRedeemCampaignFieldsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RedeemCampaignResponse }
     *     
     */
    public void setDoRedeemCampaignFieldsResult(RedeemCampaignResponse value) {
        this.doRedeemCampaignFieldsResult = value;
    }

}
