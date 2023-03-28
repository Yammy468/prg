/**
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre
 * del fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Vector; // funciona como un array(de una dimensón) para poder almacenar los String del archivo

class S11Ejercicio04 {
    public static void main(String args[]) {
        if(args.length != 1) {
            System.out.println("Uso del programa: java S11Ejercicio04 FICHERO.txt");
            System.exit(-1); // salir del programa
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            int i = args[0].length();
            String nombre = args[0].substring(0, i - 4);
            String extension = args[0].substring(i - 4, i);

            BufferedWriter bw = new BufferedWriter(new FileWriter(nombre + "_sort" + extension));

            Vector<String> v = new Vector<String>(); // constructor que se inicia con una dimensión de 10 elementos

            String linea = "";
            while(linea != null) {
                v.addElement(linea); // añadir los elementos linea al vector
                linea = br.readLine();
            }
            br.close();

            v.removeElementAt(0); // eliminar dicho elemento especificando el indice
            Collections.sort(v); // ordenamos los elementos del vector

            for(String s: v) {
                bw.write(s + "\n"); // se vuelve a escribir los elementos del vector pero en orden
            }
            bw.close();

        } catch (IOException e) {
            System.out.println("Se ha producido un error de lectura/escritura.");
            System.out.println(e.getMessage());
        }
    }
}