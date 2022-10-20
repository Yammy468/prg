import java.util.Scanner;

public class S05Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca un número entero: ");
    long numero = s.nextLong();
    int digito = 1;
    
    while (numero > 10) {
      numero /= 10;
      digito ++;
    }
    System.out.printf("El número introducido tiene " + digito + " digitos");
     
   }
  }
