import java.util.Scanner;
public class Cadenas07 {
  public static void main(String agrs[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca una cadena de palabra: ");
    String cadena = s.nextLine();
    
    System.out.println("\n" + quitaEspacios(cadena));    
    
  }
  
  /** 
   * Quitar espacios en una cadena de palabra
   * 
   * @param x es un cadena de palabra
   * @return la cadena sin espacio 
   * */
   
  public static String quitaEspacios(String x) {
    
    String oracion = "";
    for(int i = 0; i < x.length(); i++) {
      if(x.charAt(i) != ' ') {
        oracion += x.charAt(i);
      }
    }
    return oracion;
     
  }
  
}
  

