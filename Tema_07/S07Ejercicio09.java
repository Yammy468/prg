import java.util.Scanner;

public class S07Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] numero = new int[8];
    int i;
    
    System.out.println("Introduzca 8 números enteros, pulse INTRO después de cada número:");

    for (i = 0; i < 8; i++) {
      numero[i] = s.nextInt();
    }

    System.out.println();
    
    for (i = 0; i < 8; i++) {
      if (numero[i] % 2 == 0) {
        System.out.println(numero[i] + " par");
      } else {
        System.out.println(numero[i] + " impar");
      }
    }
    
  }
}

