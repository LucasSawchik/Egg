/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasRepetitivas;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, cont = 0, cont1 = 0; 
       Scanner leer = new Scanner(System.in);
        
        do{ System.out.println("Ingrese un numero entero positivo, " + (20-cont1) + " restantes");
            num = leer.nextInt();
        
           if(num > 0){cont = (cont + num); cont1 = (cont1 + 1);}
           
           else if(num == 0){System.out.println("Se capturo el numero 0"); break;} 
           
           else if(num < 0){} }
        
        while(cont1 < 20);
        System.out.println("La suma de todos los numeros ingresados es: " + cont);
    }
    
}
