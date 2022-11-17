import java.util.Scanner;

public class S07Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[][] num = new int[1][12];
    num[0][0] = 39;
    num[0][1] = -2;
    num[0][4] = 0;
    num[0][6] = 14;
    num[0][8] = 5;
    num[0][9] = 120;
    
    int fila, columna;
    
    for(fila = 0; fila < 1; fila++) {
      System.out.printf("Índice:   " + fila++);
      for(columna = 0; columna < 11; columna++) {
        System.out.printf("%5d", fila++);
      }
      System.out.println();
    }
    
    for(fila = 0; fila < 1; fila++) {
      System.out.printf("Valor:");
      for(columna = 0; columna < 12; columna++) {
        System.out.printf("%5d", num[fila][columna]);
      }
      System.out.println();
    }
    
   }
  }

// Con los valores que no han sido inicializados, en su lugares se muestran un "0" porque no hay nada o ningún valor.
