import java.util.Scanner;

public class S07Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] n = new int[10];
    int[] primo = new int[10];
    int[] noPrimo = new int[10];
    int i, j;
    int primos = 0;
    int noPrimos = 0;
    boolean esPrimo = true;
    
    System.out.println("Inrtroduzca 10 números:");
    
    for(i = 0; i < 10; i++) {
      n[i] = s.nextInt();
      esPrimo = true;
      for (j = 2; j < n[i] - 1; j++) {
        if (n[i] % j == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        primo[primos++] = n[i];
      } else {
        noPrimo[noPrimos++] = n[i];
      }
     }
    
    System.out.println("\nArray INICIAL\n");
    
    System.out.print(" Índice ");
    for(i = 0; i < 10; i++) {
      System.out.printf("|%4d ", i);
    }
    System.out.println("|");
    for(i = 0; i < 75; i++) {
      System.out.print("-");
    }
    System.out.println("-");
    System.out.print(" Valor  ");
    for(i = 0; i < 10; i++) {
      System.out.printf("|%4d ", n[i]);
    }
    System.out.println("|");
    
    // Lo primo
    for(i = 0; i < primos; i++) {
      n[i] = primo[i];
    }
    // Lo no primo
    for(i = primos; i < 10; i++) {
      n[i] = noPrimo[i - primos];
    }
    
    // Resultado
    System.out.println("\n\nArray RESULTADO\n");
    
    System.out.print(" Índice ");
    for(i = 0; i < 10; i++) {
      System.out.printf("|%4d ", i);
    }
    System.out.println("|");
    for(i = 0; i < 75; i++) {
      System.out.print("-");
    }
    System.out.println("-");
    System.out.print(" Valor  ");
    for(i = 0; i < 10; i++) {
      System.out.printf("|%4d ", n[i]);
    }
    System.out.println("|");
    
  }
}

