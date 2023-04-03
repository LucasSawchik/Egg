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
public class EjN6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num1, num2,opt;
      String quit = "S";
      boolean flag = false;
      Scanner l = new Scanner(System.in);
        
      do{ System.out.println("ingrese dos numeros enteros");
      num1 = l.nextInt(); num2 = l.nextInt();}
      while((num1<0) && (num2<0));
      
       while(flag == false){
        System.out.println("Elija una opcion:");
        System.out.println("*MENU*");System.out.println("1)Sumar");System.out.println("2)Restar");System.out.println("3)Multiplicar");System.out.println("4)Dividir");System.out.println("5)Salir");
        opt = l.nextInt();
       
      switch(opt){
          case 1:System.out.println("El resultado de la suma entre: " +num1+" y "+num2+" es: "+(num1+num2));
             break;
          case 2:System.out.println("El resultado de la resta entre: " +num1+" y "+num2+" es: "+(num1-num2));
             break;
          case 3:System.out.println("El resultado de la multiplicacion entre: " +num1+" y "+num2+" es: "+(num1*num2));
              break;
          case 4:System.out.println("El resultado de la division entre: " +num1+" y "+num2+" es: "+(num1/num2));
              break;
          case 5:System.out.println("¿Esta seguro de que desea salir? (S/N)");
                 if(l.nextLine().equalsIgnoreCase(quit)){flag = true;}
                }}
      
        
         }
    }
    

