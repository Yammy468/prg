import java.util.Scanner;

public class S05Ejercicio20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Dibujo de un PIRÁMIDE");
    System.out.print("Por favor, introduzca la altura del pirámide: ");
    int alturaIntroducida = s.nextInt();
    System.out.print("Acontinuación, introduzca el caracter con el cual se pintara el pirámide: ");
    String relleno = s.next();
    
    int altura = 1;
    int espacios = alturaIntroducida-1;
    int hueco = 0;
    int i = 0;
    
    while (altura < alturaIntroducida) {     
      // espacios 
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      // pinta la línea
      System.out.print(relleno);
      for (i = 1; i < hueco; i++) {
        System.out.print(" ");
      }
      
      if (altura>1) {
        System.out.print(relleno);
      }
      
      System.out.println();
      altura++;
      espacios--;
      hueco += 2;
    } 
    // base
    for (i = 1; i < altura*2; i++) {
      System.out.print(relleno);
    }
    
   }
  }
