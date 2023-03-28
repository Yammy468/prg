/**
 * Escribe un programa capaz de quitar los comentarios de un programa de Java.
 * Se utilizaría de la siguiente manera:
 * quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
 * 
 * Por ejemplo:
 * quita_comentarios hola.java holav2.java
 * crea un fichero con nombre holav2.java que contiene el código de hola.java pero
 * sin los comentarios.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class S11Ejercicio05 {
    public static void main(String args[]) {
        if(args.length != 2) {
            System.out.println("Uso del programa: java S11Ejercicio05 PROGRAMA_ORIGINAL PROGRAMA_LIMPIO");
            System.out.println("Ejemplo de uso del programa: java S11Ejercicio05 Hola.java Holav2.java");
            System.exit(-1); // salir del programa
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

            String lineaOrigen = "";
            String lineaDestino = "";
            boolean comentario = false;
            int i = 0;

            while((lineaOrigen = br.readLine()) != null) {
                int l = lineaOrigen.length();
                lineaDestino = lineaOrigen;

                // Detectar el inicio del comentario
                if((i = lineaOrigen.indexOf("/**")) != -1) {
                    comentario = true;
                    lineaDestino = lineaOrigen.substring(0, i);
                }

                // Detectar el final del comentario 
                if((i = lineaOrigen.indexOf("*/")) != -1) {
                    comentario = false;
                    lineaDestino = lineaOrigen.substring(i + 2, l);
                }

                // Detectar los comentarios entre lineas
                if(((i = lineaOrigen.indexOf("//")) != -1) && !comentario) {
                    lineaDestino = lineaOrigen.substring(0, i);
                }

                if(!comentario) {
                    bw.write(lineaDestino + "\n");
                }
            }

            br.close();
            bw.close();
  
        } catch(IOException e) {
            System.out.println("Se ha producido un error de lectura/escritura.");
            System.out.println(e.getMessage());
        }
    }
}
