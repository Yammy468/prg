import java.util.Scanner;

public class S05Ejercicio21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor, introduzca los números.");
    System.out.println("(Para terminar introduzca un número negativo): ");
    
    int numeroIntroducido;
    int numeroTotal = 0;
    int numeroImpar = 0;
    int sumaImpar = 0;
    int maxPar = 0;
    
    do {
      numeroIntroducido = s.nextInt();
      if (numeroIntroducido >=0) {
        numeroTotal++;
        if ((numeroIntroducido % 2) == 1) {
          sumaImpar += numeroIntroducido;
          numeroImpar++;
        } else {
          if (numeroIntroducido > maxPar) {
            maxPar = numeroIntroducido;
          }
        }
      } 
    } while (numeroIntroducido >= 0);
    
    System.out.println("Se ha introducido " + numeroTotal + " números positivo.");
    System.out.println("La media de los impares es " + (sumaImpar / numeroImpar) + ".");
    System.out.println("El máximo o mayor de los pares es " + maxPar + ".");
    
   }
  }
