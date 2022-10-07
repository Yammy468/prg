import java.util.Scanner;

public class S04Ejercicio06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        
    System.out.println("Calcula el tiempo que tarda en caer un objeto desde una altura h.");
    System.out.println("Aplica la formula t = √(2h/g) siendo g = 9.81m/s²");
    
    System.out.print("\nValor de h: ");
    double h = s.nextDouble();
    
    double g = 9.81;
    double raiz = (2 * h) / g;
    double t = Math.sqrt(raiz);
    
    System.out.println("El tiempo que tarda en caer un objeto desde " + h + " m de altura es " + t + " segundos");

  }
  
}

