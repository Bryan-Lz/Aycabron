/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD_4;

import javax.swing.JOptionPane;

/**
 *
 * Realica un programa para determinar cuanto se debe pagar por
 * x cantidad de lapices considerando que si son 1000 o mas el costo es de
 * 85 centavos, de lo contrario el precio es de 90c
 */
public class P3 {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de lapices:"));
        double c;
        if(x>=1000){
            c = x*.85;
        }else{
            c = x*.90;
        }
        
        JOptionPane.showMessageDialog(null,"El costo total es de: "+c);
    }
}
