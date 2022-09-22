import java.util.Scanner;

public class S03Ejercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introducir la cantidad de euros que desea: ");
    
    double euros = s.nextDouble();
    double pesetas = 166.386;
    double multiplicacion = (euros * pesetas);
    
    System.out.println(euros +" euros son " + multiplicacion + " pesetas");
  }
}
