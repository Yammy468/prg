import java.util.Scanner;

public class S04Ejercicio05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        
    System.out.println("Resuelve una ecuación de primer grado: ");
    System.out.println("ax + b = 0");
    
    double x;
    
    System.out.print("Valor de a = ");
    double a = s.nextDouble();
    System.out.print("Valor de b = ");
    double b = s.nextDouble();
    
    //0x + 0 = 0
    if ((a==0) && (b==0)) {
      System.out.println("Infinitas soluciones");
    }
     
    //0x + b = 0, b distinto de 0
    if ((a==0) && (b!=0)) {
      System.out.println("No tiene solucion");
    }
    
    //ax + 0 = 0, a distinto de 0
    if ((a!=0) && (b==0)) {
      System.out.println("x = 0/a" );
    }
    
    //a , b distinto de 0 
    if ((a != 0) && (b!=0)) {
      double solucion = - b / a;
      System.out.println("x = " + solucion);
    }
    
  }
  
}

