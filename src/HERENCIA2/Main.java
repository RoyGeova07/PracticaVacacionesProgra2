/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HERENCIA2;

/**
 *
 * @author royum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // aqui se creal el objeto instanciando
        Auto a = new Auto(true,"Toyota","XD","ABC123");

        // sin no heredamos cuando llamemos a  'a' del objeto, solo tendremos acesso a los atributos de 
        // Auto y no de Vehiculo, pero cuando heredamos de en la clase de Auto, 'Vehiculo', ahora cuando llamemos
        // a 'a' tendra los atributos de Vehiculo.
        Moto m = new Moto();
        a.acelerar();
        m.hacerWheliee();
        System.out.println(a);
        
    }

}
