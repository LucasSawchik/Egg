/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasCondicionales;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("ingrese a continuacion 2 numeros entre 0-100");  
        Scanner t = new Scanner(System.in);
        int num1 = t.nextInt();
        int num2 = t.nextInt();
        
        if ((num1 > 25) && (num2 >25 )){System.out.println("Ambos numeros ingresados son mayores a 25");}
        else if(num1 > 25){System.out.println("el primer numero ingresado es mayor que 25");}
        else if(num2 >25) {System.out.println("el segundo numero ingresado es mayor que 25");}
        else {System.out.println("Ninguno de los dos numeros es mayor que 25");}
        
    }
    
}
