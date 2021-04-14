package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_USUARIO database table.
 *
 */
@Entity
@Table(name = "DAT_USUARIO")
@NamedQuery(name = "DatUsuario.findAll", query = "SELECT d FROM DatUsuario d")
@XmlRootElement
public class DatUsuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_USUARIO_ID_GENERATOR", sequenceName = "SQ_DAT_USUARIO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_USUARIO_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "TIPO_USUARIO")
    private String tipoUsuario;

    //bi-directional many-to-one association to DatCuentaUsuario
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datUsuario")
    private List<DatCuentaUsuario> datCuentaUsuarios;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatTipoCuentaEndActual
    @ManyToOne
    @JoinColumn(name = "ID_TIPO_CUENTA_END_ACTUAL")
    private DatTipoCuentaEndActual datTipoCuentaEndActual;

    public DatUsuario() {
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

    public String getTipoUsuario() {
        return this.tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @XmlTransient
    public List<DatCuentaUsuario> getDatCuentaUsuarios() {
        return this.datCuentaUsuarios;
    }

    public void setDatCuentaUsuarios(List<DatCuentaUsuario> datCuentaUsuarios) {
        this.datCuentaUsuarios = datCuentaUsuarios;
    }

    public DatCuentaUsuario addDatCuentaUsuario(DatCuentaUsuario datCuentaUsuario) {
        getDatCuentaUsuarios().add(datCuentaUsuario);
        datCuentaUsuario.setDatUsuario(this);

        return datCuentaUsuario;
    }

    public DatCuentaUsuario removeDatCuentaUsuario(DatCuentaUsuario datCuentaUsuario) {
        getDatCuentaUsuarios().remove(datCuentaUsuario);
        datCuentaUsuario.setDatUsuario(null);

        return datCuentaUsuario;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatTipoCuentaEndActual getDatTipoCuentaEndActual() {
        return this.datTipoCuentaEndActual;
    }

    public void setDatTipoCuentaEndActual(DatTipoCuentaEndActual datTipoCuentaEndActual) {
        this.datTipoCuentaEndActual = datTipoCuentaEndActual;
    }

}
