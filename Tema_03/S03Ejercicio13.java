import java.util.Scanner;

public class S03Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la nota del primwer examen: ");
    double nota1 = s.nextDouble();
    
    System.out.print("¿Qué nota quieres sacar en el trimestre?  ");
    double total = s.nextDouble();
    
    double calculo = (nota1 * 0.4);
    
    // 2.8 + 0.6x = 8.5
    // 0.6x = 8.5 - 2.8
    // x = (8.5 - 2.8) / 0.6
    
    double nota2 = ((total - calculo) / 0.6);
    
    System.out.println("Para tener un " + total + " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen.");
    
  }
}
