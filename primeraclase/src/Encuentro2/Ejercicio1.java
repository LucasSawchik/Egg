/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encuentro2;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, r = 0;
    Scanner Nums = new Scanner(System.in);
        System.out.println("ingresa el primer numero");
    num1 = Nums.nextInt();
        System.out.println("ingresa el segundo numero");
    num2 = Nums.nextInt();
    
    r = (num1 + num2);
    
        System.out.println("la suma de los numeros ingresados es: " + r);
    
    }
    
}
