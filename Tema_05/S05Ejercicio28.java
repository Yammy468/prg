import java.util.Scanner;

public class S05Ejercicio28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int numeroIntroducido;
    
    // Lee un número mayor o igual que 0
    do {
      System.out.print("Por favor, introduzca un número entero: ");
      numeroIntroducido = s.nextInt();
      
      if (numeroIntroducido < 0) {
        System.out.println("El número introducido no es correcto.");
      }
    } while (numeroIntroducido < 0);

    int factorial = numeroIntroducido;
    
    if (numeroIntroducido == 0) {
      System.out.println("0! = 1");
    } else {
      for (int i = 1; i < numeroIntroducido; i++) {
        factorial *= i;
      }

      System.out.println(numeroIntroducido + "! = " + factorial);
    }
    
   }
  }
