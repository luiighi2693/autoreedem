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
 * <p>Clase Java para ExcludeProductResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExcludeProductResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Excluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcludeProductResponse", propOrder = {
    "errorCode",
    "errorDescription",
    "productId",
    "campaignId",
    "excluded",
        "executed",
        "campaignAutoRedeemable",
        "campaignExcluded",
        "campaignProductStatusId"
})
public class ExcludeProductResponse {

    @XmlElement(name = "ErrorCode")
    protected String errorCode;
    @XmlElement(name = "ErrorDescription")
    protected String errorDescription;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "CampaignId")
    protected String campaignId;
    @XmlElement(name = "Excluded")
    protected boolean excluded;

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
     * Obtiene el valor de la propiedad productId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
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
     * Obtiene el valor de la propiedad excluded.
     * 
     */
    public boolean isExcluded() {
        return excluded;
    }

    /**
     * Define el valor de la propiedad excluded.
     * 
     */
    public void setExcluded(boolean value) {
        this.excluded = value;
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
