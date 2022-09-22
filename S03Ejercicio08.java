import java.util.Scanner;

public class S03Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introducir las horas trabajadas: ");
    
    double horas = s.nextDouble();
    double salarios = 12.00;
    
    double dia = (horas * salarios);
    double semana = (dia * 7);
    
    System.out.println("El salario de un empleado a la semana es de " + semana + " euros");
    
  }
}
