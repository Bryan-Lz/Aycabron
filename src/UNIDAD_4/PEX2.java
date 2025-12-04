/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD_4;

import javax.swing.JOptionPane;

/**
 *
 * Escribe un programa que lea cuatro años e imprima cuántos días tendrá febrero en esos años.
 */
public class PEX2 {
    public static void main(String[] args) {
        int a, b, c, d;
        boolean ab, bb, cb, db;
        String mensaje = "";
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer año:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo año:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tercer año:"));
        d = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el cuarto año:"));
        
        // bisiesto: ((año%4=0)y(año%100<>0))o(año%400=0)
        
        // checar si cada año es bisiesto
        ab = (a%4==0)&&(a%100!=0)||(a%400==0);
        bb = (b%4==0)&&(b%100!=0)||(b%400==0);
        cb = (c%4==0)&&(c%100!=0)||(c%400==0);
        db = (d%4==0)&&(d%100!=0)||(d%400==0);
        
        if(ab){
            mensaje += a+": 29, ";
        }else{
            mensaje += a+": 28, ";
        }
        if(bb){
            mensaje += b+": 29, ";
        }else{
            mensaje += b+": 28, ";
        }
        if(cb){
            mensaje += c+": 29, ";
        }else{
            mensaje += c+": 28, ";
        }
        if(db){
            mensaje += d+": 29, ";
        }else{
            mensaje += d+": 28, ";
        }
        
        JOptionPane.showMessageDialog(null,"Los dias en febrero de cada año son: "+mensaje);
    }
}
