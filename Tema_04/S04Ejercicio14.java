import java.util.Scanner;

public class S04Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca un número entero: ");
    int n = s.nextInt();
    
    if ((n % 2) == 0) {
      System.out.println("El número introducido es par");
    } else {
      System.out.println("Lo siento, el número introducido es impar");
    }
    
    if ((n % 5) == 0) {
      System.out.println("El número introducido es divisible entre 5");
    } else {
      System.out.println("Lo siento, el número introducido no es divisible entre 5");
    }
     
  }
}
    
