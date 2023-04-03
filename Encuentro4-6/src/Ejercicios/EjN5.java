/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class EjN5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        Scanner leer = new Scanner(System.in);
      do{ System.out.println("Ingrese numeros enteros a continuacion");
          suma = suma + leer.nextInt();}
      while (suma < 50);
        System.out.println("la suma de los numeros ingresados es: " + suma);
    }
    
}
