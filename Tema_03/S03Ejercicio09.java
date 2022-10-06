import java.util.Scanner;

public class S03Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introducir el radio y la altura, respectivamente, del cono separado por espacios: ");
    
    double r = s.nextDouble();
    double h = s.nextDouble();
    
    double pi = 3.14;
    double volumen = (1.0 / 3.0 * pi * (r * r) * h );
    
    System.out.println("El volumen del cono es " + volumen + " m³");
    
  }
}
