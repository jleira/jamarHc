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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for ConsultaType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Llave" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="tipoCuenta">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="entidad" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="oficina">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ciudad" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="razon" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cantidad" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="nitSuscriptor">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="sector">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaType", propOrder = {
    "llave"
})
public class ConsultaType {

    @XmlElement(name = "Llave")
    protected String llave;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fecha;
    @XmlAttribute
    protected String tipoCuenta;
    @XmlAttribute(required = true)
    protected String entidad;
    @XmlAttribute
    protected String oficina;
    @XmlAttribute(required = true)
    protected String ciudad;
    @XmlAttribute(required = true)
    protected String razon;
    @XmlAttribute(required = true)
    protected int cantidad;
    @XmlAttribute
    protected String nitSuscriptor;
    @XmlAttribute
    protected String sector;

    /**
     * Gets the value of the llave property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLlave() {
        return llave;
    }

    /**
     * Sets the value of the llave property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLlave(String value) {
        this.llave = value;
    }

    /**
     * Gets the value of the fecha property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the tipoCuenta property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Sets the value of the tipoCuenta property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTipoCuenta(String value) {
        this.tipoCuenta = value;
    }

    /**
     * Gets the value of the entidad property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getEntidad() {
        return entidad;
    }

    /**
     * Sets the value of the entidad property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setEntidad(String value) {
        this.entidad = value;
    }

    /**
     * Gets the value of the oficina property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getOficina() {
        return oficina;
    }

    /**
     * Sets the value of the oficina property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setOficina(String value) {
        this.oficina = value;
    }

    /**
     * Gets the value of the ciudad property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Sets the value of the ciudad property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Gets the value of the razon property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getRazon() {
        return razon;
    }

    /**
     * Sets the value of the razon property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setRazon(String value) {
        this.razon = value;
    }

    /**
     * Gets the value of the cantidad property.
     *
     * @return 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     *
     * @param value
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Gets the value of the nitSuscriptor property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNitSuscriptor() {
        return nitSuscriptor;
    }

    /**
     * Sets the value of the nitSuscriptor property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNitSuscriptor(String value) {
        this.nitSuscriptor = value;
    }

    /**
     * Gets the value of the sector property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSector() {
        return sector;
    }

    /**
     * Sets the value of the sector property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSector(String value) {
        this.sector = value;
    }

}