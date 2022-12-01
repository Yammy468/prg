import java.util.Scanner;

public class S072Ejercicio06 {
  public static void main(String[] args) 
  Scanner s = new Scanner(System.in);
    
    int[][] n = new int[6][10];
    int fila, columna;
    
    int maximo = 0;
    int maximoFila = 0;
    int maximoColumna = 0;
    
    int minimo = 1000;
    int minimoFila = 0;
    int minimoColumna = 0;
    
    boolean repetido = true;
    int i;
    
    // datos
    for(fila = 0; fila < 6; fila++) {
      for(columna = 0; columna < 10; columna++) {
        // comprobar que no se repite
        do {
        n[fila][columna] = (int)(Math.random()*1001);
        repetido = false;
          for (i = 0; i < 10 * fila + columna; i++) {
            if (n[fila][columna] == n[i / 10][i % 10]) {
              repetido = true;
            }
          }
        } while (repetido);
        
        // minimo y maximo
        if(n[fila][columna] < minimo) {
          minimo = n[fila][columna];
          minimoFila = fila;
          minimoColumna = columna;
        }
        if(n[fila][columna] > maximo) {
          maximo = n[fila][columna];
          maximoFila = fila;
          maximoColumna = columna;
        }
      }
    }
    
    // tabla
    System.out.print("        ");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("  Columna " + columna);
    }
    
    for(fila = 0; fila < 6; fila++) {
      System.out.print("\nFila " + fila);
      for(columna = 0; columna < 10; columna++) {
        System.out.printf("%9d  ", n[fila][columna]);
      }
    }
    System.out.println();
    
    System.out.println("\nNúmero MÁXIMO: " + maximo);
    System.out.println("Fila " + maximoFila + ", columna " + maximoColumna);
    System.out.println("\nNúmero MÍNIMO: " + minimo);
    System.out.println("Fila " + minimoFila + ", columna " + minimoColumna);
    
   }
  }
