//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.13 a las 11:52:33 AM VET 
//


package auth.autoredeemws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="getTinyUrlResult" type="{http://www.openmobilepr.com/AutoRedeemBoostMobile}GetShortUrlResponse" minOccurs="0"/&gt;
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
    "getTinyUrlResult"
})
@XmlRootElement(name = "getTinyUrlResponse")
public class GetTinyUrlResponse {

    protected GetShortUrlResponse getTinyUrlResult;

    /**
     * Obtiene el valor de la propiedad getTinyUrlResult.
     *
     * @return
     *     possible object is
     *     {@link GetShortUrlResponse }
     *
     */
    public GetShortUrlResponse getGetTinyUrlResult() {
        return getTinyUrlResult;
    }

    /**
     * Define el valor de la propiedad getTinyUrlResult.
     *
     * @param value
     *     allowed object is
     *     {@link GetShortUrlResponse }
     *     
     */
    public void setGetTinyUrlResult(GetShortUrlResponse value) {
        this.getTinyUrlResult = value;
    }

}
