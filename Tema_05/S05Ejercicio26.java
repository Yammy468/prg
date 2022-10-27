import java.util.Scanner;

public class S05Ejercicio26 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero: ");
    long numeroIntroducido = s.nextLong();

    System.out.print("Introduzca un dígito: ");
    int digito = s.nextInt();

    System.out.print("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + numeroIntroducido + "en la(s) posicion(es): ");
        
    // se hace una copia del número introducido
    long numero = numeroIntroducido;
    
    // añade un 1 al final por si el número introducido termina en ceros,
    // por ej. 10, 1000, etc.
    numero = numero * 10 + 1;
    
    // le da la vueta al número y calcula la longitud
    
    long volteado = 0;
    int longitud = 0;
    int posicion = 1;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } 
        
    // comprueba la posición
    while (volteado != 1) {
      if ((volteado % 10) == digito) {
        System.out.print(posicion + " ");
      }
      volteado /= 10;
      posicion++;
    } 

    System.out.println();
    
    
   }
  }
