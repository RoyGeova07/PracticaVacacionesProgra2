/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HERENCIA;



/**
 *
 * @author royum
 */

// esta es la clase padre
public class Persona {
    
    // se utiliza protected porque ya no seran privados para las demas clases si no que ahora se podra
    // acceder desde las clases donde se hereda, clases hijas
    protected String nombre;
    protected String apellido;
    protected  int Edad;

    public Persona(String nombre, String apellido, int Edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Edad = Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return Edad;
    }
    
    
                
    
}
