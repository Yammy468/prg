import java.util.Scanner;
import java.util.StringTokenizer;

public class Cadenas10 {
  public static void main(String agrs[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca una cadena de palabras: ");
    String cadena = s.nextLine();
    
    System.out.println("\nEn la cadena hay " + cuentaPalabras(cadena) + " palabras");    
    
  }
  
  /** 
   * Cuenta las palabras que hay en una cadena
   * 
   * @param x es un cadena de palabra
   * @return número de palabra que hay en la cadena 
   * */
   
  public static int cuentaPalabras(String x) {
    StringTokenizer st = new StringTokenizer(x);
    
    return st.countTokens();
     
  }
  
}
  

