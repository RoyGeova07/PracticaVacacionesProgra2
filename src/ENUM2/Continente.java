/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ENUM2;

/**
 *
 * @author royum
 */
public enum Continente {
    
    //datos del 2008 xddd
    AMERICA(910000000, 42330000),
    EUROPA(731000000, 10180000),
    AFRICA(922011000, 30370000),
    ASIA(3879000000l, 43810000),
    OCEANIA(27000000, 8720710),
    ANTARTIDA(1000, 13720000);
    
    
    private long CantidadHabitantes;
    private double superficie;

    private Continente(long CantidadHabitantes, double superficie) {
        this.CantidadHabitantes = CantidadHabitantes;
        this.superficie = superficie;
    }
    
    // aqui un funcion que nos permita devolver un valor double  que indique la densidad poblacional
    // la desindad poblacional es  la division, la cantidad de habitantes que hay por km2
    public double densidadPoblacion(){
        return this.CantidadHabitantes / this.superficie;
    }
    
    public String NombreyDensidadPoblacional(){
        return this.name() + " - Densidad Poblacional: " + String.format("%.2f", densidadPoblacion()) + " habitantes/km2";   
    }
    

    @Override
    public String toString() {
        return "Continente{" + "CantidadHabitantes=" + CantidadHabitantes + ", superficie=" + superficie + '}';
    }
    
    
    
    
}
