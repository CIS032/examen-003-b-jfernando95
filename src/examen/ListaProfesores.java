/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author OrixStranger
 */
public class ListaProfesores {

    static void add(Profesor p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ArrayList<Profesor> lista = new ArrayList<>();

    public void agregar(Profesor profesor) {
        lista.add(profesor);
    }

    public void menu(int x) {
        if (x == 1) {
            JOptionPane.showMessageDialog(null, "PROFESOR TIEMPO COMPLETO");
        }
        if (x == 2) {
            JOptionPane.showMessageDialog(null, "PROFESOR MEDIO TIEMPO");
        }
        if (x == 3) {
            JOptionPane.showMessageDialog(null, "PROFESOR TIEMPO PARCIAL");
        }
    }

    public void grabar() {
        try {
            FileWriter FILE = new FileWriter("C://Users//OrixStranger//Documents//NetBeansProjects//ListaProfesores//archivo.txt");
            PrintWriter pr = new PrintWriter(FILE, true);
            for (Profesor profesor : lista) {
                if (profesor instanceof ProfesorTiempoParcial) {
                    ProfesorTiempoParcial ptp = (ProfesorTiempoParcial) profesor;
                    pr.print(ptp.getCedula() + ptp.getNombre() + ptp.getApellido() + "Profesor tiempo parcial" + ptp.getHorasClase() + ptp.horasComplementarias());
                }
                if (profesor instanceof ProfesorMedioTiempo) {
                    ProfesorMedioTiempo pmt = (ProfesorMedioTiempo) profesor;
                    pr.print(pmt.getCedula() + pmt.getNombre() + pmt.getApellido() + "Profesor tiempo parcial" + pmt.getHorasClase() + pmt.horasComplementarias());
                }
                if (profesor instanceof ProfesorTiempoCompleto) {
                    ProfesorTiempoCompleto ptc = (ProfesorTiempoCompleto) profesor;
                    pr.print(ptc.getCedula() + ptc.getNombre() + ptc.getApellido() + "Profesor tiempo parcial" + ptc.getHorasClase() + ptc.horasComplementarias());
                }
            }
            pr.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }

    
}
