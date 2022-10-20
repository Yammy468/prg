import java.util.Scanner;

public class S05Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca un número entero: ");
    int numero = s.nextInt();

    for (int i = 0; i <= 10; i++) {
      System.out.printf(numero + "  x  " + i + "  =  " + (numero * i) + "\n");
    }
    
   }
  }
