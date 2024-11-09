/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARCHIVOS_FILE;

import java.io.File;
import javax.xml.transform.Source;


/**
 *
 * @author royum
 */
public class archivo_prueba {
    
    public static void main(String[] args) {
        
         //archivo 1 de la instacia file
    File archivo1=new File("C:\\prueba.txt");
    
    File archivo4=new File("C:\\hola.txt");
    
    
        
    
        System.out.println(archivo4.exists());
       
    
    
//    //aqui se verifica si el archivo existe 
//        System.out.println("Existe: "+archivo1.exists());
//        
//        //aqui actividad si el archivo se puede leer y escribir
//        System.out.println("Se puede leer ? "+archivo1.canRead());
//        System.out.println("Se puede escribir? "+archivo1.canWrite());

//-------------------------------------------------------------

//aqui practica para manejar directorios
    //File archivo2=new File("C:\\PrimeraCarpeta\\");
    
//-------------------------------------------------------------
    //aqui para crear una carpeta
    // ejemplo 1 de como crear carpeta
    
//    boolean exito=archivo2.mkdir();
//        System.out.println(exito);
  
//-------------------------------------------------------------
        //aqui ejemplo2 de como crear carpeta
        
       
      //  System.out.println(archivo2.mkdir());
      
      
//--------------------------------------------------------------------------------------------

//aqui para crear directorios y subidrectorios
//      File archivo3=new File("C:\\PRIMERA_CARPETA_DE_ROY\\carpeta1\\carpeta2\\carpeta3\\");
//      
//        System.out.println(archivo3.mkdirs());
        
//--------------------------------------------------------------------------------------------

// este sirve para renombrar una carpeta

        //traduccion el arcivo1 renombrado hacia un nuevo archivo con esta ruta
        //System.out.println(archivo4.renameTo(new File("C:\\terremotoxd.txt")));
        
//--------------------------------------------------------------------------------------------

//aqui para eliminar un archivo

        System.out.println(archivo4.delete());
        
    }
        
    
    
    
}
