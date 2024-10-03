/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author royum
 */
public class Jefe extends Persona {
    
    int IdJefe;
    String DepartamentoJefe;

    public Jefe() {
    }

    public Jefe(int IdJefe, String DepartamentoJefe, int ID, String DNI, String nombre, String apellido, String domicilio, String telefono) {
        super(ID, DNI, nombre, apellido, domicilio, telefono);
        this.IdJefe = IdJefe;
        this.DepartamentoJefe = DepartamentoJefe;
    }

    public int getIdJefe() {
        return IdJefe;
    }

    public void setIdJefe(int IdJefe) {
        this.IdJefe = IdJefe;
    }

    public String getDepartamentoJefe() {
        return DepartamentoJefe;
    }

    public void setDepartamentoJefe(String DepartamentoJefe) {
        this.DepartamentoJefe = DepartamentoJefe;
    }
    
    
    
}
