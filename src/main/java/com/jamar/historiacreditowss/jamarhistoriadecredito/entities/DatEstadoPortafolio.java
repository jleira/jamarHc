package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_ESTADO_PORTAFOLIO database table.
 *
 */
@Entity
@Table(name = "DAT_ESTADO_PORTAFOLIO")
@NamedQuery(name = "DatEstadoPortafolio.findAll", query = "SELECT d FROM DatEstadoPortafolio d")
@XmlRootElement
public class DatEstadoPortafolio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_ESTADO_PORTAFOLIO_ID_GENERATOR", sequenceName = "SQ_DAT_ESTADO_PORTAFOLIO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_ESTADO_PORTAFOLIO_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private BigDecimal cantidad;

    private String codigo;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatTipoCuentaPortafolio
    @ManyToOne
    @JoinColumn(name = "ID_TIPO_CUENTA")
    private DatTipoCuentaPortafolio datTipoCuentaPortafolio;

    public DatEstadoPortafolio() {
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

    public BigDecimal getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatTipoCuentaPortafolio getDatTipoCuentaPortafolio() {
        return this.datTipoCuentaPortafolio;
    }

    public void setDatTipoCuentaPortafolio(DatTipoCuentaPortafolio datTipoCuentaPortafolio) {
        this.datTipoCuentaPortafolio = datTipoCuentaPortafolio;
    }

}
