/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HERENCIA;

/**
 *
 * @author royum
 */

// esta es la clase hija / ESTUDIANTE hereda de la clase PERSONA
public class Estudiante extends Persona {
    
    // agregar atributos extra para Estudiante
    private int codigoEstudiante;
    private double notaFinal;
    
    // creacion de constructor de la clase hija, es diferente a una clase Padrep
    public Estudiante(String nombre,String apellido,int edad, int codigoEstudiante, double notaFinal){
        // ya no es necesario incializarlo porque ya estan inicializado en la clase padre, asi que
        // se usa la palabra super
        super(nombre,apellido,edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
        
    }
    
    // ahora con los metodos getter ya no es necesario ponerlos, porque ya los hereda, ya los tiene
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nEdad: "+getEdad()+
                "\nCodigo de Estudiante: "+codigoEstudiante+
                "\nNota Final: "+notaFinal);
    }
    
    
    
    
}
