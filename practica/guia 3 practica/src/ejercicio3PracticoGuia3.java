
import java.util.Scanner;

/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá  de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.
 */
/**
 *
 * @author Usuario
 */
public class ejercicio3PracticoGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra de 8 letras");
        palabra = leer.next();

        if (palabra.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

}
