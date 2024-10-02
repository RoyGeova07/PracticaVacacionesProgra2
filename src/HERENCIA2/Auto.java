/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HERENCIA2;

/**
 *
 * @author royum
 */
public class Auto extends Vehiculo {

    // aqui java no sabe si Auto es un vehiculo, hasta que ponemos extends, que esto representa la herencia
    // super significa que es la referencia de la superclase.
    // aqui queremos invocar al contructor de la clase vehiculo
    boolean tieneAire;

    public Auto(boolean tieneAire, String marca, String modelo, String patente) {
        super(marca, modelo, patente);
        this.tieneAire = tieneAire;
    }

    void prenderAire() {
        if (tieneAire) {
            System.out.println("Encendiendo el aire..");
        }
    }

}
