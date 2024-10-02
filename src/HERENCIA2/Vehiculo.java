/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HERENCIA2;

/**
 *
 * @author royum
 */
public class  Vehiculo {

    // aqui public por defecto
    String marca;
    String modelo;
    String patente;

    public Vehiculo(String marca, String modelo, String patente) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }

    void acelerar() {
        System.out.println("Acelerandooo..");
    }

    void frenar() {
        System.out.println("Frenandoo..");
    }

    void encendiendo() {
        System.out.println("Encendiendo..");
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + '}';
    }

}
