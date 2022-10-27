import java.util.Scanner;

public class S05Ejercicio23 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor, vaya introduciendo números.");
    System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");
    
    int numeroIntroducido;
    int suma = 0;
    int numeroDeElementos = 0;
    
    do {
      numeroIntroducido = s.nextInt();
      suma += numeroIntroducido;
      numeroDeElementos++;
    } while (suma <= 10000);
    
    System.out.println("Ha introducido un total de " + numeroDeElementos + " números.");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / (double) numeroDeElementos);
    System.out.println("Por favor, introduzca los números.");
    System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");
    
    int numeroIntroducido;
    int suma = 0;
    int numeroTotal = 0;
    
    do {
      numeroIntroducido = s.nextInt();
      suma += numeroIntroducido;
      numeroTotal++;
    } while (suma <= 10000);
    
    System.out.println("Ha introducido un total de " + numeroTotal + " números.");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / (double) numeroTotal);
    
   }
  }
