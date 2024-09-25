/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RECURSIVIDAD;

import java.util.Scanner;

/**
 *
 * @author royum
 */
public class Recursividad {
// si es 5 = 

    public static int sumatoriaUP(int numero) {       // sumatoriaUP(5) = sumatoriaUP(4) + 5
        // aqui caso base                            //  sumatoriaUP(4) = sumatoriaUP(3) + 4
        if (numero >= 1)                            //   sumatoriaUP(3) = sumatoriaUP(2) + 3
        // retorna                                 //    sumatoriaUP(2) = sumatoriaUP(1) + 2
        {                                         //     sumatoriaUP(1) = sumatoriaUP(0) + 1
            return sumatoriaUP(numero - 1) + numero; //  sumatoriaUP(1) = sumatoriaUP(0) + 1
        }
        return 0;                               //      sumatoriaUP(0) = 0                                                     

//                                          al volver:
//                                          sumatoriaUP(1) = 0 + 1 = 1
//                                          sumatoriaUP(2) = 1 + 2 = 3
//                                          sumatoriaUP(3) = 3 + 3 = 6
//                                          sumatoriaUP(4) = 6 + 4 = 10
//                                          sumatoriaUP(5) = 10 + 5 = 15                                                                  
    }

    private static int sumatoriaDOWN(int numero, int total) {
        if (numero >= 1) {
            return sumatoriaDOWN(numero - 1, total + numero);
        }
        return total;

        // si el numero es 4: 
//        Paso a paso (con num = 4):
//        Llamada inicial desde main:
//        sumatoriaDOWN(4)
//
//        Esto invoca el método sobrecargado con un solo parámetro num = 4.
//        El método sobrecargado llama al método recursivo real:
//        sumatoriaDOWN(4, 0)
//
//        Inicializa total = 0.
//        Primera llamada recursiva:
//        num = 4, total = 0
//
//        Como num >= 1, hace la llamada recursiva:
//        sumatoriaDOWN(3, 4) (suma 4 a total).
//        Segunda llamada recursiva:
//        num = 3, total = 4
//
//        Como num >= 1, hace la llamada recursiva:
//        sumatoriaDOWN(2, 7) (suma 3 a total).
//        Tercera llamada recursiva:
//        num = 2, total = 7
//
//        Como num >= 1, hace la llamada recursiva:
//        sumatoriaDOWN(1, 9) (suma 2 a total).
//        Cuarta llamada recursiva:
//        num = 1, total = 9
//
//        Como num >= 1, hace la llamada recursiva:
//        sumatoriaDOWN(0, 10) (suma 1 a total).
//        Última llamada recursiva:
//        num = 0, total = 10
//
//        Como num < 1, se detiene la recursión y retorna total = 10.
    }

    private static boolean Palindromo(String palabra, int posicionInicio, int posicionFinal) {
        // caso base aqui si los indices se encuentran o no, aqui detiene la recursion, 
        // significa que hemos llegado al centro de la palabra o ya la hemos pasado
        if (posicionFinal <= posicionInicio) {
            return true; //  la palabra es un palindromo
        }
        // si los caracteres en los extremos no coninciden, no es un palindromo
        if (palabra.charAt(posicionInicio) != palabra.charAt(posicionFinal)) {
            return false;
        }

        // retornamos la funcion para verificar si es un palindromo
        // en cada llamada recursiva para avanzar hacia el centro de la palabra 
        // esto se hace porque la recursividad esta comparando los caracteres de los extremos
        // y avanzando gradualmente hacia el centro.
        return Palindromo(palabra, posicionInicio + 1, posicionFinal - 1);

    }

    private static void piramide(int fila, int base) {
        if (fila <= base) {
            for (int i = 0; i < base - fila; i++) {
                System.out.print(" ");
            }
            // asteriscos
            for (int i = 0; i < 2 * fila - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
            piramide(fila + 1, base);
        }
    }

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        boolean entradaValida;
        int resultado1 = sumatoriaUP(5);
        int resultado2 = sumatoriaDOWN(4, 0);
        String palabra = "";
        int base = 0;
        int continuar = 0;

        do {
            entradaValida = false;
            while (!entradaValida) {

                System.out.println("\nIngrese una palabra: ");
                palabra = lea.next();

                // el matches en java se utiliza para verificar si una cadena String 
                //cumple con un patron especificado mediante una expresion regula
                //retorna true si la cadena completa coincide con el patrón, y false en caso contrario.
                if (palabra.matches("[a-zA-Z]+")) { // solo permite letras
                    entradaValida = true;
                } else {
                    System.out.println("Ingrese lo que se le pide porfavor.");
                }

            }
            try {

                System.out.println("Ingrese el numero de filas para piramide: ");
                base = lea.nextInt();

                while (base <= 0) {
                    System.out.println("Ingrese un numero positivo o mayor a cero. Intentelo de nuevo");
                    base = lea.nextInt();
                }

            } catch (Exception e) {
                System.out.println("Ingrese la opcion que se le pide");
                lea.next();
            }

            if (Palindromo(palabra.toUpperCase(), 0, palabra.length() - 1)) {
                System.out.println("**\nEJERCICIO 1**");
                System.out.println("La palabra " + palabra + " es un palindroma");
            } else {
                System.out.println("\n**EJERCICIO 1**");
                System.out.println("La palabra " + palabra + " no es palindroma");
            }

            System.out.println("\n**EJERCICIO 2**");
            System.out.println("la sumatoria de 1 a 5 es: " + resultado1);

            System.out.println("\n**EJERCICIO 3**");
            System.out.println("el resultado es: " + resultado2);

            System.out.println("\n**EJERCICIO 4**");
            System.out.println("la palabra: " + palabra);

            System.out.println("\n**EJERCICIO 5**");
            piramide(1, base);

            System.out.println("Quiere intentar de nuevo? (si presione): 1) (no presione): 2)");
            continuar = lea.nextInt();

        } while (continuar == 1);

        System.out.println("Gracias por usar el programa.");

    }

}
