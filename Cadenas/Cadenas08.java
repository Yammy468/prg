import java.util.Scanner;
public class Cadenas08 {
  public static void main(String agrs[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca una cadena de palabra: ");
    String cadena = s.nextLine();
    
    System.out.println("\n" + quitaEspaciosTrim(cadena));    
    
  }
  
  /** 
   * Quitar espacios en una cadena de palabra solo al principio y al final
   * 
   * @param x es un cadena de palabra
   * @return la cadena sin espacio 
   * */
   
  public static String quitaEspaciosTrim(String x) {
    x = x.replaceAll("^\\s*", "").replaceAll("\\s*$", "");
    
    String oracion = "";
    for(int i = 0; i < x.length(); i++) {
      oracion += x.charAt(i);
    }
    return oracion;
     
  }
  
}
  

