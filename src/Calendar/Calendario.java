/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author royum
 */
public class Calendario {
    
    // calendar.getInsrance devuelve una instancia del calendario configurada con la fehca y hora actual.
    
    public static void main(String[] args) {
        SimpleDateFormat fechaformateada = new SimpleDateFormat("dd/MM/yyyy");
        Calendar hoy = Calendar.getInstance();
        Date Fecha;
        Fecha = new Date();
        
        Calendar calendario = Calendar.getInstance();
        System.out.println("hoy es: "+calendario.getTime());
        
        
        // aqui para la fecha especifica y camiarla con el set
        Calendar especifica = Calendar.getInstance();
        especifica.set(2007, Calendar.MAY, 31);
        System.out.println("\nRoy Nacio el "+especifica.getTime());
        
        
        // 
        System.out.println("\nFECHA FEA: "+Fecha);
        fechaformateada.format(Fecha);
        System.out.println("\nFecha Formateada Bonita: "+fechaformateada.format(Fecha));
        
        
        if(hoy.after(hoy)){
            System.out.println("\nEsta fecha es el dia despues de mi nacimiento");
        } else if(especifica.before(hoy)){
            System.out.println("\nEsta fecha es el dia antes de mi nacimiento");
        } else if(hoy.getTimeInMillis() >= especifica.getTimeInMillis()){
            System.out.println("\nhoy paso despues de que nacio Roy");
        }
        
        // valores indi
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            
        }
        
    }
            
    
}
