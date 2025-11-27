/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD_4;

import javax.swing.JOptionPane;

/**
 *
 * Costo de platillo personal 95, si el numero de personas es mayor a 200, pero
 * menor o igual a 300 o 200<x<=300 el costo es de 85. Para mas de 300 personas
 * el costo es de 75 por persona
 * entrada: numero de personas
 * salida: total que se va a pagar
 */
public class P5 {
    public static void main(String[] args) {
        int p = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de personas"));
        int f;
        if(200<p&&p<=300){
            f = p*85;
        }else if( p >300){
            f = p*75;
        }else{
            f = p*95;
        }
        
        JOptionPane.showMessageDialog(null, "EL precio final es de "+f);
    }
}
