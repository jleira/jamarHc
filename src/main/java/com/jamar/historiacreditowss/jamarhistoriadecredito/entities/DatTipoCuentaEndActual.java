package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_TIPO_CUENTA_END_ACTUAL database table.
 *
 */
@Entity
@Table(name = "DAT_TIPO_CUENTA_END_ACTUAL")
@NamedQuery(name = "DatTipoCuentaEndActual.findAll", query = "SELECT d FROM DatTipoCuentaEndActual d")
@XmlRootElement
public class DatTipoCuentaEndActual implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_TIPO_CUENTA_END_ACTUAL_ID_GENERATOR", sequenceName = "SQ_DAT_TIPO_CUENTA_END_ACTUAL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_TIPO_CUENTA_END_ACTUAL_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "TIPO_CUENTA")
    private String tipoCuenta;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatSectorEndeudaActual
    @ManyToOne
    @JoinColumn(name = "ID_SECTOR_ENDEUDA_ACTUAL")
    private DatSectorEndeudaActual datSectorEndeudaActual;

    //bi-directional many-to-one association to DatUsuario
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datTipoCuentaEndActual")
    private List<DatUsuario> datUsuarios;

    public DatTipoCuentaEndActual() {
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

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatSectorEndeudaActual getDatSectorEndeudaActual() {
        return this.datSectorEndeudaActual;
    }

    public void setDatSectorEndeudaActual(DatSectorEndeudaActual datSectorEndeudaActual) {
        this.datSectorEndeudaActual = datSectorEndeudaActual;
    }

    @XmlTransient
    public List<DatUsuario> getDatUsuarios() {
        return this.datUsuarios;
    }

    public void setDatUsuarios(List<DatUsuario> datUsuarios) {
        this.datUsuarios = datUsuarios;
    }

    public DatUsuario addDatUsuario(DatUsuario datUsuario) {
        getDatUsuarios().add(datUsuario);
        datUsuario.setDatTipoCuentaEndActual(this);

        return datUsuario;
    }

    public DatUsuario removeDatUsuario(DatUsuario datUsuario) {
        getDatUsuarios().remove(datUsuario);
        datUsuario.setDatTipoCuentaEndActual(null);

        return datUsuario;
    }

}
