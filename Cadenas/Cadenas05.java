import java.util.Scanner;
public class Cadenas05 {
  public static void main(String agrs[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca un carácter: ");
    String caracter = s.nextLine();
    System.out.println("\nAcontinuación introduzca un número entero: ");
    int entero = s.nextInt();
    
    System.out.println("\nRepetir Carácter ('" + caracter + ", " + entero + "') = '" + repiteCaracter(caracter, entero) + "'");
 
  }
  
  /** 
   * Aparece en una cadena, el carácter repetido tantas veces como indique el número entero.
   * 
   * @param x es un carácter
   * @param n es un entero
   * @return el carácter repito tanta veces como indique el entero 
   * */
   
  public static String repiteCaracter(String x, int n) {

    return x.repeat(n);
    
  }
  
}
