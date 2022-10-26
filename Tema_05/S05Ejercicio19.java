import java.util.Scanner;

public class S05Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Dibujo de un PIRÁMIDE");
    System.out.print("Por favor, introduzca la altura del pirámide: ");
    int alturaIntroducida = s.nextInt();
    System.out.print("Acontinuación, introduzca el caracter con el cual se pintara el pirámide: ");
    String relleno = s.next();
    
    int altura = 1;
    int caracter = 1;
    int espacio = alturaIntroducida-1;
    
    while (altura <= alturaIntroducida) {     
      // espacio
      for (int i = 1; i <= espacio; i++) {
        System.out.print(" ");
      }
      // caracter
      for (int i = 1; i <= caracter; i++) {
        System.out.print(relleno);
      }
      
     System.out.println();
     
     altura++;
     espacio--;
     caracter += 2;
    }
    
   }
  }
