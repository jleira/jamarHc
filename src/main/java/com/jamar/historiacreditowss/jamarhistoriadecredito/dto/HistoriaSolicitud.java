/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamar.historiacreditowss.jamarhistoriadecredito.dto;

/**
 *
 * @author jleira
 */
public class HistoriaSolicitud {
     private String c_emp;    
    private String origen;    
    private String clave;    
    private String identificacion;    
    private String primerApellido;    
    private String producto;    
    private int    tipoIdentificacion;    
    private String usuario;    
    private String URLSOAPSERVICE;  

    public HistoriaSolicitud() {
    }
    
    

    public String getC_emp() {
        return c_emp;
    }

    public void setC_emp(String c_emp) {
        this.c_emp = c_emp;
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

    public String getURLSOAPSERVICE() {
        return URLSOAPSERVICE;
    }

    public void setURLSOAPSERVICE(String URLSOAPSERVICE) {
        this.URLSOAPSERVICE = URLSOAPSERVICE;
    }
    
    
}
