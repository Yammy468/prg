import java.util.Scanner;

public class S04Ejercicio19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca un número entero (se permite hasta 5 dígitos): ");
    int numero = Math.abs(s.nextInt());
    
    if (numero < 10) {
      int digito = 1;
      System.out.println("Tiene " + digito + " dígito");
    }
    
    if ((numero >= 10) && (numero < 100)) {                                            
      int digito = 2;
      System.out.println("Tiene " + digito + " dígitos");
    }
    
    if ((numero >= 100) && (numero < 1000)) {                                            
      int digito = 3;
      System.out.println("Tiene " + digito + " dígitos");
    }
    
    if ((numero >= 1000) && (numero < 10000)) {                                            
      int digito = 4;
      System.out.println("Tiene " + digito + " dígitos");
    }
    
    if ((numero >= 10000) && (numero < 100000)) {                                            
      int digito = 5;
      System.out.println("Tiene " + digito + " dígitos");
    }
   }
  }
