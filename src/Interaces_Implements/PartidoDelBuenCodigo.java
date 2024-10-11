/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interaces_Implements;

import java.util.ArrayList;

/**
 *
 * @author royum
 */
public class PartidoDelBuenCodigo {
    
    private ArrayList<EnviadorDeMensajes> mensajeros;
    
    public PartidoDelBuenCodigo(){
        mensajeros = new ArrayList<>();
    }
    
    public void AgregarMensajero(EnviadorDeMensajes mensajero){
        this.mensajeros.add(mensajero);
    }
    
    public void HacerCampania(){
        for (EnviadorDeMensajes mensajero : mensajeros) {
            mensajero.enviarMensajes("Vote por el partido Nacional, !Viva Papi a la orden¡");
        }
    }
    
}
