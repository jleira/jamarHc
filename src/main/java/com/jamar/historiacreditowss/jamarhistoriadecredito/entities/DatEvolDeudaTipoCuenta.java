package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_EVOL_DEUDA_TIPO_CUENTA database table.
 *
 */
@Entity
@Table(name = "DAT_EVOL_DEUDA_TIPO_CUENTA")
@NamedQuery(name = "DatEvolDeudaTipoCuenta.findAll", query = "SELECT d FROM DatEvolDeudaTipoCuenta d")
@XmlRootElement
public class DatEvolDeudaTipoCuenta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_EVOL_DEUDA_TIPO_CUENTA_ID_GENERATOR", sequenceName = "SQ_DAT_EVOL_DEUDA_TIPO_CUENTA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_EVOL_DEUDA_TIPO_CUENTA_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "TIPO_CUENTA")
    private String tipoCuenta;

    //bi-directional many-to-one association to DatEvolucionDeudaSector
    @ManyToOne
    @JoinColumn(name = "ID_EVOLUCION_DEUDA_SECTOR")
    private DatEvolucionDeudaSector datEvolucionDeudaSector;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatEvolValorTrimestre
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datEvolDeudaTipoCuenta")
    private List<DatEvolValorTrimestre> datEvolValorTrimestres;

    public DatEvolDeudaTipoCuenta() {
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

    public String getTipoCuenta() {
        return this.tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public DatEvolucionDeudaSector getDatEvolucionDeudaSector() {
        return this.datEvolucionDeudaSector;
    }

    public void setDatEvolucionDeudaSector(DatEvolucionDeudaSector datEvolucionDeudaSector) {
        this.datEvolucionDeudaSector = datEvolucionDeudaSector;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    @XmlTransient
    public List<DatEvolValorTrimestre> getDatEvolValorTrimestres() {
        return this.datEvolValorTrimestres;
    }

    public void setDatEvolValorTrimestres(List<DatEvolValorTrimestre> datEvolValorTrimestres) {
        this.datEvolValorTrimestres = datEvolValorTrimestres;
    }

    public DatEvolValorTrimestre addDatEvolValorTrimestre(DatEvolValorTrimestre datEvolValorTrimestre) {
        getDatEvolValorTrimestres().add(datEvolValorTrimestre);
        datEvolValorTrimestre.setDatEvolDeudaTipoCuenta(this);

        return datEvolValorTrimestre;
    }

    public DatEvolValorTrimestre removeDatEvolValorTrimestre(DatEvolValorTrimestre datEvolValorTrimestre) {
        getDatEvolValorTrimestres().remove(datEvolValorTrimestre);
        datEvolValorTrimestre.setDatEvolDeudaTipoCuenta(null);

        return datEvolValorTrimestre;
    }

}
