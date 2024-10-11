/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioArraylists;

import java.util.ArrayList;

/**
 *
 * @author royum
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Fabrica f = new Fabrica();
        cargarFabrica(f);
        
        //f.listarInstrumentos();
        //f.instrumentoPorTipo(TipoInstrumento.VIENTO); // dejandolo asi no mostrara nada 
        ArrayList<Instrumento> lista = f.instrumentoPorTipo(TipoInstrumento.PERCUSION);
        // aqui hacemos un for each para recorrer 
        for (Instrumento instrumento : lista) {
            System.out.println(instrumento);
        }
    }

    private static void cargarFabrica(Fabrica f) {
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");

        s1.AgregarInstrumentos(new Instrumento("ABC123", 1234, TipoInstrumento.CUERDA));
        s1.AgregarInstrumentos(new Instrumento("DEF456", 7653, TipoInstrumento.PERCUSION));
        s1.AgregarInstrumentos(new Instrumento("GHI789", 8976, TipoInstrumento.VIENTO));

        s2.AgregarInstrumentos(new Instrumento("JKL101", 5346, TipoInstrumento.VIENTO));
        s2.AgregarInstrumentos(new Instrumento("TGE978", 7563, TipoInstrumento.CUERDA));


        f.agregarSucursal(s1);
        f.agregarSucursal(s2);

    }

}
