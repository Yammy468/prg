import java.util.Scanner;

public class S07Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] n = new int[10];
    
    System.out.println("Por favor, introduzca una lista de 10 números enteros (separados por espacio o por la tecla INTRO): "); 
    for (int i = 0; i < 10; i++) {
      n[i] = s.nextInt();
    }    
    
    System.out.println("\nLos números introducido, al revés, son los siguientes: ");
    for (int i = 9; i >= 0; i--) {
      System.out.println(n[i]);
    }    
  }
}

