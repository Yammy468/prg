/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 */

import java.util.ArrayList;
import java.util.Random;

public class S10Ejercicio02 {
    public static void main(String agrs[]) {
        ArrayList<Integer> numero = new ArrayList<Integer>();

        int suma = 0;
        int media = 0;
        int maximo = 0;
        int minimo = 100;
        int tamano = (int)(Math.random()*11 + 10);

        for(int i = 0; i < tamano; i++) {
            numero.add((int)(Math.random()*101));
        }

        System.out.println("La lista de los números seleccionados: " + numero);

        // calculo
        for(int n: numero) {
            suma += n;
            media = suma/ tamano;

            if(n > maximo) {
                maximo = n;
            }
            if(n < minimo) {
                minimo = n;
            }
        }

        // resultado
        System.out.println("La suma de los números son: " + suma);
        System.out.println("La media de los números (sin decimales) son: " + media);
        System.out.println("El máximo de los números son: " + maximo);
        System.out.println("El minimo de los números son: " + minimo);

    }
}
