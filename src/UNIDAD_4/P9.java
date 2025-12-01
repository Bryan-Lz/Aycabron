/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD_4;

import javax.swing.JOptionPane;

/**
 *
 * Práctica 9. Una compañía de viajes tiene tres tipos de autobuses (A, B y C)
 * con costos por kilómetro por persona de $2.0, $2.5 y $3.0. Se debe calcular
 * el costo total y el costo por persona del viaje. Si hay menos de 20 personas,
 * se cobra como si fueran 20.
 *
 */
public class P9 {

    public static void main(String[] args) {
        String tipoBus;
        Double precioPersona, precioTotal, kilometros, precioKm;
        int nPersonas, nAux;

        tipoBus = JOptionPane.showInputDialog("Ingresa el tipo de autobus:");
        switch (tipoBus) {
            case "A":
                precioKm = 2.0;
                break;
            case "B":
                precioKm = 2.5;
                break;
            case "C":
                precioKm = 3.0;
            default:
                JOptionPane.showMessageDialog(null, "Ese autobus no existe");
                precioKm = 0.0;
        }

        nPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de personas:"));
        if (nPersonas < 20) {
            nAux = 20;
        } else {
            nAux = nPersonas;
        }
        
        kilometros = Double.parseDouble(JOptionPane.showInputDialog("Ingresa los kilometros a recorrer:"));

        precioPersona = precioKm * kilometros;
        precioTotal = precioPersona * nAux;
        
        JOptionPane.showMessageDialog(null,"El precio por persona es de: "+precioPersona+
                                                       "\nEl precio total es de"+ precioTotal);
    }
}
