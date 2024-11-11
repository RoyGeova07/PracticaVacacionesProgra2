/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARCHIVOS_TXT;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author royum
 */
public class Escribir_Archivo {

    public static void main(String[] args) throws IOException {
        FileWriter archivo = null;
        PrintWriter escritor = null;

        try {
            archivo = new FileWriter("C:\\Users\\royum\\OneDrive\\Documentos\\NetBeansProjects\\ROYARCHIVO.txt");
            escritor = new PrintWriter(archivo);

            escritor.println("hola");
            escritor.print("Honduras");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (archivo != null) {
                archivo.close();
            }

        }

    }

}
