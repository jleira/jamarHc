package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_RESPUESTA_PERS_LINEA database table.
 *
 */ 
@Entity
@Table(name = "dat_hist_cred_resp_pers")
@NamedQuery(name = "DatDictum.findAll", query = "SELECT d FROM DatDictum d")
@XmlRootElement
public class DatDictum  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_RESPUESTA_DICTUM_LINEA_ID_GENERATOR", sequenceName = "Seq_dat_hist_cred_resp_pers_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_RESPUESTA_DICTUM_LINEA_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;


    private String valor;

    private String llave;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    public DatDictum() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCEmp() {
        return this.cEmp;
    }

    public void setCEmp(String cEmp) {
        this.cEmp = cEmp;
    }


    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

	public String getLlave() {
		return llave;
	}

	public void setLlave(String llave) {
		this.llave = llave;
	}
}
