import java.util.Scanner;
public class Cadenas01 {
  public static void main(String agrs[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca una cadena de palabras (con los espacios): ");
    String cadena = s.nextLine();
    
    System.out.println("Hay " + numeroEspacio(cadena) + " espacios");
  }
  
  /** 
   * Número de espacio que contiene una cadena de palabra
   * 
   * @param x es una cadena de palabra
   * @return numero de espacio
   * */
   
  public static int numeroEspacio(String x) {
    int contador = 0;
    
    // Recorrer la cadena
    for(int i = 0; i < x.length(); i++) {
      if(x.charAt(i) == ' ') {
        contador++;
      }
    }
    
    // Resultado
    return contador;
  }
  
}
