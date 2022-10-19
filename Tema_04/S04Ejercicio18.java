import java.util.Scanner;

public class S04Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca un número entero (se permite hasta 5 dígitos): ");
    int numero = s.nextInt();
    
    if (numero <10) {
      int primera = numero;
      System.out.println("La primera cifra es " + primera);
    }
    
    if ((numero > 10) && (numero < 100)) {                                            
      int primera = numero / 10;
      System.out.println("La primera cifra es " + primera);
    }
    
    if ((numero > 100) && (numero < 1000)) {                                            
      int primera = numero / 100;
      System.out.println("La primera cifra es " + primera);
    }
    if ((numero > 1000) && (numero < 10000)) {                                            
      int primera = numero / 1000;
      System.out.println("La primera cifra es " + primera);
    }
    if ((numero > 10000) && (numero < 100000)) {                                            
      int primera = numero / 10000;
      System.out.println("La primera cifra es " + primera);
    }
  }
}
    
