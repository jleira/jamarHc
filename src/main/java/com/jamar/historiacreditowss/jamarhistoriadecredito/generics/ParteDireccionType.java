//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.02 at 10:34:02 AM COT 
//
package com.jamar.historiacreditowss.jamarhistoriadecredito.generics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Debe especificarse al menos el coigo o el valor.
 *
 * <p>
 * Java class for ParteDireccionType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ParteDireccionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="tipo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParteDireccionType")
public class ParteDireccionType {

    @XmlAttribute(required = true)
    protected String tipo;
    @XmlAttribute
    protected String codigo;
    @XmlAttribute
    protected String valor;

    /**
     * Gets the value of the tipo property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the codigo property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the valor property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setValor(String value) {
        this.valor = value;
    }

}
