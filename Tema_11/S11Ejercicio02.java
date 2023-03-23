/**
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class S11Ejercicio02 {
    public static void main(String agrs[]) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
            
            String linea ="";
            while(linea != null) {
                System.out.print(linea + " ");
                linea = br.readLine();
            }
            br.close();

        } catch(FileNotFoundException e) { // cuando no encuentra el fichero 
            System.out.println("No se ha podido encontrar el fichero primos.dat");
        } catch(IOException e) { // cuando hay un error de lectura
            System.out.println("Error!, no se ha podido leer el fichero primos.dat");
        }
    }
}
