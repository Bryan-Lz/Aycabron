/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD_4;

import javax.swing.JOptionPane;

/**
 * El director de una escuela esta organizando un viaje de estudios y requiere determinar
 * cuanto debe cobrar a cada alumno y cuanto debe pagar a la compañia de viajes por el 
 * servicio. La manera de cobrar es: si son 100 alumnos o mas, el costo por alumno es de 65,
 * si son de 50 a 99 alumnos, el costo es de 70, de 30 a 49 de 95, y si son menos de 30,
 * el costo de la renta del autobus es de 4000 sin importar el numero de alumnos
 * 
 */
public class P7 {
    public static void main(String[] args) {
        int CA,PA,TOT;
        
        CA = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de alumnos:"));
        
        if(CA>=100){
            PA = 65;
        }else if(CA>=50 && CA<=99){
            PA = 70;
        }else if(CA>=30 && CA<=49){
            PA = 95;
        }else{
            PA = 4000 / CA;
        }
        TOT = PA * CA;
        
        JOptionPane.showMessageDialog(null,"El pago por alumno es de: "+PA+"\nEl pago total es de: "+TOT);
    }
}
