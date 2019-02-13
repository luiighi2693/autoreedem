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
 *         &lt;element name="DecrypterResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "decrypterResult"
})
@XmlRootElement(name = "DecrypterResponse")
public class DecrypterResponse {

    @XmlElement(name = "DecrypterResult")
    protected String decrypterResult;

    /**
     * Obtiene el valor de la propiedad decrypterResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecrypterResult() {
        return decrypterResult;
    }

    /**
     * Define el valor de la propiedad decrypterResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecrypterResult(String value) {
        this.decrypterResult = value;
    }

}
