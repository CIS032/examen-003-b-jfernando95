/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Ferchitoo
 */
@Entity
@Table(name = "PROFESOR", catalog = "", schema = "ADMINISTRADOR")
@NamedQueries({
    @NamedQuery(name = "Profesor_1.findAll", query = "SELECT p FROM Profesor_1 p")
    , @NamedQuery(name = "Profesor_1.findByCedula", query = "SELECT p FROM Profesor_1 p WHERE p.cedula = :cedula")
    , @NamedQuery(name = "Profesor_1.findByNombres", query = "SELECT p FROM Profesor_1 p WHERE p.nombres = :nombres")
    , @NamedQuery(name = "Profesor_1.findByApellidos", query = "SELECT p FROM Profesor_1 p WHERE p.apellidos = :apellidos")
    , @NamedQuery(name = "Profesor_1.findByHorasClase", query = "SELECT p FROM Profesor_1 p WHERE p.horasClase = :horasClase")
    , @NamedQuery(name = "Profesor_1.findByCarrera", query = "SELECT p FROM Profesor_1 p WHERE p.carrera = :carrera")
    , @NamedQuery(name = "Profesor_1.findByTipoProfesor", query = "SELECT p FROM Profesor_1 p WHERE p.tipoProfesor = :tipoProfesor")
    , @NamedQuery(name = "Profesor_1.findByHorasSemanales", query = "SELECT p FROM Profesor_1 p WHERE p.horasSemanales = :horasSemanales")
    , @NamedQuery(name = "Profesor_1.findByHorasComplementarias", query = "SELECT p FROM Profesor_1 p WHERE p.horasComplementarias = :horasComplementarias")})
public class Profesor_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CEDULA")
    private String cedula;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "HORAS_CLASE")
    @Temporal(TemporalType.TIME)
    private Date horasClase;
    @Column(name = "CARRERA")
    private String carrera;
    @Column(name = "TIPO_PROFESOR")
    private String tipoProfesor;
    @Column(name = "HORAS_SEMANALES")
    private Integer horasSemanales;
    @Column(name = "HORAS_COMPLEMENTARIAS")
    private Boolean horasComplementarias;

    public Profesor_1() {
    }

    public Profesor_1(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        String oldCedula = this.cedula;
        this.cedula = cedula;
        changeSupport.firePropertyChange("cedula", oldCedula, cedula);
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        String oldNombres = this.nombres;
        this.nombres = nombres;
        changeSupport.firePropertyChange("nombres", oldNombres, nombres);
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        String oldApellidos = this.apellidos;
        this.apellidos = apellidos;
        changeSupport.firePropertyChange("apellidos", oldApellidos, apellidos);
    }

    public Date getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(Date horasClase) {
        Date oldHorasClase = this.horasClase;
        this.horasClase = horasClase;
        changeSupport.firePropertyChange("horasClase", oldHorasClase, horasClase);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        String oldCarrera = this.carrera;
        this.carrera = carrera;
        changeSupport.firePropertyChange("carrera", oldCarrera, carrera);
    }

    public String getTipoProfesor() {
        return tipoProfesor;
    }

    public void setTipoProfesor(String tipoProfesor) {
        String oldTipoProfesor = this.tipoProfesor;
        this.tipoProfesor = tipoProfesor;
        changeSupport.firePropertyChange("tipoProfesor", oldTipoProfesor, tipoProfesor);
    }

    public Integer getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(Integer horasSemanales) {
        Integer oldHorasSemanales = this.horasSemanales;
        this.horasSemanales = horasSemanales;
        changeSupport.firePropertyChange("horasSemanales", oldHorasSemanales, horasSemanales);
    }

    public Boolean getHorasComplementarias() {
        return horasComplementarias;
    }

    public void setHorasComplementarias(Boolean horasComplementarias) {
        Boolean oldHorasComplementarias = this.horasComplementarias;
        this.horasComplementarias = horasComplementarias;
        changeSupport.firePropertyChange("horasComplementarias", oldHorasComplementarias, horasComplementarias);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesor_1)) {
            return false;
        }
        Profesor_1 other = (Profesor_1) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "examen.Profesor_1[ cedula=" + cedula + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
