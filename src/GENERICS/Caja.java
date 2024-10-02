/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GENERICS;

// los generics son una caracteristica que permite definir clases, interfaces, y metodos con tipos de datos
// parametrizados

// su principal objetivos es propocionar una manera de manejar objetos de diferentes tipo sin perder la
// seguridad de tipos
/**
 *
 * @author royum
 */
public class Caja<T> {

    private T contenido;

    public void ponerAlgo(T contenido) {
        this.contenido = contenido;
    }

    public T obtenerAlgo() {
        return contenido;
    }

}
