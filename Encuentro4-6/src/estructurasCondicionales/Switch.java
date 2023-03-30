
package estructurasCondicionales;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class Switch {

   
    public static void main(String[] args) {
    System.out.println("Para conocer los tipos de  bombas de fluido que tenemos disponible ingrese un numero entre el 1-4");
     Scanner leer = new Scanner(System.in);
     int opcion = leer.nextInt();
     
     switch(opcion){
         case 1: System.out.println("La bomba es una bomba de agua"); ;
         
         break;
         
         case 2: System.out.println("La bomba es una bomba de gasolina");  ;
         
         break;
         
         case 3: System.out.println("La bomba es una bomba de hormigón"); ;
         
         break;
         
         case 4: System.out.println("La bomba es una bomba de pasta alimenticia"); ;
         
         default: System.out.println("No existe un valor válido para tipo de bomba"); ;
         
             
     
     }
        
        
        
        
    }
    
}
