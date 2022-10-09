import java.util.Scanner;

public class S05Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    long numeroIntroducido = s.nextLong();
    
    long n = numeroIntroducido;
    int numeroDeDigitos = 1;
    
    while (n > 10) {
      numeroDeDigitos++;
      n /= 10;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
    
   }
  }
