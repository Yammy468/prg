import java.util.Scanner;

public class S05Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
    System.out.print("Por favor, introduzca n: ");
    int n = s.nextInt();

    switch (n) {
      case 1:
        System.out.print("0");
        break;
      case 2:
        System.out.print("0 1");
        break;
      default:
        System.out.print("0 1");
        int n1 = 0;
        int n2 = 1;
        int n3;
        while(n > 2) {
          n3 = n1;
          n1 = n2;
          n2 = n3 + n2;
          System.out.print(" " + n2);
          n--;
        }
    }
    System.out.println();
   
   }
  }
