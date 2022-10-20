import java.util.Scanner;

public class S05Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor introduzca una lista de 10 números: "); 
    
    int positivo = 0;
    int negativo = 0;
    
    int i = 0;
    
    while (i < 10) {
      if (s.nextInt() < 0) {
        negativo ++;
      } else { 
        positivo ++;
      }
      i++;
    }
    System.out.println("Has introducido " + positivo + " números positivos y " + negativo + " negativos");

   }
  }
