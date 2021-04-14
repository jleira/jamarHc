/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamar.historiacreditowss.jamarhistoriadecredito.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para anonymous complex type.
 *
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="identificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "origen",
    "empresa",
    "producto",
    "tipoIdentificacion",
    "identificacion",
    "usuario",
    "clave",
    "primerApellido",
    "STRAID",
    "STRNAM",
    "FR_INGRESO",
    "FR_TASA_USURA",
    "FR_SEGMENTO_1",
    "FR_FORMATO",
    "ENDPOINT"

})
@XmlRootElement(name = "solicitud")
public class Solicitud {

    protected String origen;
    @XmlElement(required = true)
    protected String empresa;
    @XmlElement(required = true)
    protected String producto;
    protected int tipoIdentificacion;
    @XmlElement(required = true)
    protected String identificacion;
    @XmlElement(required = true)
    protected String usuario;
    protected String clave;
    @XmlElement(required = true)
    protected String primerApellido;
    
    @XmlElement(required = true)
    protected String STRAID;
    @XmlElement(required = true)
    protected String STRNAM;
    @XmlElement(required = true)
    protected String FR_INGRESO;
    @XmlElement(required = true)
    protected String FR_TASA_USURA;
    @XmlElement(required = true)
    protected String FR_SEGMENTO_1;
    @XmlElement(required = true)
    protected String FR_FORMATO;
    @XmlElement(required = true)
    protected String ENDPOINT;

    
    public String getENDPOINT() {
		return ENDPOINT;
	}

	public void setENDPOINT(String eNDPOINT) {
		ENDPOINT = eNDPOINT;
	}

	public String getSTRAID() {
		return STRAID;
	}

	public void setSTRAID(String sTRAID) {
		STRAID = sTRAID;
	}

	public String getSTRNAM() {
		return STRNAM;
	}

	public void setSTRNAM(String sTRNAM) {
		STRNAM = sTRNAM;
	}

	public String getFR_INGRESO() {
		return FR_INGRESO;
	}

	public void setFR_INGRESO(String fR_INGRESO) {
		FR_INGRESO = fR_INGRESO;
	}

	public String getFR_TASA_USURA() {
		return FR_TASA_USURA;
	}

	public void setFR_TASA_USURA(String fR_TASA_USURA) {
		FR_TASA_USURA = fR_TASA_USURA;
	}

	public String getFR_SEGMENTO_1() {
		return FR_SEGMENTO_1;
	}

	public void setFR_SEGMENTO_1(String fR_SEGMENTO_1) {
		FR_SEGMENTO_1 = fR_SEGMENTO_1;
	}

	public String getFR_FORMATO() {
		return FR_FORMATO;
	}

	public void setFR_FORMATO(String fR_FORMATO) {
		FR_FORMATO = fR_FORMATO;
	}

	/**
     * Obtiene el valor de la propiedad origen.
     *
     * @return possible object is {@link String }
     *
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Define el valor de la propiedad origen.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Obtiene el valor de la propiedad empresa.
     *
     * @return possible object is {@link String }
     *
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Define el valor de la propiedad empresa.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setEmpresa(String value) {
        this.empresa = value;
    }

    /**
     * Obtiene el valor de la propiedad producto.
     *
     * @return possible object is {@link String }
     *
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setProducto(String value) {
        this.producto = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacion.
     *
     * @return possible object is {@link Integer }
     *
     */
    public int getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacion.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setTipoIdentificacion(int value) {
        this.tipoIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacion.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Define el valor de la propiedad identificacion.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIdentificacion(String value) {
        this.identificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad clave.
     *
     * @return possible object is {@link String }
     *
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellido.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Define el valor de la propiedad primerApellido.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPrimerApellido(String value) {
        this.primerApellido = value;
    }
}
