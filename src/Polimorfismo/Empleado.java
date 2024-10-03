/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author royum
 */
public class Empleado extends Persona {
    
    int numeroLegajo;
    String Cargo;
    double sueldo;

    public Empleado() {
    }

    public Empleado(int numeroLegajo, String Cargo, double sueldo, int ID, String DNI, String nombre, String apellido, String domicilio, String telefono) {
        super(ID, DNI, nombre, apellido, domicilio, telefono);
        this.numeroLegajo = numeroLegajo;
        this.Cargo = Cargo;
        this.sueldo = sueldo;
    }


    public int getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(int numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
