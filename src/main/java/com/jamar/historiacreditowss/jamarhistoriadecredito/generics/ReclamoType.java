//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.02 at 10:34:02 AM COT 
//
package com.jamar.historiacreditowss.jamarhistoriadecredito.generics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for ReclamoType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ReclamoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Subtipo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="codigo" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="nombre" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="numero" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="tipoLeyenda" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="tipo" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="estado" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ratificado" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="numeroCuenta">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="texto">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="entidad">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fechaCierre" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReclamoType", propOrder = {
    "subtipo",
    "llave"
})
public class ReclamoType {

    @XmlElement(name = "Subtipo")
    protected List<ReclamoType.Subtipo> subtipo;
    @XmlElement(name = "Llave")
    protected String llave;
    @XmlAttribute(required = true)
    protected String numero;
    @XmlAttribute(required = true)
    protected String tipoLeyenda;
    @XmlAttribute(required = true)
    protected String tipo;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fecha;
    @XmlAttribute(required = true)
    protected String estado;
    @XmlAttribute(required = true)
    protected boolean ratificado;
    @XmlAttribute
    protected String numeroCuenta;
    @XmlAttribute
    protected String texto;
    @XmlAttribute
    protected String entidad;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaCierre;

    /**
     * Gets the value of the subtipo property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the subtipo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtipo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReclamoType.Subtipo }
     *
     *
     * @return 
     */
    public List<ReclamoType.Subtipo> getSubtipo() {
        if (subtipo == null) {
            subtipo = new ArrayList<ReclamoType.Subtipo>();
        }
        return this.subtipo;
    }

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
     * Gets the value of the numero property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the tipoLeyenda property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTipoLeyenda() {
        return tipoLeyenda;
    }

    /**
     * Sets the value of the tipoLeyenda property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTipoLeyenda(String value) {
        this.tipoLeyenda = value;
    }

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
     * Gets the value of the estado property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the ratificado property.
     *
     * @return 
     */
    public boolean isRatificado() {
        return ratificado;
    }

    /**
     * Sets the value of the ratificado property.
     *
     * @param value
     */
    public void setRatificado(boolean value) {
        this.ratificado = value;
    }

    /**
     * Gets the value of the numeroCuenta property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Sets the value of the numeroCuenta property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNumeroCuenta(String value) {
        this.numeroCuenta = value;
    }

    /**
     * Gets the value of the texto property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Sets the value of the texto property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTexto(String value) {
        this.texto = value;
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
     * Gets the value of the fechaCierre property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaCierre() {
        return fechaCierre;
    }

    /**
     * Sets the value of the fechaCierre property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaCierre(XMLGregorianCalendar value) {
        this.fechaCierre = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     *
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="codigo" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="nombre" use="required">
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
    @XmlType(name = "")
    public static class Subtipo {

        @XmlAttribute(required = true)
        protected String codigo;
        @XmlAttribute(required = true)
        protected String nombre;

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
         * Gets the value of the nombre property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Sets the value of the nombre property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

    }

}
