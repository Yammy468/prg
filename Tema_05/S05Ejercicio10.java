import java.util.Scanner;

public class S05Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Para calcular la media. ");
    System.out.print("Introduzca una serie de números(para terminar introduzca un número negativo):\n");

    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;
  
    while (numeroIntroducido >= 0) {
      numeroIntroducido = s.nextDouble();
      numeros ++;
      suma += numeroIntroducido;
      
    }
    
    System.out.print("La media de los números positivos introducidos es ");
    System.out.println((suma - numeroIntroducido) / (numeros - 1));
    
   }
  }
