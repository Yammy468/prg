import java.util.Scanner;

public class S04Ejercicio21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Nota del primer control: ");
    double nota1 = s.nextDouble();

    System.out.print("Nota del segundo control: ");
    double nota2 = s.nextDouble();
    
    double media = (nota1 + nota2) / 2;
    
    if (media < 5) {
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      String recuperacion = s.next();
      if (recuperacion.equals("apto")) {
        media = 5;
      }
    }
    
    System.out.print("Tu nota de Programación es " + media);
    
   }
  }
