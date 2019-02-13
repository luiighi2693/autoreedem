//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.13 a las 11:52:33 AM VET 
//


package auth.autoredeemws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RedeemCampaignResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RedeemCampaignResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPromoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPromoTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Excluded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Redeemed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedeemCampaignResponse", propOrder = {
    "errorCode",
    "errorDescription",
    "subscriberId",
    "campaignId",
    "discountPromoId",
    "discountPromoTerm",
    "excluded",
    "redeemed",
        "executed",
        "campaignAutoRedeemable",
        "campaignExcluded",
        "campaignProductStatusId"
})
public class RedeemCampaignResponse {

    @XmlElement(name = "ErrorCode")
    protected String errorCode;
    @XmlElement(name = "ErrorDescription")
    protected String errorDescription;
    @XmlElement(name = "SubscriberId")
    protected String subscriberId;
    @XmlElement(name = "CampaignId")
    protected String campaignId;
    @XmlElement(name = "DiscountPromoId")
    protected String discountPromoId;
    @XmlElement(name = "DiscountPromoTerm")
    protected String discountPromoTerm;
    @XmlElement(name = "Excluded")
    protected String excluded;
    @XmlElement(name = "Redeemed")
    protected String redeemed;

    @XmlElement(name = "Executed")
    private Boolean executed;
    @XmlElement(name = "CampaignAutoRedeemable")
    private Boolean campaignAutoRedeemable;
    @XmlElement(name = "CampaignExcluded")
    private String campaignExcluded;
    @XmlElement(name = "CampaignProductStatusId")
    private String campaignProductStatusId;
    /**
     * Obtiene el valor de la propiedad errorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Define el valor de la propiedad errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad errorDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Define el valor de la propiedad errorDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad subscriberId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Define el valor de la propiedad subscriberId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

    /**
     * Obtiene el valor de la propiedad campaignId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Define el valor de la propiedad campaignId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignId(String value) {
        this.campaignId = value;
    }

    /**
     * Obtiene el valor de la propiedad discountPromoId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPromoId() {
        return discountPromoId;
    }

    /**
     * Define el valor de la propiedad discountPromoId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPromoId(String value) {
        this.discountPromoId = value;
    }

    /**
     * Obtiene el valor de la propiedad discountPromoTerm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPromoTerm() {
        return discountPromoTerm;
    }

    /**
     * Define el valor de la propiedad discountPromoTerm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPromoTerm(String value) {
        this.discountPromoTerm = value;
    }

    /**
     * Obtiene el valor de la propiedad excluded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcluded() {
        return excluded;
    }

    /**
     * Define el valor de la propiedad excluded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcluded(String value) {
        this.excluded = value;
    }

    /**
     * Obtiene el valor de la propiedad redeemed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeemed() {
        return redeemed;
    }

    /**
     * Define el valor de la propiedad redeemed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeemed(String value) {
        this.redeemed = value;
    }


    public Boolean getExecuted() {
        return executed;
    }

    public void setExecuted(Boolean executed) {
        this.executed = executed;
    }

    public Boolean getCampaignAutoRedeemable() {
        return campaignAutoRedeemable;
    }

    public void setCampaignAutoRedeemable(Boolean campaignAutoRedeemable) {
        this.campaignAutoRedeemable = campaignAutoRedeemable;
    }

    public String getCampaignExcluded() {
        return campaignExcluded;
    }

    public void setCampaignExcluded(String campaignExcluded) {
        this.campaignExcluded = campaignExcluded;
    }

    public String getCampaignProductStatusId() {
        return campaignProductStatusId;
    }

    public void setCampaignProductStatusId(String campaignProductStatusId) {
        this.campaignProductStatusId = campaignProductStatusId;
    }
}
