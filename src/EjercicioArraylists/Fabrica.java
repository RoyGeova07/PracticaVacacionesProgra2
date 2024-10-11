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
public class Fabrica {

    private ArrayList<Sucursal> sucursales;

    public Fabrica() {
        this.sucursales = new ArrayList<>();

    }

    public void listarInstrumentos() {
        for (Sucursal sucursale : sucursales) {
            System.out.println(sucursale.getNombre());
            sucursale.listarInstrumentos();
        }
    }

    public void agregarSucursal(Sucursal suc) {
        this.sucursales.add(suc);
    }

    // funcion para listar a los instrumentos por su tipo a nivel de fabrica 
    public ArrayList<Instrumento> instrumentoPorTipo(TipoInstrumento tipo) {
        ArrayList<Instrumento> instrumentosEncontrados = new ArrayList<>();

        // ahora aqui recorremos a las sucursales con un for each
        for (Sucursal sucursale : sucursales) {
            instrumentosEncontrados.addAll(sucursale.instrumentoPorTipo(tipo));
            // sucursale.instrumentoPorTipo(tipo); // si lo dejo asi, solo con el for each, si tengo 4,9 o mas sucursales, tendre 4,9 o mas listas diferentes
            // para poder unir esas listas en una, haty varias forma, 

            // 1. seria guardarnos esta lista: sucursale.instrumentoPorTipo(tipo); recorrerla y cada uno de esos elementos 
            // pasarlos a esta 'instrumentosEncontrados' que los va a ir totalizando 
            
            // 2. como instrumentosEcontrados es un ArrayList la clase de ArrayList tiene un metodo llamado 'addAll', que lo que hace es
            // agregar todos los elementos en una coleccion que ya existiese, el parametro que recibe andAll es de tipo collection
            // en este caso ArrayList es una coleccion y puede añadir a cada uno de los elementos  de otra coneccion a su lista
        }

        return instrumentosEncontrados;
    }
    
    // si lo ponemos con void, se borraria y ya.
    // pero si lo ponemos con la clase Instrumento nos puede devilver el instrumento borrado
    public Instrumento borrarInstrumentos(String ID){
        Instrumento borrado = null; // porque si nos pasaron un ID q no coincide con ningun instrumento o no hay instrumento
        // o no hay sucursales siempre hay q devolver el borrado.
        
        
        
        return borrado;
    }

}
