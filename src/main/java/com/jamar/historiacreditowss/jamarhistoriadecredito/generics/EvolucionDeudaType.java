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
 * Java class for EvolucionDeudaType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="EvolucionDeudaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="Trimestre" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="mesesMoraMaxima" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="cuota" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="cupoTotal" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="saldo" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="porcentajeUso" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="score" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="calificacion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="aperturaCuentas" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="cierreCuentas" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="totalAbiertas" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="totalCerradas" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="moraMaxima" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AnalisisPromedio" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="cuota" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="cupoTotal" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="saldo" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="porcentajeUso" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="score" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="calificacion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="aperturaCuentas" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="cierreCuentas" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="totalAbiertas" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="totalCerradas" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="moraMaxima" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
@XmlType(name = "EvolucionDeudaType", propOrder = {
    "trimestre",
    "analisisPromedio"
})
public class EvolucionDeudaType {

    @XmlElement(name = "Trimestre")
    protected List<EvolucionDeudaType.Trimestre> trimestre;
    @XmlElement(name = "AnalisisPromedio")
    protected EvolucionDeudaType.AnalisisPromedio analisisPromedio;

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
     * {@link EvolucionDeudaType.Trimestre }
     *
     *
     * @return 
     */
    public List<EvolucionDeudaType.Trimestre> getTrimestre() {
        if (trimestre == null) {
            trimestre = new ArrayList<EvolucionDeudaType.Trimestre>();
        }
        return this.trimestre;
    }

    /**
     * Gets the value of the analisisPromedio property.
     *
     * @return possible object is {@link EvolucionDeudaType.AnalisisPromedio }
     *
     */
    public EvolucionDeudaType.AnalisisPromedio getAnalisisPromedio() {
        return analisisPromedio;
    }

    /**
     * Sets the value of the analisisPromedio property.
     *
     * @param value allowed object is
     *     {@link EvolucionDeudaType.AnalisisPromedio }
     *
     */
    public void setAnalisisPromedio(EvolucionDeudaType.AnalisisPromedio value) {
        this.analisisPromedio = value;
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
     *       &lt;attribute name="cuota" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="cupoTotal" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="saldo" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="porcentajeUso" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="score" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="calificacion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="aperturaCuentas" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="cierreCuentas" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="totalAbiertas" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="totalCerradas" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="moraMaxima" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AnalisisPromedio {

        @XmlAttribute(required = true)
        protected double cuota;
        @XmlAttribute(required = true)
        protected double cupoTotal;
        @XmlAttribute(required = true)
        protected double saldo;
        @XmlAttribute(required = true)
        protected double porcentajeUso;
        @XmlAttribute(required = true)
        protected double score;
        @XmlAttribute(required = true)
        protected int calificacion;
        @XmlAttribute(required = true)
        protected double aperturaCuentas;
        @XmlAttribute(required = true)
        protected double cierreCuentas;
        @XmlAttribute(required = true)
        protected double totalAbiertas;
        @XmlAttribute(required = true)
        protected double totalCerradas;
        @XmlAttribute(required = true)
        protected int moraMaxima;

        /**
         * Gets the value of the cuota property.
         *
         * @return 
         */
        public double getCuota() {
            return cuota;
        }

        /**
         * Sets the value of the cuota property.
         *
         * @param value
         */
        public void setCuota(double value) {
            this.cuota = value;
        }

        /**
         * Gets the value of the cupoTotal property.
         *
         * @return 
         */
        public double getCupoTotal() {
            return cupoTotal;
        }

        /**
         * Sets the value of the cupoTotal property.
         *
         * @param value
         */
        public void setCupoTotal(double value) {
            this.cupoTotal = value;
        }

        /**
         * Gets the value of the saldo property.
         *
         * @return 
         */
        public double getSaldo() {
            return saldo;
        }

        /**
         * Sets the value of the saldo property.
         *
         * @param value
         */
        public void setSaldo(double value) {
            this.saldo = value;
        }

        /**
         * Gets the value of the porcentajeUso property.
         *
         * @return 
         */
        public double getPorcentajeUso() {
            return porcentajeUso;
        }

        /**
         * Sets the value of the porcentajeUso property.
         *
         * @param value
         */
        public void setPorcentajeUso(double value) {
            this.porcentajeUso = value;
        }

        /**
         * Gets the value of the score property.
         *
         * @return 
         */
        public double getScore() {
            return score;
        }

        /**
         * Sets the value of the score property.
         *
         * @param value
         */
        public void setScore(double value) {
            this.score = value;
        }

        /**
         * Gets the value of the calificacion property.
         *
         * @return 
         */
        public int getCalificacion() {
            return calificacion;
        }

        /**
         * Sets the value of the calificacion property.
         *
         * @param value
         */
        public void setCalificacion(int value) {
            this.calificacion = value;
        }

        /**
         * Gets the value of the aperturaCuentas property.
         *
         * @return 
         */
        public double getAperturaCuentas() {
            return aperturaCuentas;
        }

        /**
         * Sets the value of the aperturaCuentas property.
         *
         * @param value
         */
        public void setAperturaCuentas(double value) {
            this.aperturaCuentas = value;
        }

        /**
         * Gets the value of the cierreCuentas property.
         *
         * @return 
         */
        public double getCierreCuentas() {
            return cierreCuentas;
        }

        /**
         * Sets the value of the cierreCuentas property.
         *
         * @param value
         */
        public void setCierreCuentas(double value) {
            this.cierreCuentas = value;
        }

        /**
         * Gets the value of the totalAbiertas property.
         *
         * @return 
         */
        public double getTotalAbiertas() {
            return totalAbiertas;
        }

        /**
         * Sets the value of the totalAbiertas property.
         *
         * @param value
         */
        public void setTotalAbiertas(double value) {
            this.totalAbiertas = value;
        }

        /**
         * Gets the value of the totalCerradas property.
         *
         * @return 
         */
        public double getTotalCerradas() {
            return totalCerradas;
        }

        /**
         * Sets the value of the totalCerradas property.
         *
         * @param value
         */
        public void setTotalCerradas(double value) {
            this.totalCerradas = value;
        }

        /**
         * Gets the value of the moraMaxima property.
         *
         * @return 
         */
        public int getMoraMaxima() {
            return moraMaxima;
        }

        /**
         * Sets the value of the moraMaxima property.
         *
         * @param value
         */
        public void setMoraMaxima(int value) {
            this.moraMaxima = value;
        }

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
     *       &lt;attribute name="mesesMoraMaxima" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="cuota" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="cupoTotal" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="saldo" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="porcentajeUso" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="score" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="calificacion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="aperturaCuentas" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="cierreCuentas" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="totalAbiertas" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="totalCerradas" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="moraMaxima" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Trimestre {

        @XmlAttribute
        protected Integer mesesMoraMaxima;
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fecha;
        @XmlAttribute(required = true)
        protected double cuota;
        @XmlAttribute(required = true)
        protected double cupoTotal;
        @XmlAttribute(required = true)
        protected double saldo;
        @XmlAttribute(required = true)
        protected double porcentajeUso;
        @XmlAttribute(required = true)
        protected double score;
        @XmlAttribute(required = true)
        protected String calificacion;
        @XmlAttribute(required = true)
        protected int aperturaCuentas;
        @XmlAttribute(required = true)
        protected int cierreCuentas;
        @XmlAttribute(required = true)
        protected int totalAbiertas;
        @XmlAttribute(required = true)
        protected int totalCerradas;
        @XmlAttribute(required = true)
        protected String moraMaxima;

        /**
         * Gets the value of the mesesMoraMaxima property.
         *
         * @return possible object is {@link Integer }
         *
         */
        public Integer getMesesMoraMaxima() {
            return mesesMoraMaxima;
        }

        /**
         * Sets the value of the mesesMoraMaxima property.
         *
         * @param value allowed object is {@link Integer }
         *
         */
        public void setMesesMoraMaxima(Integer value) {
            this.mesesMoraMaxima = value;
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
         * Gets the value of the cuota property.
         *
         * @return 
         */
        public double getCuota() {
            return cuota;
        }

        /**
         * Sets the value of the cuota property.
         *
         * @param value
         */
        public void setCuota(double value) {
            this.cuota = value;
        }

        /**
         * Gets the value of the cupoTotal property.
         *
         * @return 
         */
        public double getCupoTotal() {
            return cupoTotal;
        }

        /**
         * Sets the value of the cupoTotal property.
         *
         * @param value
         */
        public void setCupoTotal(double value) {
            this.cupoTotal = value;
        }

        /**
         * Gets the value of the saldo property.
         *
         * @return 
         */
        public double getSaldo() {
            return saldo;
        }

        /**
         * Sets the value of the saldo property.
         *
         * @param value
         */
        public void setSaldo(double value) {
            this.saldo = value;
        }

        /**
         * Gets the value of the porcentajeUso property.
         *
         * @return 
         */
        public double getPorcentajeUso() {
            return porcentajeUso;
        }

        /**
         * Sets the value of the porcentajeUso property.
         *
         * @param value
         */
        public void setPorcentajeUso(double value) {
            this.porcentajeUso = value;
        }

        /**
         * Gets the value of the score property.
         *
         * @return 
         */
        public double getScore() {
            return score;
        }

        /**
         * Sets the value of the score property.
         *
         * @param value
         */
        public void setScore(double value) {
            this.score = value;
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
         * Gets the value of the aperturaCuentas property.
         *
         * @return 
         */
        public int getAperturaCuentas() {
            return aperturaCuentas;
        }

        /**
         * Sets the value of the aperturaCuentas property.
         *
         * @param value
         */
        public void setAperturaCuentas(int value) {
            this.aperturaCuentas = value;
        }

        /**
         * Gets the value of the cierreCuentas property.
         *
         * @return 
         */
        public int getCierreCuentas() {
            return cierreCuentas;
        }

        /**
         * Sets the value of the cierreCuentas property.
         *
         * @param value
         */
        public void setCierreCuentas(int value) {
            this.cierreCuentas = value;
        }

        /**
         * Gets the value of the totalAbiertas property.
         *
         * @return 
         */
        public int getTotalAbiertas() {
            return totalAbiertas;
        }

        /**
         * Sets the value of the totalAbiertas property.
         *
         * @param value
         */
        public void setTotalAbiertas(int value) {
            this.totalAbiertas = value;
        }

        /**
         * Gets the value of the totalCerradas property.
         *
         * @return 
         */
        public int getTotalCerradas() {
            return totalCerradas;
        }

        /**
         * Sets the value of the totalCerradas property.
         *
         * @param value
         */
        public void setTotalCerradas(int value) {
            this.totalCerradas = value;
        }

        /**
         * Gets the value of the moraMaxima property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getMoraMaxima() {
            return moraMaxima;
        }

        /**
         * Sets the value of the moraMaxima property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setMoraMaxima(String value) {
            this.moraMaxima = value;
        }

    }

}
