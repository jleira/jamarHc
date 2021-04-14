
package com.dc.hc2.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarHC2PJResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarHC2PJResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consultarHC2PJReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarHC2PJResponse", propOrder = {
    "consultarHC2PJReturn"
})
public class ConsultarHC2PJResponse {

    @XmlElement(required = true)
    protected String consultarHC2PJReturn;

    /**
     * Obtiene el valor de la propiedad consultarHC2PJReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultarHC2PJReturn() {
        return consultarHC2PJReturn;
    }

    /**
     * Define el valor de la propiedad consultarHC2PJReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultarHC2PJReturn(String value) {
        this.consultarHC2PJReturn = value;
    }

}
