import java.util.Scanner;

public class S03Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce dos números (puedes contener decimales) separados por espacio: ");
    
    double x1 = s.nextDouble();
    double x2 = s.nextDouble();
    
    double multiplicacion = (x1 * x2);
    
    System.out.println("La mupltiplicación de esos dos números es " + multiplicacion);
  }
}
