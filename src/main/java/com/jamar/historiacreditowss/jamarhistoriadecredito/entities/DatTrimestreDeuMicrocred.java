package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_TRIMESTRE_DEU_MICROCRED database table.
 *
 */
@Entity
@Table(name = "DAT_TRIMESTRE_DEU_MICROCRED")
@NamedQuery(name = "DatTrimestreDeuMicrocred.findAll", query = "SELECT d FROM DatTrimestreDeuMicrocred d")
@XmlRootElement
public class DatTrimestreDeuMicrocred implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_TRIMESTRE_DEU_MICROCRED_ID_GENERATOR", sequenceName = "SQ_DAT_TRIMESTRE_DEU_MICROCRED")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_TRIMESTRE_DEU_MICROCRED_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private String trimestre;

    //bi-directional many-to-one association to DatEvolDeudaMicrocredito
    @ManyToOne
    @JoinColumn(name = "ID_EVOL_DEUDA_MICR0")
    private DatEvolDeudaMicrocredito datEvolDeudaMicrocredito;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    public DatTrimestreDeuMicrocred() {
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

    public String getTrimestre() {
        return this.trimestre;
    }

    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }

    public DatEvolDeudaMicrocredito getDatEvolDeudaMicrocredito() {
        return this.datEvolDeudaMicrocredito;
    }

    public void setDatEvolDeudaMicrocredito(DatEvolDeudaMicrocredito datEvolDeudaMicrocredito) {
        this.datEvolDeudaMicrocredito = datEvolDeudaMicrocredito;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

}
