import java.util.Scanner;

public class S05Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero: ");
    int numero = s.nextInt();
    int i = numero;
    
    System.out.println("  n  |  n²  |  n³  ");
    System.out.println("---------------------");
    
    while (i < numero + 5) {
    System.out.printf("%4d |%5d |%6d\n", i, i * i, i * i * i);
    i ++;
    }
   
   }
  }
