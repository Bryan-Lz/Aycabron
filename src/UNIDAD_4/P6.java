/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD_4;

import javax.swing.JOptionPane;

/**
 *
 * La sociadad de uvas quiere ponerle precio a la uva que se clasifia en tipos A y B,
 * y en tamaños 1 y 2. Cuando se realiza la venta del producto es de un solo tipo
 * y tamaño, se requiere determinar cuanto recibira un productor por la uva que se
 * entrega en un embarque considerando lo siguiente: si es de tipo A se le cargan 
 * 20c al precio inicial cuando des de tamaño 1 y 30c si es de tamaño 2. A las de 
 * tipo b se rebajan 30c cuando es de tamaño 1 y 50c cuando son de tamaño 2
 * 
 * A1 +20c
 * A2 +30c
 * B1 -30
 * B2 -50
 */
public class P6 {
    public static void main(String[] args) {
        String type;
        int size;
        double precioKg, kgProduccion, ganancia;
         
            type = JOptionPane.showInputDialog("Ingresa el tipo de uva:");
            size = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño de uva"));
            precioKg = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio por kilo: "));
            kgProduccion = Double.parseDouble(JOptionPane.showInputDialog("Ingresa los kilos producidos: "));
            
            if(type == "A"){
            switch (size) {
                case 1:
                    precioKg += .2;
                    break;
                case 2:
                    precioKg += .3;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ese tamaño de uva no existe");
                    break;
            }
                
            }else if(type == "B"){
            switch (size) {
                case 1:
                    precioKg -= .3;
                    break;
                case 2:
                    precioKg -= .5;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ese tamaño de uva no existe");
                    break;
            }
            }else{
                JOptionPane.showMessageDialog(null, "Ese tipo de uva no existe");
            }
            ganancia = precioKg * kgProduccion;
            
            JOptionPane.showMessageDialog(null,"La ganancia total es de: "+ganancia);
            
    }
}
