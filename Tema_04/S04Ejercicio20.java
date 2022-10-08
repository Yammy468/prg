import java.util.Scanner;

public class S04Ejercicio20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int n;
    boolean capicua = false;
    
    System.out.print("Introduzca un número entero (de 5 cifras como máximo): ");
    n = s.nextInt();
    
    
    // número de una cifra
    if (n < 10) {
      capicua = true;
    }
    
    // número de dos cifras
    if ((n >= 10) && (n < 100)) {
      if ((n / 10) == (n % 10)) {
        capicua = true;
      }
    }

    // número de tres cifras
    if ((n >= 100) && (n < 1000)) {
      if ((n / 100) == (n % 10)) {
        capicua = true;
      }
    }

    // número de cuatro cifras
    if ((n >= 1000) && (n < 10000)) {
      if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
        capicua = true;
      }
    }
    
    // número de cinco cifras
    if (n >= 10000) {
      if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (capicua) {
      System.out.println("El número introducido es capicúa.");
    } else {
      System.out.println("El número introducido no es capicúa.");
    }
    
   }
  }
