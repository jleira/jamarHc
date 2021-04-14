package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_TIPO_CUENTA_PORTAFOLIO database table.
 *
 */
@Entity
@Table(name = "DAT_TIPO_CUENTA_PORTAFOLIO")
@NamedQuery(name = "DatTipoCuentaPortafolio.findAll", query = "SELECT d FROM DatTipoCuentaPortafolio d")
@XmlRootElement
public class DatTipoCuentaPortafolio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_TIPO_CUENTA_PORTAFOLIO_ID_GENERATOR", sequenceName = "SQ_DAT_TIPO_CUENTA_PORTAFOLIO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_TIPO_CUENTA_PORTAFOLIO_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "CALIDAD_DEUDOR")
    private String calidadDeudor;

    private BigDecimal cantidad;

    private BigDecimal porcentaje;

    private String tipo;

    //bi-directional many-to-one association to DatEstadoPortafolio
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datTipoCuentaPortafolio")
    private List<DatEstadoPortafolio> datEstadoPortafolios;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatInfoAgregada
    @ManyToOne
    @JoinColumn(name = "ID_INFO_AGREGADA")
    private DatInfoAgregada datInfoAgregada;

    public DatTipoCuentaPortafolio() {
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

    public String getCalidadDeudor() {
        return this.calidadDeudor;
    }

    public void setCalidadDeudor(String calidadDeudor) {
        this.calidadDeudor = calidadDeudor;
    }

    public BigDecimal getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPorcentaje() {
        return this.porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @XmlTransient
    public List<DatEstadoPortafolio> getDatEstadoPortafolios() {
        return this.datEstadoPortafolios;
    }

    public void setDatEstadoPortafolios(List<DatEstadoPortafolio> datEstadoPortafolios) {
        this.datEstadoPortafolios = datEstadoPortafolios;
    }

    public DatEstadoPortafolio addDatEstadoPortafolio(DatEstadoPortafolio datEstadoPortafolio) {
        getDatEstadoPortafolios().add(datEstadoPortafolio);
        datEstadoPortafolio.setDatTipoCuentaPortafolio(this);

        return datEstadoPortafolio;
    }

    public DatEstadoPortafolio removeDatEstadoPortafolio(DatEstadoPortafolio datEstadoPortafolio) {
        getDatEstadoPortafolios().remove(datEstadoPortafolio);
        datEstadoPortafolio.setDatTipoCuentaPortafolio(null);

        return datEstadoPortafolio;
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
