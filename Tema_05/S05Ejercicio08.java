import java.util.Scanner;

public class S05Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número y le mostraré su tabla de multiplicar: ");
    int numeroIntroducido = s.nextInt();
        
    for (int i = 0; i <= 10; i++) {
      System.out.printf("%d x %2d = %3d\n", numeroIntroducido, i, numeroIntroducido * i);
    }
    
   }
  }
