import java.util.Scanner;

public class S04Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero: ");
    int n = s.nextInt();
    System.out.println("La última cifra del número introducido es el " + (n % 10));
    
  }
}
    
