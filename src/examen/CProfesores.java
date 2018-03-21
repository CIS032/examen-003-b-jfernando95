/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;

public class CProfesores {
    
    
    private ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
    private ArrayList<Profesor> listaProfesoresNedioTiempo = new ArrayList<Profesor>();
    private ArrayList<Profesor> listaProfesoresTiempoParcial = new ArrayList<Profesor>();
    private ArrayList<Profesor> listaProfesoresTiempoCompleto = new ArrayList<Profesor>();
    
    public CProfesores () {
        listaProfesoresNedioTiempo.add(new ProfesorMedioTiempo("1738597436", "Jose Francisco","Espiñoza Sarango",5, "Sistemas"));
        listaProfesoresTiempoParcial.add(new ProfesorTiempoCompleto("2345677364", "Juan","Castillo", 4,"Geología"));
//        listaProfesoresTiempoCompleto.add(new ProfesorTiempoParcial(24, "2748364796","Jhones","Ston", 12, "Electromecanica"));
    }

}
