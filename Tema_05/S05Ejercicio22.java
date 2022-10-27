import java.util.Scanner;

public class S05Ejercicio22 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Números primos entre 2 y 100:");

    boolean esPrimo = true;

    for (int n = 2; n <= 100; n++) {
      // si el número es primo
      esPrimo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          esPrimo = false;
        }
      }

      if (esPrimo) {
        System.out.print(n + " ");
      }
    }
    System.out.println();
    
   }
  }
