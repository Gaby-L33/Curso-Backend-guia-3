
import java.util.Scanner;

/*
    Crear un programa que dado un número determine si es par o impar.
 */

/**
 *
 * @author Usuario
 */
public class ejercicio1PracticoGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        if (num%2 == 0){
            System.out.println("El numero ingresado es PAR");
        } else {
            System.out.println("El numero ingresado es IMPAR");
        }
            
    }
    
}
