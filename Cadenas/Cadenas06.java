import java.util.Scanner;
public class Cadenas06 {
  public static void main(String agrs[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca una cadena de palabra: ");
    String cadena = s.nextLine();
    System.out.println("\nAcontinuación introduzca una longitud final: ");
    int longitud = s.nextInt();
    
    System.out.println("\n'" + padLeft(cadena, longitud) + cadena + "' (~ = espacio)");
    System.out.println("\n'" + cadena + padRight(cadena, longitud) + "' (~ = espacio)");    
  }
  
  /** 
   * Añadir espacios delante (padLeft) y detrás (padRight) de una cadena de palabra.
   * 
   * @param n es un entero
   * @return el espacio añadido  
   * */
   
  public static String padLeft(String x, int n) {
    x = "~";
    return x.repeat(n);
  }
  
  public static String padRight(String x, int n) {
    x = "~";
    return x.repeat(n);
  }
  
}
