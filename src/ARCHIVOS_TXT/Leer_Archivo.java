/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARCHIVOS_TXT;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author royum
 */
public class Leer_Archivo {
    
    
    public static void main(String[] args) {
        
        FileReader archivo;
    BufferedReader lector;
    
    try{
        archivo=new FileReader("C:\\Users\\royum\\OneDrive\\Documentos\\NetBeansProjects\\ROYARCHIVO.txt");
        if(archivo.ready()){
            lector=new BufferedReader(archivo);
            String cadena;
            
            //aqui la cadena es de tipo string y recibe lo que el lector lee leyendo una lista
            while((cadena=lector.readLine()) !=null){
                System.out.println(cadena);
            }
        }else{
            System.out.println("El archivo no esta listo para ser leido");
        }
        
    }catch(Exception e){
        System.out.println("Error: "+e.getMessage());
    }
        
    }
    
    
   
    
}
