/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIMORFISMO2;

/**
 *
 * @author royumEmpleadoComision
 */
public class EmpleadoComision extends Empleado {
    
    double SalarioMinimo;
    int CantidadClientesCaptados;
    double MontoPorCliente;

    public EmpleadoComision(String DNI, String nombre, String Apellido, int AnioIngresio,double SalarioMinimo, int CantidadClientesCaptados, double MontoPorCliente) {
        super(DNI, nombre, Apellido, AnioIngresio);
        this.SalarioMinimo = SalarioMinimo;
        this.CantidadClientesCaptados = CantidadClientesCaptados;
        this.MontoPorCliente = MontoPorCliente;
    }
    
    public int getCantClientesCaptados(){
        return CantidadClientesCaptados;
    }

    @Override
    public double getSalario() {
        double salar = MontoPorCliente * CantidadClientesCaptados;
        if(salar < SalarioMinimo){
            salar = SalarioMinimo;
        }
        return salar;
    }
    
    
    
    
    
}
