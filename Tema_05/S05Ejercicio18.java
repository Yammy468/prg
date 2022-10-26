import java.util.Scanner;

public class S05Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int primerNumero;
    int segundoNumero;
    
    // cuando los núemros pedido sean distintos
    do {
    System.out.print("Introduzca el primer número entero: ");
    primerNumero = s.nextInt();
    System.out.print("Acontinuación, introduzca el segundo número: ");
    segundoNumero = s.nextInt();
    
      if (primerNumero == segundoNumero) {
        System.out.println("Lo siento, los números introducidos no son válidos");
      }
    } while (primerNumero == segundoNumero);
    
    // cuando el primer numero es mayor que el segundo
    if (primerNumero > segundoNumero) {
      int cambio = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = cambio;
    }
    
    for (int i = primerNumero; i <= segundoNumero; i +=7) {
      System.out.print(i + " ");
    }
    
    System.out.println();
    
   }
  }
