import java.util.Scanner;

public class Cadenas15 {
  public static void main(String agrs[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca una cadena de palabras: ");
    String cadena = s.nextLine();
    System.out.println("Acontinuación, introduzca un carácter de la cadena: ");
    char caracter = s.next().charAt(0);
    
    System.out.println("\nEl carácter '" + caracter + "' se repite " + vecesCaracter(cadena, caracter) + " veces");
      
  }
  
  /** 
   * Número de veces que se repite un carácter seleccionado de la cadena.
   * 
   * @param x es un cadena de palabra
   * @param n carácter seleccionado
   * @return números de veces que se repite el carácter
   * */
   
  public static int vecesCaracter(String x, char n) {
    x = x.toLowerCase().replace("á","a").replace("é","e").replace("í","i").replace("ó","o").replace("ú","u").replace(" ","").replace(",","").replace(".","");
    int contador = 0;
    
    for(int i = 0; i < x.length(); i++) {
      if(x.charAt(i) == n) {
        contador++;
      }
    }
    
    return contador; 
    
  }
  
}
  

