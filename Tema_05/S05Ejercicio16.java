import java.util.Scanner;

public class S05Ejercicio16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    boolean esPrimo = true;
    System.out.print("Introduzca un número entero y le diré si es primo: ");
    int numeroIntroducido = s.nextInt();
    
    for (int i = 2; i < numeroIntroducido; i++) {
      if ((numeroIntroducido % i) == 0) {
        esPrimo = false;
      }
    }
    if (esPrimo) {
      System.out.println("El número introducido es primo.");
    } else { 
      System.out.println("El número introducido no es primo.");
    }
    
   }
  }
