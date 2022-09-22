import java.util.Scanner;

public class S03Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introducir dos números (puede contener decimales) separado por espacios: ");
    
    double x1 = s.nextDouble();
    double x2 = s.nextDouble();
    
    double suma = (x1 + x2);
    double resta = (x1 - x2);
    double multiplicacion = (x1 * x2);
    double division = (x1 / x2);
    
    System.out.println("La suma de esos dos números es " + suma + ", la resta es " + resta + ", la multiplicacion es "+ multiplicacion + " y la division es " + division);
    
  }
}
