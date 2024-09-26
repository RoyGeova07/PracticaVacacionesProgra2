/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enumeradores;

/**
 *
 * @author royum
 */
public class Main {
    
    public static void main(String[] args) {
        Empresa em = new Empresa();
        
        em.AgregarPersona(new Persona("Roy","Geovany",NivelEstudio.POSGRADO));
        em.AgregarPersona(new Persona("Leo","Messi",NivelEstudio.UNIVERSITARIO));
        em.AgregarPersona(new Persona("Cristiano","Ronaldo",NivelEstudio.SIN_ESTUDIOS));
        em.AgregarPersona(new Persona("Neymar","Silva",NivelEstudio.TERCIARIO));
        em.AgregarPersona(new Persona("Olimpia","Pedro",NivelEstudio.TERCIARIO));
        em.AgregarPersona(new Persona("Motagua","Barbara",NivelEstudio.SECUNDARIO));
        em.AgregarPersona(new Persona("Fc","Barcelona",NivelEstudio.UNIVERSITARIO));
        em.AgregarPersona(new Persona("Fc","Madrid",NivelEstudio.PRIMARIO));
        em.AgregarPersona(new Persona("Coca","Cola",NivelEstudio.POSGRADO));
        
        
        
        
        em.MostrarNivel(NivelEstudio.SECUNDARIO);
    }
    
}
