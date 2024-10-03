/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author royum
 */
public class Consultor extends Persona{
    
    String nombreConsultora;
    int numeroConsultor;

    public Consultor() {
    }

    public Consultor(String nombreConsultora, int numeroConsultor, int ID, String DNI, String nombre, String apellido, String domicilio, String telefono) {
        super(ID, DNI, nombre, apellido, domicilio, telefono);
        this.nombreConsultora = nombreConsultora;
        this.numeroConsultor = numeroConsultor;
    }


    public String getNombreConsultora() {
        return nombreConsultora;
    }

    public void setNombreConsultora(String nombreConsultora) {
        this.nombreConsultora = nombreConsultora;
    }

    public int getNumeroConsultor() {
        return numeroConsultor;
    }

    public void setNumeroConsultor(int numeroConsultor) {
        this.numeroConsultor = numeroConsultor;
    }
    
    
    
}
