/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD_4;

import javax.swing.JOptionPane;

/**
 *
 * 1 2 3 1 2 3 1¿2 3 1 2 3 1 2 3 1 2 3 1 2 3 
 * 123123123123123123123123123123
 *         ^    ^    ^
 * 1:
 *      
 */
public class PEX3 {
    public static void main(String[] args) {
        int n, p, last=0, next=0; 
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero n entre 1 y 3"));
        p = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero p"));

        
        if(p == 0){
            last = n;
            next = n;
        }else{
            int r = p%3;
            switch (r) {
                case 0:
                    // EL RESIDUO ES 0 - multiplo de 3
                        last = n;
                        next = n;
                    
                    break;
                case 1:
                switch (n) {
                    case 1:
                        last = 3;
                        next = 2;
                        break;
                    case 2:
                        last = 1;
                        next = 3;
                        break;
                    case 3:
                        last = 2;
                        next = 1;
                        break;
                    default:
                        break;
                }
                    break;

                case 2:
                switch (n) {
                    case 1:
                        last = 2;
                        next = 3;
                        break;
                    case 2:
                        last = 3;
                        next = 1;
                        break;
                    case 3:
                        last = 1;
                        next = 2;
                        break;
                    default:
                        break;
                }
                    break;

                default:
                    throw new AssertionError();
            }
        }
        
        

        JOptionPane.showMessageDialog(null,"Anterior: "+last+" Siguiente: "+next);
    }
}
