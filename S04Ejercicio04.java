import java.util.Scanner;

public class S04Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introducir las horas trabajadas: ");
    
    double horas = s.nextDouble();
    
    if (horas <= 40) {
      double salarios = 12.00;
      double dia = (horas * salarios);
      double semana = (dia * 7);
      
      System.out.println("El salario de un empleado a la semana es de " + semana + " euros");
    
    } else {
      double extra = 16.00;
      double dia2 = (horas * extra);
      double semana2 = (dia2 * 7);
      
      System.out.println("El salario de un empleado a la semana es de " + semana2 + " euros");
    }
    
  }
  
}

