import java.util.Scanner;

public class S03Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introducir la cantidad de Kb deseado: ");
    
    double Kb = s.nextDouble();
    
    double division = (Kb / 1000);
    
    System.out.println(Kb + " Kb son " + division + " Mb");
    
  }
}
