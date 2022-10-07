import java.util.Scanner;

public class S04Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        
    System.out.print("Introduce las notas de tres examenes (puede incluir decimales) separados por espacio: ");
    
    double x1 = s.nextDouble();
    double x2 = s.nextDouble();
    double x3 = s.nextDouble();
    
    double media = (x1 + x2 + x3)/3;
    
    System.out.println("La media de las tres notas es " + media);
    
  }
  
}

