package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_TRIMESTRE_DEUDA_MICRO database table.
 *
 */
@Entity
@Table(name = "DAT_TRIMESTRE_DEUDA_MICRO")
@NamedQuery(name = "DatTrimestreDeudaMicro.findAll", query = "SELECT d FROM DatTrimestreDeudaMicro d")
@XmlRootElement
public class DatTrimestreDeudaMicro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_TRIMESTRE_DEUDA_MICRO_ID_GENERATOR", sequenceName = "SQ_DAT_TRIMESTRE_DEUDA_MICRO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_TRIMESTRE_DEUDA_MICRO_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    //bi-directional many-to-one association to DatEvolDeudaMicrocredito
    @ManyToOne
    @JoinColumn(name = "ID_EVOL_DEUDA_MICROCREDITO")
    private DatEvolDeudaMicrocredito datEvolDeudaMicrocredito2;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    public DatTrimestreDeudaMicro() {
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

    public DatEvolDeudaMicrocredito getDatEvolDeudaMicrocredito2() {
        return this.datEvolDeudaMicrocredito2;
    }

    public void setDatEvolDeudaMicrocredito2(DatEvolDeudaMicrocredito datEvolDeudaMicrocredito2) {
        this.datEvolDeudaMicrocredito2 = datEvolDeudaMicrocredito2;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

}
