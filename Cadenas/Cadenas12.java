import java.util.Scanner;

public class Cadenas12 {
  public static void main(String agrs[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca una cadena de palabras: ");
    String cadena = s.nextLine();
    System.out.println("Acontinuación, introduzca un carácter contenida en la cadena: ");
    String caracter = s.next();
    
    System.out.println("\n" + quitaCaracter(cadena, caracter));
      
  }
  
  /** 
   * Quitar los carácteres seleccionado de una cadena
   * 
   * @param x es un cadena de palabra
   * @param f es un carácter de la cadena
   * @return nueva cadena sin el carácter seleccionado
   * */
   
  public static String quitaCaracter(String x, String c1) {
    
    return x.replace(c1, "");
     
  }
  
}
  

