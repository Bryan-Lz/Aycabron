/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD_4;

import javax.swing.JOptionPane;

/**
 *
 * 
Práctica 10. "El náufrago satisfecho" ofrece hamburguesas sencillas, dobles y triples, 
* las cuales tienen un costo de $20.00, $25.00 y $28.00 respectivamente. 
* La empresa acepta tarjetas de crédito con un cargo de 5% sobre la compra. 
* Suponiendo que los clientes adquieren sólo un tipo de hamburguesa, realice un 
* algoritmo para determinar cuánto debe pagar una persona por N hamburguesas.
 */
public class P10 {
    public static void main(String[] args) {
        String tipoH;
        double costoH,semitotal, cargo, total;
        int nHamburguesas;
        
        tipoH = JOptionPane.showInputDialog("Ingresa el tipo de hamburguesa");
        switch (tipoH) {
            case "sencilla":
                costoH = 20.0;
                break;
            case "doble":
                costoH = 25.0;
                break;
            case "triple":
                costoH = 28.0;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Ese tipo no existe");
                costoH = 0.0;
                break;
        }
        if(costoH!=0){
        nHamburguesas = Integer.parseInt(JOptionPane.showInputDialog("cuantas hamburguesas de ese tipo necesitas?:"));
        semitotal = nHamburguesas * costoH;
        cargo = semitotal + semitotal*.05;
        total = semitotal + cargo;
        
        JOptionPane.showMessageDialog(null,
                "A continuacion se desglosa su compra:\n"+
                        "Semitotal: "+semitotal+
                        "Cargo: "+cargo+
                        "Total: "+total);
        }
        
    }
}
