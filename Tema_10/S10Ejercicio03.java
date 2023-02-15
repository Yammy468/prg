/** 
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S10Ejercicio03 {
    public static void main(String agrs[]) {
        ArrayList<Integer> numero = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca 10 números enteros separador por ESPACIOS: ");
        for(int i = 0 ; i < 10; i++) {
            numero.add(s.nextInt());
        }
        
        System.out.println("\nLista de númro sin ordenar:" + numero);

        Collections.sort(numero);

        System.out.println("\nNúmeros ordenados (de menor a mayor):" + numero);
      
    }
}
