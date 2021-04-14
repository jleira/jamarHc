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
 * Java class for ComportamientoEntidadesType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ComportamientoEntidadesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="ComportamientoEntidades" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="comportamiento" maxOccurs="12" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="valor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="mes" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="codSector" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="entidad" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="numeroCuenta" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="tipoCuenta" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="estado" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="fechaActualizacion" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComportamientoEntidadesType", propOrder = {
    "comportamientoEntidades"
})
public class ComportamientoEntidadesType {

    @XmlElement(name = "ComportamientoEntidades")
    protected List<ComportamientoEntidadesType.ComportamientoEntidades> comportamientoEntidades;

    /**
     * Gets the value of the comportamientoEntidades property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the comportamientoEntidades property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComportamientoEntidades().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComportamientoEntidadesType.ComportamientoEntidades }
     *
     *
     * @return 
     */
    public List<ComportamientoEntidadesType.ComportamientoEntidades> getComportamientoEntidades() {
        if (comportamientoEntidades == null) {
            comportamientoEntidades = new ArrayList<ComportamientoEntidadesType.ComportamientoEntidades>();
        }
        return this.comportamientoEntidades;
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
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="comportamiento" maxOccurs="12" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="valor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="mes" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="codSector" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="entidad" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="numeroCuenta" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="tipoCuenta" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="estado" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="fechaActualizacion" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "comportamiento"
    })
    public static class ComportamientoEntidades {

        protected List<ComportamientoEntidadesType.ComportamientoEntidades.Comportamiento> comportamiento;
        @XmlAttribute(required = true)
        protected int codSector;
        @XmlAttribute(required = true)
        protected String entidad;
        @XmlAttribute(required = true)
        protected String numeroCuenta;
        @XmlAttribute(required = true)
        protected String tipoCuenta;
        @XmlAttribute(required = true)
        protected String estado;
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaActualizacion;

        /**
         * Gets the value of the comportamiento property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the comportamiento property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComportamiento().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ComportamientoEntidadesType.ComportamientoEntidades.Comportamiento }
         *
         *
         * @return 
         */
        public List<ComportamientoEntidadesType.ComportamientoEntidades.Comportamiento> getComportamiento() {
            if (comportamiento == null) {
                comportamiento = new ArrayList<ComportamientoEntidadesType.ComportamientoEntidades.Comportamiento>();
            }
            return this.comportamiento;
        }

        /**
         * Gets the value of the codSector property.
         *
         * @return 
         */
        public int getCodSector() {
            return codSector;
        }

        /**
         * Sets the value of the codSector property.
         *
         * @param value
         */
        public void setCodSector(int value) {
            this.codSector = value;
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
         * Gets the value of the fechaActualizacion property.
         *
         * @return possible object is {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getFechaActualizacion() {
            return fechaActualizacion;
        }

        /**
         * Sets the value of the fechaActualizacion property.
         *
         * @param value allowed object is {@link XMLGregorianCalendar }
         *
         */
        public void setFechaActualizacion(XMLGregorianCalendar value) {
            this.fechaActualizacion = value;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         *
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="valor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="mes" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Comportamiento {

            @XmlAttribute(required = true)
            protected String valor;
            @XmlAttribute(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar mes;

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

            /**
             * Gets the value of the mes property.
             *
             * @return possible object is {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getMes() {
                return mes;
            }

            /**
             * Sets the value of the mes property.
             *
             * @param value allowed object is {@link XMLGregorianCalendar }
             *
             */
            public void setMes(XMLGregorianCalendar value) {
                this.mes = value;
            }

        }

    }

}