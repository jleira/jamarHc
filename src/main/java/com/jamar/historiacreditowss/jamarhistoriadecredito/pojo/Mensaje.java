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
 *         &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actor" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "response",
    "code",
    "description",
    "actor"
})
@XmlRootElement(name = "message")
public class Mensaje {

    protected boolean response;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String actor;
    protected Long id_informe;
    protected Long arbolesdictom;
    public Long getArbolesdictom() {
		return arbolesdictom;
	}

	public void setArbolesdictom(Long arbolesdictom) {
		this.arbolesdictom = arbolesdictom;
	}

	public Long getId_informe() {
		return id_informe;
	}

	public void setId_informe(Long id_informe) {
		this.id_informe = id_informe;
	}

	protected Long id_preselecta;

    public Long getId_preselecta() {
		return id_preselecta;
	}

	public void setId_preselecta(Long id_preselecta) {
		this.id_preselecta = id_preselecta;
	}

	/**
     * Obtiene el valor de la propiedad response.
     *
     * @return possible object is {@link Boolean }
     * 
     */
    public boolean isResponse() {
        return response;
    }

    /**
     * Define el valor de la propiedad response.
     *
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setResponse(boolean value) {
        this.response = value;
    }

    /**
     * Obtiene el valor de la propiedad code.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad actor.
     *
     * @return possible object is {@link String }
     *
     */
    public String getActor() {
        return actor;
    }

    /**
     * Define el valor de la propiedad actor.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setActor(String value) {
        this.actor = value;
    }
}