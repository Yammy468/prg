import java.util.Scanner;

public class Cadenas11 {
  public static void main(String agrs[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca una cadena de palabras: ");
    String cadena = s.nextLine();
    
    System.out.println("\nLa cadena es número " + esNumero(cadena));    
    
  }
  
  /** 
   * Si la cadena esta formada enteramente de número o no.
   * 
   * @param x es un cadena de palabra
   * @return <code>true<code> la cadena si es número
   * @return <code>false<code> la cadena no es número
   * */
   
  public static boolean esNumero(String x) {
    // cuando hay espacio vacio
    if(x.equals(" ")) {
      return false;
    }
    for(int i = 0; i < x.length(); i++) {
      char c = x.charAt(i);
      
      // cuando esta entre 0 y 9
      if((c < '0') || (c > '9')) {
        return false;
      }
    }
    return true;
     
  }
  
}
  

