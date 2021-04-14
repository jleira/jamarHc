package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_SECTOR_ENDEUDA_ACTUAL database table.
 *
 */
@Entity
@Table(name = "DAT_SECTOR_ENDEUDA_ACTUAL")
@NamedQuery(name = "DatSectorEndeudaActual.findAll", query = "SELECT d FROM DatSectorEndeudaActual d")
@XmlRootElement
public class DatSectorEndeudaActual implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_SECTOR_ENDEUDA_ACTUAL_ID_GENERATOR", sequenceName = "SQ_DAT_SECTOR_ENDEUDA_ACTUAL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_SECTOR_ENDEUDA_ACTUAL_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "COD_SECTOR")
    private BigDecimal codSector;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatInfoAgregadaMicrocred
    @ManyToOne
    @JoinColumn(name = "ID_INFO_AGREGADA_MICROCREDITO")
    private DatInfoAgregadaMicrocred datInfoAgregadaMicrocred;

    //bi-directional many-to-one association to DatTipoCuentaEndActual
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datSectorEndeudaActual")
    private List<DatTipoCuentaEndActual> datTipoCuentaEndActuals;

    public DatSectorEndeudaActual() {
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

    public BigDecimal getCodSector() {
        return this.codSector;
    }

    public void setCodSector(BigDecimal codSector) {
        this.codSector = codSector;
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
    public List<DatTipoCuentaEndActual> getDatTipoCuentaEndActuals() {
        return this.datTipoCuentaEndActuals;
    }

    public void setDatTipoCuentaEndActuals(List<DatTipoCuentaEndActual> datTipoCuentaEndActuals) {
        this.datTipoCuentaEndActuals = datTipoCuentaEndActuals;
    }

    public DatTipoCuentaEndActual addDatTipoCuentaEndActual(DatTipoCuentaEndActual datTipoCuentaEndActual) {
        getDatTipoCuentaEndActuals().add(datTipoCuentaEndActual);
        datTipoCuentaEndActual.setDatSectorEndeudaActual(this);

        return datTipoCuentaEndActual;
    }

    public DatTipoCuentaEndActual removeDatTipoCuentaEndActual(DatTipoCuentaEndActual datTipoCuentaEndActual) {
        getDatTipoCuentaEndActuals().remove(datTipoCuentaEndActual);
        datTipoCuentaEndActual.setDatSectorEndeudaActual(null);

        return datTipoCuentaEndActual;
    }

}
