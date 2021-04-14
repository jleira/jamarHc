package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_SUBTIPO database table.
 *
 */
@Entity
@Table(name = "DAT_SUBTIPO")
@NamedQuery(name = "DatSubtipo.findAll", query = "SELECT d FROM DatSubtipo d")
@XmlRootElement
public class DatSubtipo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_SUBTIPO_ID_GENERATOR", sequenceName = "SQ_DAT_SUBTIPO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_SUBTIPO_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private String codigo;

    private String nombre;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatReclamo
    @ManyToOne
    @JoinColumn(name = "ID_RECLAMO_INFORME")
    private DatReclamo datReclamo;

    public DatSubtipo() {
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

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatReclamo getDatReclamo() {
        return this.datReclamo;
    }

    public void setDatReclamo(DatReclamo datReclamo) {
        this.datReclamo = datReclamo;
    }

}
