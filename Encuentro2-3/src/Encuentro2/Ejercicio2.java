
package Encuentro2;

import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Hola, cual es tu nombre?");
        Scanner t = new Scanner(System.in);
        String nombre = t.nextLine();
        System.out.println("Mucho gusto " + nombre + " es un placer conocerte :D");
    }
    
}
