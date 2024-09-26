/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enumeradores;

/**
 *
 * @author royum
 */
public class Persona {

    private String nombre;
    private String Apellido;
    private NivelEstudio nivelEstudio;

    public Persona(String nombre, String Apellido, NivelEstudio nivelEstudio) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.nivelEstudio = nivelEstudio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public NivelEstudio getNivelEstudio() {
        return nivelEstudio;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", NivelDeEstudio=" + nivelEstudio + '}';
    }

}
