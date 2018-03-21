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
public class ProfesorMedioTiempo extends Profesor {

    int HORAS_SEMANALES = 20;

    public ProfesorMedioTiempo(String cedula, String nombre, String apellido, int horasClase, String carrera) {
        super(cedula, nombre, apellido, horasClase, carrera);
    }
    
    @Override
    public int horasComplementarias() {
        return HORAS_SEMANALES - getHorasClase();
    }

    @Override
    public String toString() {
        return super.toString() + HORAS_SEMANALES + horasComplementarias();
    }
    
}
