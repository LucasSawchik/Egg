
package Encuentro2;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
/**
 *
 * @author Lucas
 */
public class Ejercicio3 {

    public static void main(String[] args) {
    
        System.out.println("A continuacion ingrese una frase"); 
        
        Scanner t = new Scanner(System.in);
        String frase = t.nextLine();
        
        System.out.println(toUpperCase(frase));
        System.out.println(toLowerCase(frase));
        
        
        
        
        
    }
    
}
