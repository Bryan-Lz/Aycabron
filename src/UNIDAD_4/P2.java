/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD_4;

import javax.swing.JOptionPane;

/**
 *
 * @author lpmmc
 */
public class P2 {
    public static void main(String[] args) {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero"));
        String mensaje;
        if(n>0){
            mensaje = "positivo";
        }else if(n<0){
            mensaje = "negativo";
            
        }else{
            mensaje = "cero";
        }
         
        JOptionPane.showMessageDialog(null, "El numero es "+mensaje);
    }
 
}
