/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author OrixStranger
 */
public abstract class Profesor {
    private String cedula;
    private String nombre;
    private String apellido;
    private int horasClase;
    private String carrera;
    private String tipoProfesor;
    private int horas_semanales;
    private int horas_complementarias;

    public Profesor() {
        
    }

    public Profesor(String cedula, String nombre, String apellido, int horasClase, String carrera, String tipoProfesor, int horas_semanales, int horas_complementarias) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasClase = horasClase;
        this.carrera = carrera;
        this.tipoProfesor = tipoProfesor;
        this.horas_semanales = horas_semanales;
        this.horas_complementarias = horas_complementarias;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getTipoProfesor() {
        return tipoProfesor;
    }

    public void setTipoProfesor(String tipoProfesor) {
        this.tipoProfesor = tipoProfesor;
    }

    public int getHoras_semanales() {
        return horas_semanales;
    }

    public void setHoras_semanales(int horas_semanales) {
        this.horas_semanales = horas_semanales;
    }

    public int getHoras_complementarias() {
        return horas_complementarias;
    }

    public void setHoras_complementarias(int horas_complementarias) {
        this.horas_complementarias = horas_complementarias;
    }

    
   
    public abstract int horasComplementarias();
    
    
}
