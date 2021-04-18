/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamar.historiacreditowss.jamarhistoriadecredito.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author jleira
 */
public class DictumSolicitud {
    @JsonProperty( "c_emp")
    private String cEmp;
    private String origen;    
    private String clave;    
    private String identificacion;    
    private String primerApellido;    
    private String producto;    
    private int    tipoIdentificacion;
    private String usuario;
    @JsonProperty( "STRAID")
    private String sTraId;
    @JsonProperty( "STRNAM")
    private String sTrNam;
    @JsonProperty( "FR_INGRESO")
    private String frIngreso;
    @JsonProperty( "FR_TASA_USURA")
    private String frTasaUsura;
    @JsonProperty( "FR_SEGMENTO_1")
    private String frSegmento1;
    @JsonProperty( "FR_FORMATO")
    private String frFormato;
    @JsonProperty( "URLSOAPSERVICE")
    private String urlSoapService;

    public DictumSolicitud() {
    }

    public String getcEmp() {
        return cEmp;
    }

    public void setcEmp(String cEmp) {
        this.cEmp = cEmp;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(int tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getsTraId() {
        return sTraId;
    }

    public void setsTraId(String sTraId) {
        this.sTraId = sTraId;
    }

    public String getsTrNam() {
        return sTrNam;
    }

    public void setsTrNam(String sTrNam) {
        this.sTrNam = sTrNam;
    }

    public String getFrIngreso() {
        return frIngreso;
    }

    public void setFrIngreso(String frIngreso) {
        this.frIngreso = frIngreso;
    }

    public String getFrTasaUsura() {
        return frTasaUsura;
    }

    public void setFrTasaUsura(String frTasaUsura) {
        this.frTasaUsura = frTasaUsura;
    }

    public String getFrSegmento1() {
        return frSegmento1;
    }

    public void setFrSegmento1(String frSegmento1) {
        this.frSegmento1 = frSegmento1;
    }

    public String getFrFormato() {
        return frFormato;
    }

    public void setFrFormato(String frFormato) {
        this.frFormato = frFormato;
    }

    public String getUrlSoapService() {
        return urlSoapService;
    }

    public void setUrlSoapService(String urlSoapService) {
        this.urlSoapService = urlSoapService;
    }
}