package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_RAZON database table.
 *
 */
@Entity
@Table(name = "DAT_RAZON")
@NamedQuery(name = "DatRazon.findAll", query = "SELECT d FROM DatRazon d")
@XmlRootElement
public class DatRazon implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_RAZON_ID_GENERATOR", sequenceName = "SQ_DAT_RAZON")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_RAZON_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private String codigo;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatScore
    @ManyToOne
    @JoinColumn(name = "ID_SCORE")
    private DatScore datScore;

    public DatRazon() {
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

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatScore getDatScore() {
        return this.datScore;
    }

    public void setDatScore(DatScore datScore) {
        this.datScore = datScore;
    }

}
