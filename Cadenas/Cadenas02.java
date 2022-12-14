import java.util.Scanner;
public class Cadenas02 {
  public static void main(String agrs[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca una cadena de palabras: ");
    String cadena = s.nextLine();
    
    System.out.println("Hay " + numeroVocales(cadena) + " vocales");
  }
  
  /** 
   * Número de vocales que tiene una cadena de palabra
   * 
   * @param x es una cadena de palabra
   * @return numero de vocales
   * */
   
  public static int numeroVocales(String x) {
    char[] vocales = {
      'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'
    };
    int contador = 0;

    // Recorrer la cadena
    for(int i = 0; i < x.length(); i++) {
      for(char v: vocales) {
        if(x.charAt(i) == v) {
          contador++;
        }
      }
    }
    
    // Resultado
    return contador;
  }
  
}
