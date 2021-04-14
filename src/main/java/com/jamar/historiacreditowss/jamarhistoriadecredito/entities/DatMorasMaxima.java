package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_MORAS_MAXIMAS database table.
 *
 */
@Entity
@Table(name = "DAT_MORAS_MAXIMAS")
@NamedQuery(name = "DatMorasMaxima.findAll", query = "SELECT d FROM DatMorasMaxima d")
@XmlRootElement
public class DatMorasMaxima implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_MORAS_MAXIMAS_ID_GENERATOR", sequenceName = "SQ_DAT_MORAS_MAXIMAS")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_MORAS_MAXIMAS_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    //bi-directional many-to-one association to DatCaracterFecha
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datMorasMaxima")
    private List<DatCaracterFecha> datCaracterFechas;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatSectorAnalisisVectore
    @ManyToOne
    @JoinColumn(name = "ID_SECTOR_ANALISIS_VECTORES")
    private DatSectorAnalisisVectore datSectorAnalisisVectore;

    public DatMorasMaxima() {
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
    public List<DatCaracterFecha> getDatCaracterFechas() {
        return this.datCaracterFechas;
    }

    public void setDatCaracterFechas(List<DatCaracterFecha> datCaracterFechas) {
        this.datCaracterFechas = datCaracterFechas;
    }

    public DatCaracterFecha addDatCaracterFecha(DatCaracterFecha datCaracterFecha) {
        getDatCaracterFechas().add(datCaracterFecha);
        datCaracterFecha.setDatMorasMaxima(this);

        return datCaracterFecha;
    }

    public DatCaracterFecha removeDatCaracterFecha(DatCaracterFecha datCaracterFecha) {
        getDatCaracterFechas().remove(datCaracterFecha);
        datCaracterFecha.setDatMorasMaxima(null);

        return datCaracterFecha;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatSectorAnalisisVectore getDatSectorAnalisisVectore() {
        return this.datSectorAnalisisVectore;
    }

    public void setDatSectorAnalisisVectore(DatSectorAnalisisVectore datSectorAnalisisVectore) {
        this.datSectorAnalisisVectore = datSectorAnalisisVectore;
    }

}
