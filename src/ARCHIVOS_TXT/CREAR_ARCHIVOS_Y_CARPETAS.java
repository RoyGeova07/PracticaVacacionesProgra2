/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARCHIVOS_TXT;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author royum
 */
public class CREAR_ARCHIVOS_Y_CARPETAS {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int opcion = 0;
        String direccion;
        String nombreArchivoAgregar;

        Crear_Clase archi = new Crear_Clase();

        while (opcion != 7) {

            System.out.println("\n***Menu***");
            System.out.println("1- Set Archivo/Folder");
            System.out.println("2- Ver archivo");
            System.out.println("3- Crear Archivo");
            System.out.println("4- Crear Folder");
            System.out.println("5- Agregar archivo a un folder existente");
            System.out.println("6- Borrar Archivo o carpeta");
            System.out.println("7- salir");
            System.out.println("Escoja un opcion: ");
            opcion = lea.nextInt();

            if (opcion == 1) {

                System.out.println("Ingrese la ruta: ");
                direccion = lea.next();
                archi.setFile(direccion);
                System.out.println("\nRuta creada correctamente");

            } else if (opcion == 2) {
                try {
                    archi.info();
                } catch (Exception e) {
                    System.out.println("\nerror no hay archivo por mostrar");
                }

            } else if (opcion == 3) {

                try {

                    if (archi.CrearArchivo()) {
                        System.out.println("Archivo Creado correctamente");
                    } else {
                        System.out.println("ERROR");
                    }

                } catch (IOException e) {
                    System.out.println("ERRRO AL CREAR EL ARCHIVO" + e.getMessage());
                }

            } else if (opcion == 4) {

                if (archi.CrearFolder()) {
                    System.out.println("Folder creado exitosamente");
                } else {
                    System.out.println("ERROR");
                }

            } else if (opcion == 5) {
                System.out.println("Ingrese el nombre del archivo a Agregar");
                nombreArchivoAgregar = lea.next();
                System.out.println("Ingrese el nombre de la carpeta");
                String carpeta = lea.next();

                try {

                    if (archi.agregarArchivoAunFolder(nombreArchivoAgregar, carpeta)) {
                        System.out.println("Archivo " + nombreArchivoAgregar + "agregado al folder");
                    }

                } catch (IOException e) {
                    System.out.println("ERROR AL AGREGAR EL ARCHIVO: " + e.getMessage());
                }

            } else if (opcion == 6) {

                System.out.println("Ingrese la ruta del archivo o carpeta que intenta eliminar");
                direccion = lea.next();
                archi.setFile(direccion);

                if (archi.BorrarArchivoOCarpeta()) {
                    System.out.println("Archivo " + direccion + " borrado exitsamente");
                }

            } else if (opcion == 7) {

                System.out.println("FINISH");

            } else {
                System.out.println("\nOpcion no valida");
            }

        }
    }

}
