import java.util.Scanner;

public class S04Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca un número entero: ");
    int numero = s.nextInt();
    
    int ultima = numero % 10;
    System.out.println("La última cifra es " + ultima);
    
  }
}
    
