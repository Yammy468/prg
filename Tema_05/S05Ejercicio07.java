import java.util.Scanner;

public class S05Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int oportunidad = 4;

    do {
    System.out.print("Por favor, introduzca la contraseña(4 cifras): ");
    int contraseña = s.nextInt();
    
      if (contraseña == 4680) {
        System.out.println("La caja furte se ha abierto satisfactoriamente");
        oportunidad -= 4;
      } else {
        System.out.println("Lo siento, esa no es combinación");
        oportunidad --;
      }
      
    } while (oportunidad > 0);
    
   }
  }
