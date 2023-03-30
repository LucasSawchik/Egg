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
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese su nota");
        Scanner leer = new Scanner(System.in);
        int nota = leer.nextInt();
        while((nota < 0) || (nota > 10)){ System.out.println("El numero ingresado no es un valor valido, vuelva a intentarlo"); 
         nota = leer.nextInt(); }
 
    }
    
}
