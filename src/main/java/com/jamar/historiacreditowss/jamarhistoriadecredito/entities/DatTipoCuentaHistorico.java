package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_TIPO_CUENTA_HISTORICO database table.
 *
 */
@Entity
@Table(name = "DAT_TIPO_CUENTA_HISTORICO")
@NamedQuery(name = "DatTipoCuentaHistorico.findAll", query = "SELECT d FROM DatTipoCuentaHistorico d")
@XmlRootElement
public class DatTipoCuentaHistorico implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_TIPO_CUENTA_HISTORICO_ID_GENERATOR", sequenceName = "SQ_DAT_TIPO_CUENTA_HISTORICO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_TIPO_CUENTA_HISTORICO_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private String tipo;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatInfoAgregada
    @ManyToOne
    @JoinColumn(name = "ID_INFO_AGREGADA")
    private DatInfoAgregada datInfoAgregada;

    //bi-directional many-to-one association to DatTrimestreHistorico
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datTipoCuentaHistorico")
    private List<DatTrimestreHistorico> datTrimestreHistoricos;

    public DatTipoCuentaHistorico() {
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

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @XmlTransient
    public List<DatTrimestreHistorico> getDatTrimestreHistoricos() {
        return this.datTrimestreHistoricos;
    }

    public void setDatTrimestreHistoricos(List<DatTrimestreHistorico> datTrimestreHistoricos) {
        this.datTrimestreHistoricos = datTrimestreHistoricos;
    }

    public DatTrimestreHistorico addDatTrimestreHistorico(DatTrimestreHistorico datTrimestreHistorico) {
        getDatTrimestreHistoricos().add(datTrimestreHistorico);
        datTrimestreHistorico.setDatTipoCuentaHistorico(this);

        return datTrimestreHistorico;
    }

    public DatTrimestreHistorico removeDatTrimestreHistorico(DatTrimestreHistorico datTrimestreHistorico) {
        getDatTrimestreHistoricos().remove(datTrimestreHistorico);
        datTrimestreHistorico.setDatTipoCuentaHistorico(null);

        return datTrimestreHistorico;
    }

}
