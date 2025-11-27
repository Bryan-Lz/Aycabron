/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD_4;

import javax.swing.JOptionPane;

/**
 *
 *  a todos los trajes que tengan un precio superior a 2500 se les aplica un 
 * descuento del 15, a todos los demas solo del 8%.
 * Salida: precio final, descuento
 */
public class P4 {
    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del traje"));
        double f,d;
        if(x>2500){
            d = x*.15;
        }else{
            d = x*.08;
        }
        f = x - d;
        JOptionPane.showMessageDialog(null, "EL precio final es de "+f+"\nTuviste un descuento de: "+d);
    }
}
