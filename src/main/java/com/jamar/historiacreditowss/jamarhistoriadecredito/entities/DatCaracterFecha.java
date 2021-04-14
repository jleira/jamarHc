package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_CARACTER_FECHA database table.
 *
 */
@Entity
@Table(name = "DAT_CARACTER_FECHA")
@NamedQuery(name = "DatCaracterFecha.findAll", query = "SELECT d FROM DatCaracterFecha d")
@XmlRootElement
public class DatCaracterFecha implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_CARACTER_FECHA_ID_GENERATOR", sequenceName = "SQ_DAT_CARACTER_FECHA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_CARACTER_FECHA_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "SALDO_DEUDA_TOTAL_MORA")
    private String saldoDeudaTotalMora;

    //bi-directional many-to-one association to DatCuentaAnalisisVectore
    @ManyToOne
    @JoinColumn(name = "ID_CUENTA_ANALISIS_VECTORES")
    private DatCuentaAnalisisVectore datCuentaAnalisisVectore;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatMorasMaxima
    @ManyToOne
    @JoinColumn(name = "ID_MORAS_MAXIMAS")
    private DatMorasMaxima datMorasMaxima;

    public DatCaracterFecha() {
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

    public String getSaldoDeudaTotalMora() {
        return this.saldoDeudaTotalMora;
    }

    public void setSaldoDeudaTotalMora(String saldoDeudaTotalMora) {
        this.saldoDeudaTotalMora = saldoDeudaTotalMora;
    }

    public DatCuentaAnalisisVectore getDatCuentaAnalisisVectore() {
        return this.datCuentaAnalisisVectore;
    }

    public void setDatCuentaAnalisisVectore(DatCuentaAnalisisVectore datCuentaAnalisisVectore) {
        this.datCuentaAnalisisVectore = datCuentaAnalisisVectore;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatMorasMaxima getDatMorasMaxima() {
        return this.datMorasMaxima;
    }

    public void setDatMorasMaxima(DatMorasMaxima datMorasMaxima) {
        this.datMorasMaxima = datMorasMaxima;
    }

}
