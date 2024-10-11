/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioArraylists;

import java.util.ArrayList;

/**
 *
 * @author royum
 */
public class Sucursal {

    private ArrayList<Instrumento> instrumentos;
    private String nombre;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public void AgregarInstrumentos(Instrumento ins) {
        this.instrumentos.add(ins);
    }

    public ArrayList<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void listarInstrumentos() {
        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento);
        }
    }
    
    // aqui se crea una funcion para recorrer a los instrumentos por su tipo, con el enum, OJO A NIVEL SUCURSAL
    // NO A NIVEL DE FABRICA 
    
    // sin usar void porque tiene que ser distinto porque hayq ei devolver un listado de instrumentos
    public  ArrayList<Instrumento> instrumentoPorTipo(TipoInstrumento tipo){
        //creacion de nueva lista porque no tenemos que devovler la misma lista que tenemos ya creada y en este 
        // nuevo arraylist tenemos que listar solo los instrumentos de determinado tipo
        ArrayList<Instrumento> instrumentosEncontrados = new ArrayList<>(); // obligatorio instanciarla porque si no
        // va quedar como una variable sin inicilizar y no querra compilar 
        
        // aqui lo recorremos con un for each, si no quedaria vacio
        for (Instrumento instrumento : instrumentos) { // hay que tener cuidado el for tendra que recorrer a instrumento donde la tenemos definida como variable 
            if(instrumento.getTipo() == tipo){ // los enums se compara con doble igual " == "
                instrumentosEncontrados.add(instrumento);
            }
        }
        
        // aqui retornamos la lista 
        return instrumentosEncontrados;
    }

}
