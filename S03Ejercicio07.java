import java.util.Scanner;

public class S03Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introducir el precio de la factura (sin el IVA): ");
    
    double baseImponible = s.nextDouble();
    double total = (baseImponible * 1.21);
    
    System.out.println("El total de la factura es " + total);
    
  }
}
