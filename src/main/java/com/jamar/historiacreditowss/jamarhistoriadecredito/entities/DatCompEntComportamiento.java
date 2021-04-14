package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_COMP_ENT_COMPORTAMIENTO database table.
 *
 */
@Entity
@Table(name = "DAT_COMP_ENT_COMPORTAMIENTO")
@NamedQuery(name = "DatCompEntComportamiento.findAll", query = "SELECT d FROM DatCompEntComportamiento d")
@XmlRootElement
public class DatCompEntComportamiento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_COMP_ENT_COMPORTAMIENTO_ID_GENERATOR", sequenceName = "SQ_DAT_COMP_ENT_COMPORTAMIENTO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_COMP_ENT_COMPORTAMIENTO_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Temporal(TemporalType.DATE)
    private Date mes;

    private String valor;

    //bi-directional many-to-one association to DatComportamientoEntidade
    @ManyToOne
    @JoinColumn(name = "ID_COMPORTAMIENTO_ENTIDADES")
    private DatComportamientoEntidade datComportamientoEntidade;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    public DatCompEntComportamiento() {
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

    public Date getMes() {
        return this.mes;
    }

    public void setMes(Date mes) {
        this.mes = mes;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public DatComportamientoEntidade getDatComportamientoEntidade() {
        return this.datComportamientoEntidade;
    }

    public void setDatComportamientoEntidade(DatComportamientoEntidade datComportamientoEntidade) {
        this.datComportamientoEntidade = datComportamientoEntidade;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

}
