/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arraylist;

import java.util.ArrayList;

/**
 *
 * @author royum
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a1 = new Auto("ABC123", "Verde");
        Auto a2 = new Auto("DEF456", "Rojo");
        Auto a3 = new Auto("GHI789", "Azul");     
        
// las listas tambien son objetos
        ArrayList<Auto> misAutos = new ArrayList<>();
        
        //                      tamanio en 0
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        
        System.out.println("-------------------");
        

        // carro 1
        misAutos.add(a1);
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        
        System.out.println("-------------------");
        // carro 2
        misAutos.add(a2);
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        
        System.out.println("-------------------");
        // carro 3
        misAutos.add(a3);
        System.out.println(misAutos.size());
        System.out.println(misAutos);
    
        System.out.println("------------------");
        System.out.println("El 2 autos es: "+misAutos.get(1));
        
        System.out.println("------------------");
        System.out.println("Mostrando todos los elementos de la lista:");
        for (int i = 0; i <misAutos.size(); i++) {
            System.out.println("El auto en la posicion ["+ i + "] es "+misAutos.get(i));
            
        }
        
        System.out.println("-------------------");
        System.out.println("Borrando un auto en la posicion 0");
        // borrar un auto de la lista con remove
        misAutos.remove(0); // borrar el auto de la posicion 0
        System.out.println(misAutos.size());
        System.out.println(misAutos);
    
    }
    
}
