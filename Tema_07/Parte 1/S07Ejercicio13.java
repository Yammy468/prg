import java.util.Scanner;

public class S07Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String verde = "\033[32m";
    String blanco = "\033[37m";
    int[] n = new int[100];
    int i;
    int maximo = 0;
    int minimo = 100;
    
    for(i = 0; i < 100; i++) {
      n[i] = (int)(Math.random()*501);
      if(n[i] < minimo) {
        minimo = n[i];
      } 
      if(n[i] > maximo) {
        maximo = n[i];
      }
    }
    
    for(i = 0; i < 100; i++) {
      System.out.print(n[i] + " ");
    }
    System.out.println();
    
    System.out.print("\n¿Qué quiere destacar? (1- mínimo, 2- máximo): ");
    int numero = s.nextInt();
    
    // destacar
    int destacar;
    
    if(numero == 1) {
      destacar = minimo;
    } else {
      destacar = maximo;
    }
    
    // resultado
    for(i = 0; i < 100; i++) {
      if(n[i] == destacar) {
        System.out.print(verde + " **" + n[i] + "** " + blanco);
      } else {
        System.out.print(blanco + n[i] + " ");
      }
    }
    System.out.println();
      
  }
}

