import java.util.Scanner;

public class S04Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        
    double x1, x2;

    System.out.println("Resuelve una ecuacion de 2o grado");
    System.out.println("Del tipo:  ax^2 + bx + c = 0");

    System.out.print("\nValor de a =");
    double a = s.nextDouble();
    System.out.print("Valor de b =");
    double b = s.nextDouble();
    System.out.print("Valor de c =");
    double c = s.nextDouble();

    // 0x^2 + 0x + 0 = 0
    if ((a==0) && (b==0) && (c==0)) {
      System.out.println("Infinitas soluciones");
    }

    // 0x^2 + 0x + c = 0 c distinto de 0
    if ((a==0) && (b==0) && (c!=0)) {
      System.out.println("No tiene solucion");
    }

    // ax^2 + bx + 0 = x * (ax + b) = 0 con a y b distinto de 0
    if ((a!=0) && (b!=0) && (c==0)) {
      System.out.println("x1 = 0");
      System.out.println("x2 = -b/a");
    }
    
    // a, b, c distinto de 0
    if ((a!=0) && (b!=0) && (c!=0)) {
    double discriminante = b*b - (4 * a * c);
      if (discriminante < 0)
        System.out.println("La solucion no es real");
      else {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminante)) / (2 *a));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminante)) / (2 *a));
      }

    }
  }
}
