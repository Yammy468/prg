import java.util.Scanner;

public class S05Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;

    System.out.println("Este programa calcula la media de los números positivos introducidos.");
    System.out.println("Para parar, introduzca un número negativo.");
    System.out.println("Vaya introduciendo números:");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = s.nextDouble();
      numeros++;
      suma += numeroIntroducido;
    }
    
    System.out.print("La media de los números positivos introducidos es ");
    System.out.println((suma - numeroIntroducido) / (numeros - 1));
   
   }
  }
