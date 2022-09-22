import java.util.Scanner;

public class S03Ejercicio05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introducir datos del rectángulo (puede contener decimales) separado por espacios: ");
    
    double x1 = s.nextDouble();
    double x2 = s.nextDouble();
    
    double area = (x1 * x2);
    
    System.out.println("La área de un rectángulo, cuyas medidas son " + x1 + " m y " + x2 + " m, es " + area + " m²");
    
  }
}
