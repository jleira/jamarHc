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
 * Java class for CuentaCorrienteType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="CuentaCorrienteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Caracteristicas" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="clase">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Valores" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Valor" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="moneda">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="creditosEfectivo" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="debitosEfectivo" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="creditosTransferencia" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="debitosTransferencia" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="cantidadChequesDevueltos" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="cantidadChequesPagados" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="valorChequesDevueltos" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="valorChequesPagados" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="calificacion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Estado">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="codigo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Reclamo" type="{}ReclamoType" minOccurs="0"/>
 *         &lt;element name="Adjetivo" type="{}AdjetivoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Sobregiro" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="valor" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="dias" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="bloqueada" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="entidad" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="numero" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fechaApertura" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="calificacion">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="situacionTitular" use="required">
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
 *       &lt;attribute name="ciudad">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="codigoDaneCiudad">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="codSuscriptor">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="tipoIdentificacion" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="identificacion" use="required">
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
@XmlType(name = "CuentaCorrienteType", propOrder = {
    "caracteristicas",
    "valores",
    "estado",
    "reclamo",
    "adjetivo",
    "sobregiro",
    "llave"
})
public class CuentaCorrienteType {

    @XmlElement(name = "Caracteristicas")
    protected CuentaCorrienteType.Caracteristicas caracteristicas;
    @XmlElement(name = "Valores")
    protected CuentaCorrienteType.Valores valores;
    @XmlElement(name = "Estado", required = true)
    protected CuentaCorrienteType.Estado estado;
    @XmlElement(name = "Reclamo")
    protected ReclamoType reclamo;
    @XmlElement(name = "Adjetivo")
    protected List<AdjetivoType> adjetivo;
    @XmlElement(name = "Sobregiro")
    protected CuentaCorrienteType.Sobregiro sobregiro;
    @XmlElement(name = "Llave")
    protected String llave;
    @XmlAttribute(required = true)
    protected boolean bloqueada;
    @XmlAttribute(required = true)
    protected String entidad;
    @XmlAttribute(required = true)
    protected String numero;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaApertura;
    @XmlAttribute
    protected String calificacion;
    @XmlAttribute(required = true)
    protected String situacionTitular;
    @XmlAttribute
    protected String oficina;
    @XmlAttribute
    protected String ciudad;
    @XmlAttribute
    protected String codigoDaneCiudad;
    @XmlAttribute
    protected String codSuscriptor;
    @XmlAttribute(required = true)
    protected String tipoIdentificacion;
    @XmlAttribute(required = true)
    protected String identificacion;
    @XmlAttribute
    protected String sector;
    @XmlAttribute
    protected String independiente;

    /**
     * Gets the value of the caracteristicas property.
     *
     * @return possible object is {@link CuentaCorrienteType.Caracteristicas }
     *
     */
    public CuentaCorrienteType.Caracteristicas getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * Sets the value of the caracteristicas property.
     *
     * @param value allowed object is
     *     {@link CuentaCorrienteType.Caracteristicas }
     *
     */
    public void setCaracteristicas(CuentaCorrienteType.Caracteristicas value) {
        this.caracteristicas = value;
    }

    /**
     * Gets the value of the valores property.
     *
     * @return possible object is {@link CuentaCorrienteType.Valores }
     *
     */
    public CuentaCorrienteType.Valores getValores() {
        return valores;
    }

    /**
     * Sets the value of the valores property.
     *
     * @param value allowed object is {@link CuentaCorrienteType.Valores }
     *
     */
    public void setValores(CuentaCorrienteType.Valores value) {
        this.valores = value;
    }

    /**
     * Gets the value of the estado property.
     *
     * @return possible object is {@link CuentaCorrienteType.Estado }
     *
     */
    public CuentaCorrienteType.Estado getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     *
     * @param value allowed object is {@link CuentaCorrienteType.Estado }
     *
     */
    public void setEstado(CuentaCorrienteType.Estado value) {
        this.estado = value;
    }

    /**
     * Gets the value of the reclamo property.
     *
     * @return possible object is {@link ReclamoType }
     *
     */
    public ReclamoType getReclamo() {
        return reclamo;
    }

    /**
     * Sets the value of the reclamo property.
     *
     * @param value allowed object is {@link ReclamoType }
     *
     */
    public void setReclamo(ReclamoType value) {
        this.reclamo = value;
    }

    /**
     * Gets the value of the adjetivo property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the adjetivo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjetivo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdjetivoType }
     *
     *
     * @return 
     */
    public List<AdjetivoType> getAdjetivo() {
        if (adjetivo == null) {
            adjetivo = new ArrayList<AdjetivoType>();
        }
        return this.adjetivo;
    }

    /**
     * Gets the value of the sobregiro property.
     *
     * @return possible object is {@link CuentaCorrienteType.Sobregiro }
     *
     */
    public CuentaCorrienteType.Sobregiro getSobregiro() {
        return sobregiro;
    }

    /**
     * Sets the value of the sobregiro property.
     *
     * @param value allowed object is {@link CuentaCorrienteType.Sobregiro }
     *
     */
    public void setSobregiro(CuentaCorrienteType.Sobregiro value) {
        this.sobregiro = value;
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
     * Gets the value of the bloqueada property.
     *
     * @return 
     */
    public boolean isBloqueada() {
        return bloqueada;
    }

    /**
     * Sets the value of the bloqueada property.
     *
     * @param value
     */
    public void setBloqueada(boolean value) {
        this.bloqueada = value;
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
     * Gets the value of the fechaApertura property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaApertura() {
        return fechaApertura;
    }

    /**
     * Sets the value of the fechaApertura property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaApertura(XMLGregorianCalendar value) {
        this.fechaApertura = value;
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
     * Gets the value of the situacionTitular property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSituacionTitular() {
        return situacionTitular;
    }

    /**
     * Sets the value of the situacionTitular property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSituacionTitular(String value) {
        this.situacionTitular = value;
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
     * Gets the value of the codigoDaneCiudad property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodigoDaneCiudad() {
        return codigoDaneCiudad;
    }

    /**
     * Sets the value of the codigoDaneCiudad property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodigoDaneCiudad(String value) {
        this.codigoDaneCiudad = value;
    }

    /**
     * Gets the value of the codSuscriptor property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodSuscriptor() {
        return codSuscriptor;
    }

    /**
     * Sets the value of the codSuscriptor property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodSuscriptor(String value) {
        this.codSuscriptor = value;
    }

    /**
     * Gets the value of the tipoIdentificacion property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Sets the value of the tipoIdentificacion property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTipoIdentificacion(String value) {
        this.tipoIdentificacion = value;
    }

    /**
     * Gets the value of the identificacion property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Sets the value of the identificacion property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIdentificacion(String value) {
        this.identificacion = value;
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
     *       &lt;attribute name="clase">
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
    public static class Caracteristicas {

        @XmlAttribute
        protected String clase;

        /**
         * Gets the value of the clase property.
         *
         * @return possible object is {@link String }
         *
         */
        public String getClase() {
            return clase;
        }

        /**
         * Sets the value of the clase property.
         *
         * @param value allowed object is {@link String }
         *
         */
        public void setClase(String value) {
            this.clase = value;
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
     *       &lt;attribute name="codigo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Estado {

        @XmlAttribute(required = true)
        protected String codigo;
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fecha;

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
     *       &lt;attribute name="valor" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="dias" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Sobregiro {

        @XmlAttribute(required = true)
        protected double valor;
        @XmlAttribute(required = true)
        protected int dias;
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fecha;

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

        /**
         * Gets the value of the dias property.
         *
         * @return 
         */
        public int getDias() {
            return dias;
        }

        /**
         * Sets the value of the dias property.
         *
         * @param value
         */
        public void setDias(int value) {
            this.dias = value;
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
     *         &lt;element name="Valor" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="moneda">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="creditosEfectivo" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="debitosEfectivo" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="creditosTransferencia" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="debitosTransferencia" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="cantidadChequesDevueltos" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="cantidadChequesPagados" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="valorChequesDevueltos" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="valorChequesPagados" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="calificacion" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    @XmlType(name = "", propOrder = {
        "valor"
    })
    public static class Valores {

        @XmlElement(name = "Valor")
        protected CuentaCorrienteType.Valores.Valor valor;

        /**
         * Gets the value of the valor property.
         *
         * @return possible object is {@link CuentaCorrienteType.Valores.Valor }
         *
         */
        public CuentaCorrienteType.Valores.Valor getValor() {
            return valor;
        }

        /**
         * Sets the value of the valor property.
         *
         * @param value allowed object is
         *     {@link CuentaCorrienteType.Valores.Valor }
         *
         */
        public void setValor(CuentaCorrienteType.Valores.Valor value) {
            this.valor = value;
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
         *       &lt;attribute name="moneda">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="creditosEfectivo" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="debitosEfectivo" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="creditosTransferencia" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="debitosTransferencia" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="cantidadChequesDevueltos" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="cantidadChequesPagados" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="valorChequesDevueltos" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="valorChequesPagados" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="calificacion" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Valor {

            @XmlAttribute
            protected String moneda;
            @XmlAttribute
            protected Double creditosEfectivo;
            @XmlAttribute
            protected Double debitosEfectivo;
            @XmlAttribute
            protected Double creditosTransferencia;
            @XmlAttribute
            protected Double debitosTransferencia;
            @XmlAttribute
            protected Integer cantidadChequesDevueltos;
            @XmlAttribute
            protected Integer cantidadChequesPagados;
            @XmlAttribute
            protected Double valorChequesDevueltos;
            @XmlAttribute
            protected Double valorChequesPagados;
            @XmlAttribute(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar fecha;
            @XmlAttribute
            protected String calificacion;

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
             * Gets the value of the creditosEfectivo property.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getCreditosEfectivo() {
                return creditosEfectivo;
            }

            /**
             * Sets the value of the creditosEfectivo property.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setCreditosEfectivo(Double value) {
                this.creditosEfectivo = value;
            }

            /**
             * Gets the value of the debitosEfectivo property.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getDebitosEfectivo() {
                return debitosEfectivo;
            }

            /**
             * Sets the value of the debitosEfectivo property.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setDebitosEfectivo(Double value) {
                this.debitosEfectivo = value;
            }

            /**
             * Gets the value of the creditosTransferencia property.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getCreditosTransferencia() {
                return creditosTransferencia;
            }

            /**
             * Sets the value of the creditosTransferencia property.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setCreditosTransferencia(Double value) {
                this.creditosTransferencia = value;
            }

            /**
             * Gets the value of the debitosTransferencia property.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getDebitosTransferencia() {
                return debitosTransferencia;
            }

            /**
             * Sets the value of the debitosTransferencia property.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setDebitosTransferencia(Double value) {
                this.debitosTransferencia = value;
            }

            /**
             * Gets the value of the cantidadChequesDevueltos property.
             *
             * @return possible object is {@link Integer }
             *
             */
            public Integer getCantidadChequesDevueltos() {
                return cantidadChequesDevueltos;
            }

            /**
             * Sets the value of the cantidadChequesDevueltos property.
             *
             * @param value allowed object is {@link Integer }
             *
             */
            public void setCantidadChequesDevueltos(Integer value) {
                this.cantidadChequesDevueltos = value;
            }

            /**
             * Gets the value of the cantidadChequesPagados property.
             *
             * @return possible object is {@link Integer }
             *
             */
            public Integer getCantidadChequesPagados() {
                return cantidadChequesPagados;
            }

            /**
             * Sets the value of the cantidadChequesPagados property.
             *
             * @param value allowed object is {@link Integer }
             *
             */
            public void setCantidadChequesPagados(Integer value) {
                this.cantidadChequesPagados = value;
            }

            /**
             * Gets the value of the valorChequesDevueltos property.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getValorChequesDevueltos() {
                return valorChequesDevueltos;
            }

            /**
             * Sets the value of the valorChequesDevueltos property.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setValorChequesDevueltos(Double value) {
                this.valorChequesDevueltos = value;
            }

            /**
             * Gets the value of the valorChequesPagados property.
             *
             * @return possible object is {@link Double }
             *
             */
            public Double getValorChequesPagados() {
                return valorChequesPagados;
            }

            /**
             * Sets the value of the valorChequesPagados property.
             *
             * @param value allowed object is {@link Double }
             *
             */
            public void setValorChequesPagados(Double value) {
                this.valorChequesPagados = value;
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

        }

    }

}
