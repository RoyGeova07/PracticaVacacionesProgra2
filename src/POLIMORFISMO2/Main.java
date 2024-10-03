/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POLIMORFISMO2;

import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author royum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empresa em = new Empresa();
        
        em.AgregarEmpleado(new EmpleadoComision("123","Roy","Umaña",2024,40000,100,50000));
        em.AgregarEmpleado(new EmpleadoSalarioFijo("456","Leo","Messi",1988,90000));
        em.AgregarEmpleado(new EmpleadoComision("789","Cristiano","Ronaldo",1986,10000,89,3455));
        em.AgregarEmpleado(new EmpleadoSalarioFijo("145","Xavi","Hernandez",1980,43000));
        em.AgregarEmpleado(new EmpleadoComision("643","Andres","Iniesta",1982,40800,50,800));
        em.AgregarEmpleado(new EmpleadoSalarioFijo("756","Carlos","Costly",1985,45000));
        em.AgregarEmpleado(new EmpleadoSalarioFijo("968","Benguche","Martinez",1989,49000));
        em.AgregarEmpleado(new EmpleadoComision("235","Alejandro","Grimaldo",1998,60000,67,23330));

        em.MostrarSalarios();
        System.out.println(em.empleadosConmasClientes().NombreCompleto());
        
    }

}
