/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ENUM2;

/**
 *
 * @author royum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // values me devuelve un array, con los continentes enumerados
        Continente[] continentes = Continente.values();
        for (int i = 0; i < continentes.length; i++) {
            System.out.println(continentes[i].NombreyDensidadPoblacional());
        }
        
    }
    
}
