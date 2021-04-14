package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_EVOL_DEUDA_MICROCREDITO database table.
 *
 */
@Entity
@Table(name = "DAT_EVOL_DEUDA_MICROCREDITO")
@NamedQuery(name = "DatEvolDeudaMicrocredito.findAll", query = "SELECT d FROM DatEvolDeudaMicrocredito d")
@XmlRootElement
public class DatEvolDeudaMicrocredito implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_EVOL_DEUDA_MICROCREDITO_ID_GENERATOR", sequenceName = "SQ_DAT_EVOL_DEUDA_MICROCREDITO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_EVOL_DEUDA_MICROCREDITO_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    //bi-directional many-to-one association to DatEvolucionDeudaSector
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datEvolDeudaMicrocredito")
    private List<DatEvolucionDeudaSector> datEvolucionDeudaSectors;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatInfoAgregadaMicrocred
    @ManyToOne
    @JoinColumn(name = "ID_INFO_AGREGADA_MICROCREDITO")
    private DatInfoAgregadaMicrocred datInfoAgregadaMicrocred;

    //bi-directional many-to-one association to DatTrimestreDeudaMicro
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datEvolDeudaMicrocredito2")
    private List<DatTrimestreDeudaMicro> datTrimestreDeudaMicros2;

    //bi-directional many-to-one association to DatTrimestreDeuMicrocred
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datEvolDeudaMicrocredito")
    private List<DatTrimestreDeuMicrocred> datTrimestreDeuMicrocreds;

    public DatEvolDeudaMicrocredito() {
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

    @XmlTransient
    public List<DatEvolucionDeudaSector> getDatEvolucionDeudaSectors() {
        return this.datEvolucionDeudaSectors;
    }

    public void setDatEvolucionDeudaSectors(List<DatEvolucionDeudaSector> datEvolucionDeudaSectors) {
        this.datEvolucionDeudaSectors = datEvolucionDeudaSectors;
    }

    public DatEvolucionDeudaSector addDatEvolucionDeudaSector(DatEvolucionDeudaSector datEvolucionDeudaSector) {
        getDatEvolucionDeudaSectors().add(datEvolucionDeudaSector);
        datEvolucionDeudaSector.setDatEvolDeudaMicrocredito(this);

        return datEvolucionDeudaSector;
    }

    public DatEvolucionDeudaSector removeDatEvolucionDeudaSector(DatEvolucionDeudaSector datEvolucionDeudaSector) {
        getDatEvolucionDeudaSectors().remove(datEvolucionDeudaSector);
        datEvolucionDeudaSector.setDatEvolDeudaMicrocredito(null);

        return datEvolucionDeudaSector;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatInfoAgregadaMicrocred getDatInfoAgregadaMicrocred() {
        return this.datInfoAgregadaMicrocred;
    }

    public void setDatInfoAgregadaMicrocred(DatInfoAgregadaMicrocred datInfoAgregadaMicrocred) {
        this.datInfoAgregadaMicrocred = datInfoAgregadaMicrocred;
    }

    @XmlTransient
    public List<DatTrimestreDeudaMicro> getDatTrimestreDeudaMicros2() {
        return this.datTrimestreDeudaMicros2;
    }

    public void setDatTrimestreDeudaMicros2(List<DatTrimestreDeudaMicro> datTrimestreDeudaMicros2) {
        this.datTrimestreDeudaMicros2 = datTrimestreDeudaMicros2;
    }

    public DatTrimestreDeudaMicro addDatTrimestreDeudaMicros2(DatTrimestreDeudaMicro datTrimestreDeudaMicros2) {
        getDatTrimestreDeudaMicros2().add(datTrimestreDeudaMicros2);
        datTrimestreDeudaMicros2.setDatEvolDeudaMicrocredito2(this);

        return datTrimestreDeudaMicros2;
    }

    public DatTrimestreDeudaMicro removeDatTrimestreDeudaMicros2(DatTrimestreDeudaMicro datTrimestreDeudaMicros2) {
        getDatTrimestreDeudaMicros2().remove(datTrimestreDeudaMicros2);
        datTrimestreDeudaMicros2.setDatEvolDeudaMicrocredito2(null);

        return datTrimestreDeudaMicros2;
    }

    @XmlTransient
    public List<DatTrimestreDeuMicrocred> getDatTrimestreDeuMicrocreds() {
        return this.datTrimestreDeuMicrocreds;
    }

    public void setDatTrimestreDeuMicrocreds(List<DatTrimestreDeuMicrocred> datTrimestreDeuMicrocreds) {
        this.datTrimestreDeuMicrocreds = datTrimestreDeuMicrocreds;
    }

    public DatTrimestreDeuMicrocred addDatTrimestreDeuMicrocred(DatTrimestreDeuMicrocred datTrimestreDeuMicrocred) {
        getDatTrimestreDeuMicrocreds().add(datTrimestreDeuMicrocred);
        datTrimestreDeuMicrocred.setDatEvolDeudaMicrocredito(this);

        return datTrimestreDeuMicrocred;
    }

    public DatTrimestreDeuMicrocred removeDatTrimestreDeuMicrocred(DatTrimestreDeuMicrocred datTrimestreDeuMicrocred) {
        getDatTrimestreDeuMicrocreds().remove(datTrimestreDeuMicrocred);
        datTrimestreDeuMicrocred.setDatEvolDeudaMicrocredito(null);

        return datTrimestreDeuMicrocred;
    }

}
