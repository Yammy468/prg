import java.util.Scanner;
public class Cadenas09 {
  public static void main(String agrs[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca una cadena de palabra: ");
    String cadena = s.nextLine();
    System.out.println("Acontinuación introduzca el carácter seleccionado de la cadena de palabra: ");
    String caracter1 = s.next();
    System.out.println("Luego, introduzca otro carácter nuevo para sustituir al carácter anterios seleccionado: ");
    String caracter2 = s.next();
    
    System.out.println("\n" + sustituyeCaracter(cadena, caracter1, caracter2));    
    
  }
  
  /** 
   * Sustituir el primer carácter por el segundo carácter en una cadena de palabra
   * 
   * @param x es un cadena de palabra
   * @param s1 el carácter seleccionado
   * @param s2 el carácter nuevo
   * @return la cadena nueva con los carácteres sustituido
   * */
   
  public static String sustituyeCaracter(String x, String s1, String s2) {
    
    return x.replace(s1, s2);
    
  }
  
}
