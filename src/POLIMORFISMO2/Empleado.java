/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIMORFISMO2;

import java.time.LocalDate;

/**
 *
 * @author royum
 */
public abstract class Empleado {
    
    String DNI;
    String nombre;
    String Apellido;
    int AnioIngreso;

    public Empleado(String DNI, String nombre, String Apellido, int AnioIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.AnioIngreso = AnioIngreso;
    }
    
    public int AntiguedadAnios(){
        int AnioActual = LocalDate.now().getYear();
        return AnioActual - AnioIngreso;
    }
    
    public String NombreCompleto(){
        return nombre+ " "+ Apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getAnioIngreso() {
        return AnioIngreso;
    }
    
    // no tenemos lo necesario para devolver un salario basico, por ende se vuelve abstracto.
    public abstract double getSalario();
    // con esto nos aseguramos que todos los empleados, sepan deovlver un salario.
        
    
    
}
