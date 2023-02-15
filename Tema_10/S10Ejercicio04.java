/**
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class S10Ejercicio04 {
    public static void main(String agrs[]) {
        ArrayList<String> palabra = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
 
        System.out.println("Introduzca 10 palabra enteros separador por ESPACIOS: ");
        for(int i = 0 ; i < 10; i++) {
            palabra.add(s.nextLine());
        }
         
        System.out.println("\nLista de palabra sin ordenar:" + palabra);
 
        Collections.sort(palabra);
 
        System.out.println("\nLista de palabra ordenados:" + palabra);
       
    }
}
