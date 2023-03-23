/**
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class S11Ejercicio01 {
  public static void main(String agrs[]) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
      
      for(int i = 1; i < 501; i++) {
        if(esPrimo(i)) {
          bw.write(String.valueOf(i) + "\n");
        }
      }
      bw.close();

    } catch(IOException e) { // cuando hay un error 
      System.out.println("Error de escritura.");
    }
  }

  /* 
  * Un número es primo cuando es divisible únicamente entre el mismo y entre 1. 
  * 
  * @param n numero del que se quiere saber si es primo o no
  * @return verdadero si es primo y falso si no es primo
  * */
  public static boolean esPrimo(int n) {
    for(int i = 2; i < n; i++) {
      if((n % i) == 0) {
        return false;
      } 
    }
    return true;
  }
}


