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
 * Java class for ResumenEndeudamientoType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ResumenEndeudamientoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="Trimestre" maxOccurs="3">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Sector" maxOccurs="4">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Cartera" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="tipo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="numeroCuentas" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="valor" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="codigoSector" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="sector" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="garantiaOtro" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="garantiaAdmisible" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
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
@XmlType(name = "ResumenEndeudamientoType", propOrder = {
    "trimestre"
})
public class ResumenEndeudamientoType {

    @XmlElement(name = "Trimestre")
    protected List<ResumenEndeudamientoType.Trimestre> trimestre;

    /**
     * Gets the value of the trimestre property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the trimestre property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrimestre().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResumenEndeudamientoType.Trimestre }
     *
     *
     * @return 
     */
    public List<ResumenEndeudamientoType.Trimestre> getTrimestre() {
        if (trimestre == null) {
            trimestre = new ArrayList<ResumenEndeudamientoType.Trimestre>();
        }
        return this.trimestre;
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
     *       &lt;sequence>
     *         &lt;element name="Sector" maxOccurs="4">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Cartera" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="tipo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="numeroCuentas" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="valor" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="codigoSector" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="sector" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="garantiaOtro" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="garantiaAdmisible" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sector"
    })
    public static class Trimestre {

        @XmlElement(name = "Sector", required = true)
        protected List<ResumenEndeudamientoType.Trimestre.Sector> sector;
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fecha;

        /**
         * Gets the value of the sector property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the sector property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSector().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResumenEndeudamientoType.Trimestre.Sector }
         *
         *
         * @return 
         */
        public List<ResumenEndeudamientoType.Trimestre.Sector> getSector() {
            if (sector == null) {
                sector = new ArrayList<ResumenEndeudamientoType.Trimestre.Sector>();
            }
            return this.sector;
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
         *       &lt;sequence>
         *         &lt;element name="Cartera" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="tipo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="numeroCuentas" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="valor" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="codigoSector" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="sector" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="garantiaOtro" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="garantiaAdmisible" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cartera"
        })
        public static class Sector {

            @XmlElement(name = "Cartera", required = true)
            protected List<ResumenEndeudamientoType.Trimestre.Sector.Cartera> cartera;
            @XmlAttribute
            protected Integer codigoSector;
            @XmlAttribute
            @XmlSchemaType(name = "anySimpleType")
            protected String sector;
            @XmlAttribute
            protected Integer garantiaOtro;
            @XmlAttribute
            protected Integer garantiaAdmisible;

            /**
             * Gets the value of the cartera property.
             *
             * <p>
             * This accessor method returns a reference to the live list, not a
             * snapshot. Therefore any modification you make to the returned
             * list will be present inside the JAXB object. This is why there is
             * not a <CODE>set</CODE> method for the cartera property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCartera().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ResumenEndeudamientoType.Trimestre.Sector.Cartera }
             *
             *
             * @return 
             */
            public List<ResumenEndeudamientoType.Trimestre.Sector.Cartera> getCartera() {
                if (cartera == null) {
                    cartera = new ArrayList<ResumenEndeudamientoType.Trimestre.Sector.Cartera>();
                }
                return this.cartera;
            }

            /**
             * Gets the value of the codigoSector property.
             *
             * @return possible object is {@link Integer }
             *
             */
            public Integer getCodigoSector() {
                return codigoSector;
            }

            /**
             * Sets the value of the codigoSector property.
             *
             * @param value allowed object is {@link Integer }
             *
             */
            public void setCodigoSector(Integer value) {
                this.codigoSector = value;
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

            /**
             * Gets the value of the garantiaOtro property.
             *
             * @return possible object is {@link Integer }
             *
             */
            public Integer getGarantiaOtro() {
                return garantiaOtro;
            }

            /**
             * Sets the value of the garantiaOtro property.
             *
             * @param value allowed object is {@link Integer }
             *
             */
            public void setGarantiaOtro(Integer value) {
                this.garantiaOtro = value;
            }

            /**
             * Gets the value of the garantiaAdmisible property.
             *
             * @return possible object is {@link Integer }
             *
             */
            public Integer getGarantiaAdmisible() {
                return garantiaAdmisible;
            }

            /**
             * Sets the value of the garantiaAdmisible property.
             *
             * @param value allowed object is {@link Integer }
             *
             */
            public void setGarantiaAdmisible(Integer value) {
                this.garantiaAdmisible = value;
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
             *       &lt;attribute name="tipo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="numeroCuentas" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="valor" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Cartera {

                @XmlAttribute(required = true)
                protected String tipo;
                @XmlAttribute(required = true)
                protected int numeroCuentas;
                @XmlAttribute(required = true)
                protected double valor;

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
                 * Gets the value of the numeroCuentas property.
                 *
                 * @return 
                 */
                public int getNumeroCuentas() {
                    return numeroCuentas;
                }

                /**
                 * Sets the value of the numeroCuentas property.
                 *
                 * @param value
                 */
                public void setNumeroCuentas(int value) {
                    this.numeroCuentas = value;
                }

                /**
                 * Gets the value of the valor property.
                 *
                 * @return 
                 */
                public double getValor() {
                    return valor;
                }

                /**
                 * Sets the value of the valor property.
                 *
                 * @param value
                 */
                public void setValor(double value) {
                    this.valor = value;
                }

            }

        }

    }

}
