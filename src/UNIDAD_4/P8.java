/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD_4;

import javax.swing.JOptionPane;

/**
 *
Práctica 8. La política de la compañía telefónica "chimefón" es: "Chismea + x -". 
* Cuando se realiza una llamada, el cobro es por el tiempo que ésta dura, de tal 
* forma que los primeros cinco minutos cuestan $ 1.00 c/u, los siguientes tres, 
* 804 c/u, los siguientes dos minutos, 70¢ c/u, y a partir del décimo minuto, 
* 50¢ c/u. Además, se carga un impuesto de 3 % cuando es domingo, y si es día hábil,
* en turno matutino, 15 %, y en turno vespertino, 10 %. Realice un algoritmo para 
* determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.
Al analizar el problema se puede identificar que será necesario conocer como datos
* la duración de la llamada, así como el día y turno en que se realiza. Con base 
* en esto se podrá determinar cuál será el pago que se efectuará por el tiempo que
* dura la llamada y el impuesto que deberá pagar en función del día y del turno en
* que se realiza. La siguiente tabla muestra las variables que se van a utilizar.
* 
* cobro por tiempo
* primeros 5min 70c cu
* siguientes 3 80c cu
* siguientes 2 70c
* del 10 en adelante 50c cu
* 
* si es domingo se añade un 3% al total
* dia habil en turno matutino 15%
* en turno vespertino 10%
* 
 */
public class P8 {
    public static void main(String[] args) {
        int tiempo, turno;
        double pagoInicial=0, impuestos, total;
        String dia;
        tiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tiempo de la llamada:"));
        dia = JOptionPane.showInputDialog("Ingresa el dia de la llamada");
        turno = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la hora en formato de 24 horas sin puntuacion. Ej(4:00 pm = 1600)"));
        
        if(tiempo <= 5){
            pagoInicial = tiempo * .70;
        }else if(tiempo <= 8){
            pagoInicial = 3.5 + (tiempo-5)*.80 + 3.5;
        }else if(tiempo <= 10){
            pagoInicial = 5.1 + (tiempo-8)*.70;
        }else if(tiempo >10){
            pagoInicial = 7.3 + (tiempo-10)*.5;
        }
        
        
        if(turno <1200){//turno matutino
            impuestos = pagoInicial*0.15;
            total = pagoInicial + impuestos;
        }else{
            impuestos = pagoInicial*0.1;
            total = pagoInicial + impuestos;
        }
        if(dia.equals("domingo")){
            total += pagoInicial + (pagoInicial*0.03);
        }
        
        JOptionPane.showMessageDialog(null,"Aqui tiene el recibo por su llamada:\n\n"
                                                       +"Pago Inicial: "+pagoInicial
                                                       +"\nImpuestos: "+impuestos
                                                       +"\nTotal: "+total);
    }
}
