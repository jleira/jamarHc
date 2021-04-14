package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_SERIES database table.
 *
 */
@Entity
@Table(name = "DAT_SERIES")
@NamedQuery(name = "DatSery.findAll", query = "SELECT d FROM DatSery d")
@XmlRootElement
public class DatSery implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_SERIES_ID_GENERATOR", sequenceName = "SQ_DAT_SERIES")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_SERIES_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private String serie;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatInfoAgregadaMicrocred
    @ManyToOne
    @JoinColumn(name = "ID_INFO_AGREGADA_MICROCREDITO")
    private DatInfoAgregadaMicrocred datInfoAgregadaMicrocred;

    //bi-directional many-to-one association to DatValor
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datSery")
    private List<DatValor> datValors;

    public DatSery() {
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

    public String getSerie() {
        return this.serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
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
    public List<DatValor> getDatValors() {
        return this.datValors;
    }

    public void setDatValors(List<DatValor> datValors) {
        this.datValors = datValors;
    }

    public DatValor addDatValor(DatValor datValor) {
        getDatValors().add(datValor);
        datValor.setDatSery(this);

        return datValor;
    }

    public DatValor removeDatValor(DatValor datValor) {
        getDatValors().remove(datValor);
        datValor.setDatSery(null);

        return datValor;
    }

}
