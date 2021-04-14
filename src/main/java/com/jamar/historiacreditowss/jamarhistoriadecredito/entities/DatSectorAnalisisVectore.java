package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_SECTOR_ANALISIS_VECTORES database table.
 *
 */
@Entity
@Table(name = "DAT_SECTOR_ANALISIS_VECTORES")
@NamedQuery(name = "DatSectorAnalisisVectore.findAll", query = "SELECT d FROM DatSectorAnalisisVectore d")
@XmlRootElement
public class DatSectorAnalisisVectore implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_SECTOR_ANALISIS_VECTORES_ID_GENERATOR", sequenceName = "SQ_DAT_SECTOR_ANALI_VECTORES")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_SECTOR_ANALISIS_VECTORES_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "NOMBRE_SECTOR")
    private String nombreSector;

    //bi-directional many-to-one association to DatCuentaAnalisisVectore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datSectorAnalisisVectore")
    private List<DatCuentaAnalisisVectore> datCuentaAnalisisVectores;

    //bi-directional many-to-one association to DatMorasMaxima
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datSectorAnalisisVectore")
    private List<DatMorasMaxima> datMorasMaximas;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatInfoAgregadaMicrocred
    @ManyToOne
    @JoinColumn(name = "ID_INFO_AGREGADA_MICROCREDITO")
    private DatInfoAgregadaMicrocred datInfoAgregadaMicrocred;

    public DatSectorAnalisisVectore() {
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

    public String getNombreSector() {
        return this.nombreSector;
    }

    public void setNombreSector(String nombreSector) {
        this.nombreSector = nombreSector;
    }

    @XmlTransient
    public List<DatCuentaAnalisisVectore> getDatCuentaAnalisisVectores() {
        return this.datCuentaAnalisisVectores;
    }

    public void setDatCuentaAnalisisVectores(List<DatCuentaAnalisisVectore> datCuentaAnalisisVectores) {
        this.datCuentaAnalisisVectores = datCuentaAnalisisVectores;
    }

    public DatCuentaAnalisisVectore addDatCuentaAnalisisVectore(DatCuentaAnalisisVectore datCuentaAnalisisVectore) {
        getDatCuentaAnalisisVectores().add(datCuentaAnalisisVectore);
        datCuentaAnalisisVectore.setDatSectorAnalisisVectore(this);

        return datCuentaAnalisisVectore;
    }

    public DatCuentaAnalisisVectore removeDatCuentaAnalisisVectore(DatCuentaAnalisisVectore datCuentaAnalisisVectore) {
        getDatCuentaAnalisisVectores().remove(datCuentaAnalisisVectore);
        datCuentaAnalisisVectore.setDatSectorAnalisisVectore(null);

        return datCuentaAnalisisVectore;
    }

    @XmlTransient
    public List<DatMorasMaxima> getDatMorasMaximas() {
        return this.datMorasMaximas;
    }

    public void setDatMorasMaximas(List<DatMorasMaxima> datMorasMaximas) {
        this.datMorasMaximas = datMorasMaximas;
    }

    public DatMorasMaxima addDatMorasMaxima(DatMorasMaxima datMorasMaxima) {
        getDatMorasMaximas().add(datMorasMaxima);
        datMorasMaxima.setDatSectorAnalisisVectore(this);

        return datMorasMaxima;
    }

    public DatMorasMaxima removeDatMorasMaxima(DatMorasMaxima datMorasMaxima) {
        getDatMorasMaximas().remove(datMorasMaxima);
        datMorasMaxima.setDatSectorAnalisisVectore(null);

        return datMorasMaxima;
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

}
