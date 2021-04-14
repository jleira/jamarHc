package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_EVOLUCION_DEUDA_SECTOR database table.
 *
 */
@Entity
@Table(name = "DAT_EVOLUCION_DEUDA_SECTOR")
@NamedQuery(name = "DatEvolucionDeudaSector.findAll", query = "SELECT d FROM DatEvolucionDeudaSector d")
@XmlRootElement
public class DatEvolucionDeudaSector implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_EVOLUCION_DEUDA_SECTOR_ID_GENERATOR", sequenceName = "SQ_DAT_EVOLUCION_DEUDA_SECTOR")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_EVOLUCION_DEUDA_SECTOR_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "COD_SECTOR")
    private BigDecimal codSector;

    @Column(name = "NOMBRE_SECTOR")
    private String nombreSector;

    //bi-directional many-to-one association to DatEvolDeudaMicrocredito
    @ManyToOne
    @JoinColumn(name = "ID_EVOL_DEUDA_MICROCREDITO")
    private DatEvolDeudaMicrocredito datEvolDeudaMicrocredito;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatEvolDeudaTipoCuenta
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datEvolucionDeudaSector")
    private List<DatEvolDeudaTipoCuenta> datEvolDeudaTipoCuentas;

    public DatEvolucionDeudaSector() {
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

    public String getNombreSector() {
        return this.nombreSector;
    }

    public void setNombreSector(String nombreSector) {
        this.nombreSector = nombreSector;
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

    @XmlTransient
    public List<DatEvolDeudaTipoCuenta> getDatEvolDeudaTipoCuentas() {
        return this.datEvolDeudaTipoCuentas;
    }

    public void setDatEvolDeudaTipoCuentas(List<DatEvolDeudaTipoCuenta> datEvolDeudaTipoCuentas) {
        this.datEvolDeudaTipoCuentas = datEvolDeudaTipoCuentas;
    }

    public DatEvolDeudaTipoCuenta addDatEvolDeudaTipoCuenta(DatEvolDeudaTipoCuenta datEvolDeudaTipoCuenta) {
        getDatEvolDeudaTipoCuentas().add(datEvolDeudaTipoCuenta);
        datEvolDeudaTipoCuenta.setDatEvolucionDeudaSector(this);

        return datEvolDeudaTipoCuenta;
    }

    public DatEvolDeudaTipoCuenta removeDatEvolDeudaTipoCuenta(DatEvolDeudaTipoCuenta datEvolDeudaTipoCuenta) {
        getDatEvolDeudaTipoCuentas().remove(datEvolDeudaTipoCuenta);
        datEvolDeudaTipoCuenta.setDatEvolucionDeudaSector(null);

        return datEvolDeudaTipoCuenta;
    }

}
