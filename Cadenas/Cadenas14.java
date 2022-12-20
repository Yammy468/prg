import java.util.Scanner;

public class Cadenas14 {
  public static void main(String agrs[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca una cadena de palabras: ");
    String cadena = s.nextLine();
    
    System.out.println("\n" + invierteCadena(cadena));
      
  }
  
  /** 
   * Invertir una cadena.
   * 
   * @param x es un cadena de palabra
   * @return la cadena invertida
   * */
   
  public static String invierteCadena(String x) {
    String oracion = "";
    for(int i = x.length()-1; i >= 0; i--) {
      oracion += x.charAt(i);
    }
    return oracion;
     
  }
  
}
  

