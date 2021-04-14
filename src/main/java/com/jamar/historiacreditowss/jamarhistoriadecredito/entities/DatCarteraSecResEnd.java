package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_CARTERA_SEC_RES_END database table.
 *
 */
@Entity
@Table(name = "DAT_CARTERA_SEC_RES_END")
@NamedQuery(name = "DatCarteraSecResEnd.findAll", query = "SELECT d FROM DatCarteraSecResEnd d")
@XmlRootElement
public class DatCarteraSecResEnd implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_CARTERA_SEC_RES_END_ID_GENERATOR", sequenceName = "SQ_DAT_CARTERA_SEC_RES_END")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_CARTERA_SEC_RES_END_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "CODIGO_SECTOR")
    private BigDecimal codigoSector;

    @Column(name = "GARANTIA_ADMISIBLE")
    private BigDecimal garantiaAdmisible;

    @Column(name = "GARANTIA_OTRO")
    private BigDecimal garantiaOtro;

    private String sector;

    //bi-directional many-to-one association to DatCartera
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datCarteraSecResEnd")
    private List<DatCartera> datCarteras;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatTrimestreResEndeuda
    @ManyToOne
    @JoinColumn(name = "ID_TRIMESTRE_RES_ENDEUDAMIENTO")
    private DatTrimestreResEndeuda datTrimestreResEndeuda;

    public DatCarteraSecResEnd() {
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

    public BigDecimal getCodigoSector() {
        return this.codigoSector;
    }

    public void setCodigoSector(BigDecimal codigoSector) {
        this.codigoSector = codigoSector;
    }

    public BigDecimal getGarantiaAdmisible() {
        return this.garantiaAdmisible;
    }

    public void setGarantiaAdmisible(BigDecimal garantiaAdmisible) {
        this.garantiaAdmisible = garantiaAdmisible;
    }

    public BigDecimal getGarantiaOtro() {
        return this.garantiaOtro;
    }

    public void setGarantiaOtro(BigDecimal garantiaOtro) {
        this.garantiaOtro = garantiaOtro;
    }

    public String getSector() {
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @XmlTransient
    public List<DatCartera> getDatCarteras() {
        return this.datCarteras;
    }

    public void setDatCarteras(List<DatCartera> datCarteras) {
        this.datCarteras = datCarteras;
    }

    public DatCartera addDatCartera(DatCartera datCartera) {
        getDatCarteras().add(datCartera);
        datCartera.setDatCarteraSecResEnd(this);

        return datCartera;
    }

    public DatCartera removeDatCartera(DatCartera datCartera) {
        getDatCarteras().remove(datCartera);
        datCartera.setDatCarteraSecResEnd(null);

        return datCartera;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatTrimestreResEndeuda getDatTrimestreResEndeuda() {
        return this.datTrimestreResEndeuda;
    }

    public void setDatTrimestreResEndeuda(DatTrimestreResEndeuda datTrimestreResEndeuda) {
        this.datTrimestreResEndeuda = datTrimestreResEndeuda;
    }

}
