import java.util.Scanner;

public class S05Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int numeroIntroducido = 0;
    
    System.out.print("Introduzca un número entero positivo: ");
    numeroIntroducido = s.nextInt();
    
    while (numeroIntroducido < 0) {
      if (numeroIntroducido < 0) {
        System.out.println("Lo siento, el número introducido debe ser positivo");
      }
    } 
    
    int suma = 0;
    for (int i = numeroIntroducido; i < numeroIntroducido +100; i++) {
      suma += i;
    }
    
    System.out.println("La suma de los 100 números siguientes a " + numeroIntroducido + " es " + suma + ".");
    
   }
  }
