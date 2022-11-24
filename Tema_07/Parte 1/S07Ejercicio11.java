import java.util.Scanner;

public class S07Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] n = new int[10];
    int[] primo = new int[10];
    int[] noPrimo = new int[10];
    int i;
    int j;
    int primos = 0;
    int noPrimos = 0;
    boolean esPrimo = false;
    
    System.out.println("Introduzca 10 números separados por INTRO:");

    for (i = 0; i < 10; i++) {
      n[i] = s.nextInt();
      
      // Comprueba si el número es o no primo.
      esPrimo = true;
      for (j = 2; j < n[i] - 1; j++) {
        if (n[i] % j == 0) {
          esPrimo = false;
        }
      }
      
      // Si el número es primo, se mete en un array y si
      // no es primo, se mete en otro diferente.
      if (esPrimo) {
        primo[primos++] = n[i];
      } else {
        noPrimo[noPrimos++] = n[i];
      }
    }
    
    System.out.println("\n\nArray original:\n");

    System.out.print(" Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("|");
    
    for(i = 0; i< 75; i++) {
      System.out.print("-");
    }
    System.out.println("-");
    
    System.out.print(" Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    System.out.println("│");
    
    // Lo primo
    for (i = 0; i < primos; i++) {
      n[i] = primo[i];
    }
    
    // Lo no primo
    for (i = primos; i < primos + noPrimos; i++) {
      n[i] = noPrimo[i - primos];
    }

    // Muestra el resultado.
    System.out.println("\n\nArray con los primos al principio:\n");
    
    System.out.print(" Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("|");
    
    for(i = 0; i< 75; i++) {
      System.out.print("-");
    }
    System.out.println("-");
    
    System.out.print(" Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    System.out.println("│");
    
  }
}

