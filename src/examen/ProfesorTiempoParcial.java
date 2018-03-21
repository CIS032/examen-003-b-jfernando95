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
public class ProfesorTiempoParcial extends Profesor {
    
    private int horasSemanales;

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }
    
    public ProfesorTiempoParcial() {
    }

    public ProfesorTiempoParcial(String cedula, String nombre, String apellido, int horasClase, String carrera) {
        super(cedula, nombre, apellido, horasClase, carrera);
    }

    
    @Override
    public int horasComplementarias() {
        return getHorasSemanales() - getHorasClase();
    }

    @Override
    public String toString() {
        return super.toString() + horasSemanales + horasComplementarias();
    }
    
    
}
