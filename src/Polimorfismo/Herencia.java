/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author royum
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // array donde podemos guardar, consultores, jefes, empleados
       // ejemplo de polimorfismo
       Persona array[] = new Persona [5];
       
       array[0] = new Persona();
       array[1] = new Consultor();
       array[2] = new Empleado();
       array[3] = new Jefe();
       
       Persona person = new Persona();
       Consultor consul = new Consultor();
       
       person = consul; // bueno
       // consul = person // malo
       
       
        
        
        
        
    }
    
}
