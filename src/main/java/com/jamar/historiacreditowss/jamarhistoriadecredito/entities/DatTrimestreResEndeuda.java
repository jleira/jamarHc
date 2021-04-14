package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_TRIMESTRE_RES_ENDEUDA database table.
 *
 */
@Entity
@Table(name = "DAT_TRIMESTRE_RES_ENDEUDA")
@NamedQuery(name = "DatTrimestreResEndeuda.findAll", query = "SELECT d FROM DatTrimestreResEndeuda d")
@XmlRootElement
public class DatTrimestreResEndeuda implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_TRIMESTRE_RES_ENDEUDA_ID_GENERATOR", sequenceName = "SQ_DAT_TRIMESTRE_RES_ENDEUDA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_TRIMESTRE_RES_ENDEUDA_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    //bi-directional many-to-one association to DatCarteraSecResEnd
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datTrimestreResEndeuda")
    private List<DatCarteraSecResEnd> datCarteraSecResEnds;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatInfoAgregada
    @ManyToOne
    @JoinColumn(name = "ID_INFO_AGREGADA")
    private DatInfoAgregada datInfoAgregada;

    public DatTrimestreResEndeuda() {
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

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public List<DatCarteraSecResEnd> getDatCarteraSecResEnds() {
        return this.datCarteraSecResEnds;
    }

    public void setDatCarteraSecResEnds(List<DatCarteraSecResEnd> datCarteraSecResEnds) {
        this.datCarteraSecResEnds = datCarteraSecResEnds;
    }

    public DatCarteraSecResEnd addDatCarteraSecResEnd(DatCarteraSecResEnd datCarteraSecResEnd) {
        getDatCarteraSecResEnds().add(datCarteraSecResEnd);
        datCarteraSecResEnd.setDatTrimestreResEndeuda(this);

        return datCarteraSecResEnd;
    }

    public DatCarteraSecResEnd removeDatCarteraSecResEnd(DatCarteraSecResEnd datCarteraSecResEnd) {
        getDatCarteraSecResEnds().remove(datCarteraSecResEnd);
        datCarteraSecResEnd.setDatTrimestreResEndeuda(null);

        return datCarteraSecResEnd;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatInfoAgregada getDatInfoAgregada() {
        return this.datInfoAgregada;
    }

    public void setDatInfoAgregada(DatInfoAgregada datInfoAgregada) {
        this.datInfoAgregada = datInfoAgregada;
    }

}
