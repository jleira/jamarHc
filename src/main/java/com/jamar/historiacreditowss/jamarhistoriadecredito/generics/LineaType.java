/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamar.historiacreditowss.jamarhistoriadecredito.generics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>
 * Java class for anonymous complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="consecutivo" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class LineaType {

    @XmlAttribute(required = true)
    protected int consecutivo;
    @XmlValue
    protected String value;

    /**
     * Gets the value of the consecutivo property.
     *
     * @return
     */
    public int getConsecutivo() {
        return consecutivo;
    }

    /**
     * Sets the value of the consecutivo property.
     *
     * @param value
     */
    public void setConsecutivo(int value) {
        this.consecutivo = value;
    }

    /**
     * Gets the value of the inner value.
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the inner value.
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }
}