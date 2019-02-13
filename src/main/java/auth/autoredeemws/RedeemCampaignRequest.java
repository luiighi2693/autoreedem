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
 * <p>Clase Java para RedeemCampaignRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RedeemCampaignRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PromoKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPromoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPromoTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedeemCampaignRequest", propOrder = {
    "promoKey",
    "subscriberId",
    "campaignId",
    "discountPromoId",
    "discountPromoTerm"
})
public class RedeemCampaignRequest {

    @XmlElement(name = "PromoKey")
    protected String promoKey;
    @XmlElement(name = "SubscriberId")
    protected String subscriberId;
    @XmlElement(name = "CampaignId")
    protected String campaignId;
    @XmlElement(name = "DiscountPromoId")
    protected String discountPromoId;
    @XmlElement(name = "DiscountPromoTerm")
    protected String discountPromoTerm;

    /**
     * Obtiene el valor de la propiedad promoKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoKey() {
        return promoKey;
    }

    /**
     * Define el valor de la propiedad promoKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoKey(String value) {
        this.promoKey = value;
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

}
