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
 * Java class for NaturalExtranjeraType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="NaturalExtranjeraType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ubicacion" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="antiguedad" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="tipo">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InfoDemografica" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}InfoDemograficaType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nombre" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="validada" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="numero" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="rut" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaturalExtranjeraType", propOrder = {
    "ubicacion",
    "infoDemografica",
    "llave"
})
public class NaturalExtranjeraType {

    @XmlElement(name = "Ubicacion")
    protected NaturalExtranjeraType.Ubicacion ubicacion;
    @XmlElement(name = "InfoDemografica")
    protected NaturalExtranjeraType.InfoDemografica infoDemografica;
    @XmlElement(name = "Llave")
    protected String llave;
    @XmlAttribute(required = true)
    protected String nombre;
    @XmlAttribute(required = true)
    protected boolean validada;
    @XmlAttribute(required = true)
    protected String numero;
    @XmlAttribute
    protected String nacionalidad;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaNacimiento;
    @XmlAttribute
    protected Boolean rut;

    /**
     * Gets the value of the ubicacion property.
     *
     * @return possible object is {@link NaturalExtranjeraType.Ubicacion }
     *
     */
    public NaturalExtranjeraType.Ubicacion getUbicacion() {
        return ubicacion;
    }

    /**
     * Sets the value of the ubicacion property.
     *
     * @param value allowed object is {@link NaturalExtranjeraType.Ubicacion }
     *
     */
    public void setUbicacion(NaturalExtranjeraType.Ubicacion value) {
        this.ubicacion = value;
    }

    /**
     * Gets the value of the infoDemografica property.
     *
     * @return possible object is {@link NaturalExtranjeraType.InfoDemografica }
     *
     */
    public NaturalExtranjeraType.InfoDemografica getInfoDemografica() {
        return infoDemografica;
    }

    /**
     * Sets the value of the infoDemografica property.
     *
     * @param value allowed object is
     *     {@link NaturalExtranjeraType.InfoDemografica }
     *
     */
    public void setInfoDemografica(NaturalExtranjeraType.InfoDemografica value) {
        this.infoDemografica = value;
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

    /**
     * Gets the value of the validada property.
     *
     * @return 
     */
    public boolean isValidada() {
        return validada;
    }

    /**
     * Sets the value of the validada property.
     *
     * @param value
     */
    public void setValidada(boolean value) {
        this.validada = value;
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
     * Gets the value of the nacionalidad property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Sets the value of the nacionalidad property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNacionalidad(String value) {
        this.nacionalidad = value;
    }

    /**
     * Gets the value of the fechaNacimiento property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaNacimiento(XMLGregorianCalendar value) {
        this.fechaNacimiento = value;
    }

    /**
     * Gets the value of the rut property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isRut() {
        return rut;
    }

    /**
     * Sets the value of the rut property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setRut(Boolean value) {
        this.rut = value;
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
     *     &lt;extension base="{}InfoDemograficaType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class InfoDemografica
            extends InfoDemograficaType {

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
     *       &lt;attribute name="antiguedad" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="tipo">
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
    public static class Ubicacion {

        @XmlAttribute
        protected Integer antiguedad;
        @XmlAttribute
        protected String tipo;

        /**
         * Gets the value of the antiguedad property.
         *
         * @return possible object is {@link Integer }
         *
         */
        public Integer getAntiguedad() {
            return antiguedad;
        }

        /**
         * Sets the value of the antiguedad property.
         *
         * @param value allowed object is {@link Integer }
         *
         */
        public void setAntiguedad(Integer value) {
            this.antiguedad = value;
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

    }

}
