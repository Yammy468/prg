import java.util.Scanner;

public class S03Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introducir la cantidad de Mb deseado: ");
    
    double Mb = s.nextDouble();
    double Kb = 1000;
    
    double multiplicacion = (Mb * Kb);
    
    System.out.println(Mb + " Mb son " + multiplicacion + " Kb");
    
  }
}
