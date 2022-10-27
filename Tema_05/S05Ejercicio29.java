import java.util.Scanner;

public class S05Ejercicio29 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero positivo (relativamente grande): ");
    int numeroGrande = s.nextInt();

    System.out.print("Introduzca otro número (relativamente pequeño): ");
    int numeroPequeno = s.nextInt();

    System.out.println("Los números enteros positivos menores que " + numeroGrande + " que no son divisibles entre " + numeroPequeno + " son los siguientes:");

    int cuenta = 0;
    int suma = 0;

    for (int i = 1; i < numeroGrande; i++) {
      if ((i % numeroPequeno) != 0) {
        System.out.print(i + " ");
      }
    }
    
   }
  }
