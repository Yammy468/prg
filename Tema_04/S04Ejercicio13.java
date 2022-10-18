import java.util.Scanner;

public class S04Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Por favor, introduzca tres números enteros por separado: ");
    System.out.print("Valor de a = ");
    int a = s.nextInt();
    System.out.print("Valor de b = ");
    int b = s.nextInt();
    System.out.print("Valor de c = ");
    int c = s.nextInt();
    
    int P;
    int S;
    int T;
    
    if ((a > b) && (a > c)) {
      P = a;
      if (b > c) {
        S = b;
        T = c;
      } else {
        S = c;
        T = b;
      }
      
      System.out.println("Los números introducido y ordenado de menor a mayor queda de la siguente manera " + T + ", " + S + " y "+ P);
      
    }
    
    if ((b > c) && (b > a)) {
      P = b;
      if (a > c) {
        S = a;
        T = c;
      } else { 
        S = c;
        T = a;
      }
      
      System.out.println("Los números introducido y ordenado de menor a mayor queda de la siguente manera " + T + ", " + S + " y "+ P);
      
    } 
    if ((c > b) && (c > a)) { 
      P = c;
      if (a > b) {
        S = a;
        T = b;
      } else {
        S = b;
        T = a;
      }
    
      System.out.println("Los números introducido y ordenado de menor a mayor queda de la siguente manera " + T + ", " + S + " y "+ P);
    
    }
     
  }
}
    
