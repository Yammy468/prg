/**
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class S11Ejercicio06 {
    public static void main(String args[]) {
        if(args.length != 2) {
            System.out.println("Uso del programa: java S11Ejercicio06 FICHERO PALABRA");
            System.exit(-1); // salir del programa
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String palabra = args[1];

            String linea = "";
            int i = 0;
            int repeticion = 0;

            while((linea = br.readLine()) != null) {
                while((i = linea.indexOf(palabra)) != -1) {
                    linea = linea.substring(i + palabra.length(), linea.length());
                    repeticion++;
                }
            }
            br.close();

            String rojo = "\033[31m";
            String blanco = "\033[37m";
            System.out.println("La palabra " + rojo + palabra + blanco + " aparece " + repeticion + " veces en el fichero.");

        } catch (IOException e) {
            System.out.println("Se ha producido un error de lectura.");
            System.out.println(e.getMessage());
        }
    }
}