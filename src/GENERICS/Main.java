/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GENERICS;

/**
 *
 * @author royum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Caja<String> cajaString = new Caja<>();
        cajaString.ponerAlgo("HOLA, VISCA BARCA.");
        String contenido = cajaString.obtenerAlgo();
        
        System.out.println("El contenido es: "+contenido);
        
        Caja<Integer> cajaEnteros = new Caja<>();
        cajaEnteros.ponerAlgo(1899);
        Integer numero = cajaEnteros.obtenerAlgo();
        
        System.out.println("\nEl contenido es: "+numero);
        
    }
    
}
