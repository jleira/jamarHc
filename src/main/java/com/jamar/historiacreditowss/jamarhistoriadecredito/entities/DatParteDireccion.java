package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_PARTE_DIRECCION database table.
 *
 */
@Entity
@Table(name = "DAT_PARTE_DIRECCION")
@NamedQuery(name = "DatParteDireccion.findAll", query = "SELECT d FROM DatParteDireccion d")
@XmlRootElement
public class DatParteDireccion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_PARTE_DIRECCION_ID_GENERATOR", sequenceName = "SQ_DAT_PARTE_DIRECCION")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_PARTE_DIRECCION_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private String codigo;

    private String tipo;

    private String valor;

    //bi-directional many-to-one association to DatDireccione
    @ManyToOne
    @JoinColumn(name = "ID_DIRECCION")
    private DatDireccione datDireccione;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    public DatParteDireccion() {
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

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public DatDireccione getDatDireccione() {
        return this.datDireccione;
    }

    public void setDatDireccione(DatDireccione datDireccione) {
        this.datDireccione = datDireccione;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

}
