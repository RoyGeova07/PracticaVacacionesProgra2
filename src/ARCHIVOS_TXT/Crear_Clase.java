/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARCHIVOS_TXT;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author royum
 */
public class Crear_Clase {
    
    private File mifile=null;

    public void setFile(String rutacarpeta) {
        mifile=new File(rutacarpeta);
    }
    
    
    public boolean CrearArchivo() throws IOException{
        if(mifile !=null){
            return mifile.createNewFile();
        }
        System.out.println("Debe crear una ruta primero para crear un arhivo");
        return false;
        
    }
    
    public boolean CrearFolder (){
        if(mifile !=null){
        return mifile.mkdirs();     
        }
        System.out.println("Debe crear una ruta primero para crear un folder");
        return false;
    }
    
       public void info(){
        if(mifile.exists()){
            
            System.out.println("\nNombre: "+mifile.getName());
            System.out.println("Path: "+mifile.getPath());
            System.out.println("Absoluta: "+mifile.getAbsolutePath());
            System.out.println("Cantidad de Bytes: "+mifile.length());
            System.out.println("Modificado en: "+ new Date(mifile.lastModified()));
            System.out.println("Padre: "+mifile.getAbsoluteFile().getParentFile().getName());//identificar cual es el padre de esa direccion
            if(mifile.isFile()){
                System.out.println("ES UN ARCHIVO");
            }else if(mifile.isDirectory()){
                System.out.println("ES UN DIRECTORIO");
            }
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+");
        }else{
            System.out.println("NO EXISTE!");
        }
    }
    
    public boolean agregarArchivoOUnaCarpetaAunFolder(String nombre,String rutaCarpeta, boolean esFolder) throws IOException{
        File carpeta=new File(rutaCarpeta);
        
        if(carpeta.exists()&& carpeta.isDirectory()){
            File nuevoElemento=new File (carpeta, nombre);
            
            if(esFolder){
                return nuevoElemento.mkdirs();
            }else{
                return nuevoElemento.createNewFile(); 
            }
            
            
        }
        System.out.println("La ruta no es un directorio o no ha sudo establecida");
        return false;
        
    }
    
    public boolean BorrarArchivoOCarpeta(){
        
        if(mifile !=null && mifile.exists()){
            
            return mifile.delete();
            
        }
        System.out.println("\nEl archivo o folder que intentas borrar, no existe");
        return false;
    }

}


