import java.util.Scanner;
public class Cadenas03 {
  public static void main(String agrs[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca una cadena de palabras: ");
    String cadena = s.nextLine();
    
    System.out.println("\nPalindromo " + esPalindromo(cadena));
  }
  
  /** 
   * Si la cadena es o no palindromo
   * 
   * @param x es una cadena de palabra
   * @return <code>true<code> la cadena es palindromo
   * @return <code>false<code> la cadena no es palindromo
   * */
   
  public static boolean esPalindromo(String x) {
    // Condición de Palindromo
    x = x.toLowerCase().replace("á","a").replace("é","e").replace("í","i").replace("ó","o").replace("ú","u").replace(" ","").replace(",","").replace(".","");
    
    // Recorrer la cadena
    String oracion = "";
    for(int i = 0; i < x.length(); i++) {
      oracion += x.charAt(i);
    }
    
    // Invertida
    String invertida = "";
    for(int i = x.length()-1; i >=0; i--) {
      invertida += x.charAt(i);
    }
    
    if(oracion.equals(invertida)) {
      return true;
    }
    return false;
    
  }
  
}
  

