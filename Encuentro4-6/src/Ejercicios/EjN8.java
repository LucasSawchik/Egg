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
public class EjN8 {
//INCOMPLETO
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa dibuja cuadrados perfectos");
        System.out.println("ingrese un numero entero para definir su tamaño");
        int num;
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        for (int i = 0; i < (num); i++) { 
            for (int j = 0; j < (num); j++) {
                if((i>0)&&(i<num)&&(j>0)&&(j<num)){System.out.print("");}
                else {System.out.print("* ");}
            }
            System.out.println(" ");
        }
    }
    
}
