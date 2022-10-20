import java.util.Scanner;

public class S05Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca una base entera: ");
    int base = s.nextInt();
    System.out.print("acontinuación, introduzca un exponente entero: ");
    int exponente = s.nextInt();
    
    int potencia = 1;
    
    if (exponente == 0) {
      potencia = 1;
    }
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++){
        potencia *= base;
      }
    }
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++){
       potencia *= base;
     }
     potencia = 1/potencia;
    }
    System.out.println("La potencia de " + base + "^" + exponente + " es " + potencia);
    
   }
  }
