import java.util.Scanner;

public class Cadenas13 {
  public static void main(String agrs[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca una cadena de palabras: ");
    String cadena = s.nextLine();
    
    System.out.println("\n" + quitaAcentos(cadena));
      
  }
  
  /** 
   * Quitar los acentos de los carácteres de la cadena.
   * 
   * @param x es un cadena de palabra
   * @return nueva cadena sin los acentos
   * */
   
  public static String quitaAcentos(String x) {

    return x.replace("á","a").replace("é","e").replace("í","i").replace("ó","o").replace("ú","u");
     
  }
  
}
  

