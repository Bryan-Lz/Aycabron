/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD_4;

import javax.swing.JOptionPane;

/**
 *
 *
 */
public class PEX {

    public static void main(String[] args) {
        int a, b, c, d, may = 0;
        String n1, n2, n3, n4;
        n1 = JOptionPane.showInputDialog("Ingresa el primer nombre");
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de " + n1 + ": "));

        n2 = JOptionPane.showInputDialog("Ingresa el segundo nombre");
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de " + n2 + ": "));

        n3 = JOptionPane.showInputDialog("Ingresa el tercer nombre");
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de " + n3 + ": "));

        n4 = JOptionPane.showInputDialog("Ingresa el cuarto nombre");
        d = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de " + n4 + ": "));

        // se necesita saber si son todos iguales, son 2 o 3 iguales o solo hay uno mayor
        /*
        10, 10, 10, 10 - todos iguales a
        
        10, 10, 10 ,1   b
        10, 10, 1, 10   c
        10, 1, 10, 10   d
        1, 10, 10, 10   e
        
        
        -  tres iguales, 4 casos
        
        10, 10, 1, 2    f
        10, 1, 10, 2    g
        10, 1, 2, 10    h
        1, 10,10, 2     i
        1, 10, 2 10     j
        1, 2, 10, 10    k
        
        - dos iguales, 6 casos
        
        10, 1, 2, 3     l
        1, 10, 2 ,3     m
        1, 2, 10, 3     n
        1, 2, 3, 10     o
        - uno mayor, 4 casos
        
        total: 15 casos
        
        a = 10
        b = 2
        c = 15
        d = 3
         */
       may = a;
       
       if (b > may){
           may = b;
       }
       
       if (c > may){
           may = c;
       }
       
       if (d > may){
           may = d;
       }
       
       int mayores = 0;
       String mensaje = "";
       if( a == may){
           mayores++;
           mensaje += n1 +", "+a+" años.\n";
       }
       
       if( b == may){
           mayores++;
           mensaje += n2 + ", " + b + " años.\n";

       }
       
       if( c == may){
           mayores++;
           mensaje += n3 + ", " + c + " años.\n";

       }
       
       if(d == may){
           mayores++;
           mensaje += n4 + ", " + d + " años.\n";

       }
       
       if( mayores == 1){
           JOptionPane.showMessageDialog(null,"La persona con mayor edad es:\n "+mensaje);
       }else{
            JOptionPane.showMessageDialog(null,"Las persona con mayor edad son:\n "+mensaje);

       }
    }
}
