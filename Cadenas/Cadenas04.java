import java.util.Scanner;
public class Cadenas04 {
  public static void main(String agrs[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca una cadena de palabras: ");
    String cadena = s.nextLine();
    System.out.println("\nAcontinuación introduzca un carácter: ");
    String caracter = s.nextLine();
    
    contiene(cadena,caracter);
  }
  
  /** 
   * Si el carácter por parámetro aparece en la cadena o no.
   * 
   * @param x es una cadena de palabra
   * @param y es un carácter
   * @return <code>true<code> el carácter si aparece 
   * @return <code>false<code> el carácter no aparece 
   * */
   
  public static void contiene(String x, String y) {
    x = x.toLowerCase().replace("á","a").replace("é","e").replace("í","i").replace("ó","o").replace("ú","u");
    int i;
    
    String oracion = "";
    for(i = 0; i < x.length(); i++) {
      oracion += x.charAt(i);
    }
    
    String oracion2 = "";
    for(i = 0; i < y.length(); i++) {
      oracion2 += y.charAt(i);
    }
    
    if(oracion.indexOf(oracion2) != -1) {
      System.out.println("\nLa cadena '" + oracion + "' contiene carácter true");
    } else {
    System.out.println("\nLa cadena '" + oracion + "' contiene carácter false");
    }
    
  }
  
}
  

