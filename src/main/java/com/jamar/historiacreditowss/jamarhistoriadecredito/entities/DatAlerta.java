package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_ALERTA database table.
 *
 */
@Entity
@Table(name = "DAT_ALERTA")
@NamedQuery(name = "DatAlerta.findAll", query = "SELECT d FROM DatAlerta d")
@XmlRootElement
public class DatAlerta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_ALERTA_ID_GENERATOR", sequenceName = "SQ_DAT_ALERTA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_ALERTA_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private String codigo;

    @Temporal(TemporalType.DATE)
    private Date colocacion;

    @Column(name = "FUENTE_CODIGO")
    private String fuenteCodigo;

    @Column(name = "FUENTE_NOMBRE")
    private String fuenteNombre;

    private String llave;

    @Temporal(TemporalType.DATE)
    private Date modificacion;

    private String texto;

    @Temporal(TemporalType.DATE)
    private Date vencimiento;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    public DatAlerta() {
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

    public Date getColocacion() {
        return this.colocacion;
    }

    public void setColocacion(Date colocacion) {
        this.colocacion = colocacion;
    }

    public String getFuenteCodigo() {
        return this.fuenteCodigo;
    }

    public void setFuenteCodigo(String fuenteCodigo) {
        this.fuenteCodigo = fuenteCodigo;
    }

    public String getFuenteNombre() {
        return this.fuenteNombre;
    }

    public void setFuenteNombre(String fuenteNombre) {
        this.fuenteNombre = fuenteNombre;
    }

    public String getLlave() {
        return this.llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public Date getModificacion() {
        return this.modificacion;
    }

    public void setModificacion(Date modificacion) {
        this.modificacion = modificacion;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getVencimiento() {
        return this.vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

}
