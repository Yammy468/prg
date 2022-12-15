import java.util.Scanner;
public class Cadenas06 {
  public static void main(String agrs[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca una cadena de palabra: ");
    String cadena = s.nextLine();
    System.out.println("\nAcontinuación introduzca una longitud final: ");
    int longitud = s.nextInt();
    
    padLeft(cadena, longitud);
    padRight(cadena, longitud);
    
  }
  
  /** 
   * Añadir espacios delante (padLeft) y detrás (padRight) de una cadena de palabra.
   * 
   * @param x es un cadena de palabra
   * @param n es un entero
   * @return el espacio añadido  
   * */
   
  public static String padLeft(String x, int n) {
    int i;
    
    String oracion = "";
    for(i = 0; i < x.length(); i++) {
      oracion += x.charAt(i);
    }
    
    
    String letra = "~";
    for(i = 0; i < letra.length(); i++) {
      for(i = 0; i < n; i++) {
      }
      System.out.println("\n'" + letra.repeat(n) + oracion + "' (~ = espacio)");
    }
    
    return oracion;
     
  }
  
  public static String padRight(String x, int n) {
    int i;
    
    String oracion = "";
    for(i = 0; i < x.length(); i++) {
      oracion += x.charAt(i);
    }
    
    
    String letra = "~";
    for(i = 0; i < letra.length(); i++) {
      for(i = 0; i < n; i++) {
      }
      System.out.println("'" + oracion + letra.repeat(n) + "' (~ = espacio)");
    }
    
    return oracion;
     
  }
  
}
  

