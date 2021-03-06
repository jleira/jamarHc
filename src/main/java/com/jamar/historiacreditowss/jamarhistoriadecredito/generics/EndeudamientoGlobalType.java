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
 * Java class for EndeudamientoGlobalType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="EndeudamientoGlobalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="Entidad" type="{}EntidadHCType"/>
 *         &lt;element name="Garantia" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="tipo" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="fecha" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="calificacion" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fuente" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="saldoPendiente" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="tipoCredito" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="moneda" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="numeroCreditos" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="fechaReporte" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="independiente">
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
@XmlType(name = "EndeudamientoGlobalType", propOrder = {
    "entidad",
    "garantia",
    "llave"
})
public class EndeudamientoGlobalType {

    @XmlElement(name = "Entidad")
    protected EntidadHCType entidad;
    @XmlElement(name = "Garantia")
    protected EndeudamientoGlobalType.Garantia garantia;
    @XmlElement(name = "Llave")
    protected String llave;
    @XmlAttribute(required = true)
    protected String calificacion;
    @XmlAttribute(required = true)
    protected String fuente;
    @XmlAttribute(required = true)
    protected double saldoPendiente;
    @XmlAttribute(required = true)
    protected String tipoCredito;
    @XmlAttribute(required = true)
    protected String moneda;
    @XmlAttribute(required = true)
    protected int numeroCreditos;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaReporte;
    @XmlAttribute
    protected String independiente;

    /**
     * Gets the value of the entidad property.
     *
     * @return possible object is {@link EntidadHCType }
     *
     */
    public EntidadHCType getEntidad() {
        return entidad;
    }

    /**
     * Sets the value of the entidad property.
     *
     * @param value allowed object is {@link EntidadHCType }
     *
     */
    public void setEntidad(EntidadHCType value) {
        this.entidad = value;
    }

    /**
     * Gets the value of the garantia property.
     *
     * @return possible object is {@link EndeudamientoGlobalType.Garantia }
     *
     */
    public EndeudamientoGlobalType.Garantia getGarantia() {
        return garantia;
    }

    /**
     * Sets the value of the garantia property.
     *
     * @param value allowed object is {@link EndeudamientoGlobalType.Garantia }
     *
     */
    public void setGarantia(EndeudamientoGlobalType.Garantia value) {
        this.garantia = value;
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
     * Gets the value of the calificacion property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCalificacion() {
        return calificacion;
    }

    /**
     * Sets the value of the calificacion property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCalificacion(String value) {
        this.calificacion = value;
    }

    /**
     * Gets the value of the fuente property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFuente() {
        return fuente;
    }

    /**
     * Sets the value of the fuente property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFuente(String value) {
        this.fuente = value;
    }

    /**
     * Gets the value of the saldoPendiente property.
     *
     * @return 
     */
    public double getSaldoPendiente() {
        return saldoPendiente;
    }

    /**
     * Sets the value of the saldoPendiente property.
     *
     * @param value
     */
    public void setSaldoPendiente(double value) {
        this.saldoPendiente = value;
    }

    /**
     * Gets the value of the tipoCredito property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTipoCredito() {
        return tipoCredito;
    }

    /**
     * Sets the value of the tipoCredito property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTipoCredito(String value) {
        this.tipoCredito = value;
    }

    /**
     * Gets the value of the moneda property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Sets the value of the moneda property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Gets the value of the numeroCreditos property.
     *
     * @return 
     */
    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    /**
     * Sets the value of the numeroCreditos property.
     *
     * @param value
     */
    public void setNumeroCreditos(int value) {
        this.numeroCreditos = value;
    }

    /**
     * Gets the value of the fechaReporte property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaReporte() {
        return fechaReporte;
    }

    /**
     * Sets the value of the fechaReporte property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaReporte(XMLGregorianCalendar value) {
        this.fechaReporte = value;
    }

    /**
     * Gets the value of the independiente property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIndependiente() {
        return independiente;
    }

    /**
     * Sets the value of the independiente property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIndependiente(String value) {
        this.independiente = value;
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
     *       &lt;attribute name="tipo" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="fecha" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Garantia {

        @XmlAttribute(required = true)
        protected String tipo;
        @XmlAttribute
        protected Double valor;
        @XmlAttribute
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fecha;

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
         * Gets the value of the valor property.
         *
         * @return possible object is {@link Double }
         *
         */
        public Double getValor() {
            return valor;
        }

        /**
         * Sets the value of the valor property.
         *
         * @param value allowed object is {@link Double }
         *
         */
        public void setValor(Double value) {
            this.valor = value;
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

    }

}
