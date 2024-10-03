/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIMORFISMO2;

import java.util.ArrayList;

/**
 *
 * @author royum
 */
public class Empresa {
   
    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }
    
    // agregar con arrayList, que sencillo
    public void AgregarEmpleado(Empleado e){
        this.empleados.add(e);
    }
    
    public void MostrarSalarios(){
        for (Empleado emplea : empleados) {
            System.out.println(emplea.NombreCompleto()+ ": $"+ emplea.getSalario()); // uso de get Salario polimorfico
        }
    }
    
    public Empleado empleadosConmasClientes(){
        int max = -1;
        Empleado  elMayor = null;
        for (Empleado e : empleados) {
            if(e instanceof  EmpleadoComision){
                EmpleadoComision eac = (EmpleadoComision) e;
                int cant = eac.getCantClientesCaptados();
                if(cant > max){
                    max = cant;
                    elMayor = eac;
                }
                
            }
        }
        
        return elMayor;
    }
    
    
    
    
    
}
