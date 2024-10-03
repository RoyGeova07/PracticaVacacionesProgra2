/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIMORFISMO2;

/**
 *
 * @author royum
 */
public class EmpleadoSalarioFijo extends Empleado {
    
    private static final double PORCEN1 = 0.05;
    private static final double PORCEN2 = 0.1;
    private static final double Anio1 = 2;
    private static final double Anio2 = 5;
    
        
    private double SueldoBasico;

    public EmpleadoSalarioFijo(String DNI, String nombre, String Apellido, int AnioIngresio,double SueldoBasico) {
        super(DNI, nombre, Apellido, AnioIngresio);
        this.SueldoBasico = SueldoBasico;
    }
    
    private double  porcentajeAdicional(){
        int ant = AntiguedadAnios();
        double porcentaj = 0;
        if(ant > Anio2){
            porcentaj = PORCEN2;
        } else if(ant >= Anio1){
            porcentaj = PORCEN1;
        }
        return porcentaj;
    }

    @Override
    public double getSalario() {
        return SueldoBasico + SueldoBasico * porcentajeAdicional();
    }
        
        
    
}
