/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enumeradores;

import java.util.ArrayList;

/**
 *
 * @author royum
 */
public class Empresa {
    
    private ArrayList<Persona> listaPersonas;
    
    public Empresa(){
        this.listaPersonas = new ArrayList<>();
    }
    
    public void AgregarPersona(Persona p){
        this.listaPersonas.add(p);
    }
    
    public void MostrarNivel(NivelEstudio nivel){
        for(Persona p : listaPersonas){
            if(p.getNivelEstudio() == nivel){
                System.out.println(p);
            }
        }
    }
    
}
