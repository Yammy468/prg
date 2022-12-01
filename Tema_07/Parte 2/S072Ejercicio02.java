import java.util.Scanner;

public class S072Ejercicio02 {
  public static void main(String[] args) 
  throws InterruptedException {
    Scanner s = new Scanner(System.in);
    
    int[][] n = new int[4][5];
    int fila, columna;
    int sumaFila;
    int sumaColumna;
    
    // datos
    System.out.println("Introduzca 20 números enteros (separados por INTRO):");
    
    for(fila = 0; fila < 4; fila++) {
      for(columna = 0; columna < 5; columna++) {
        n[fila][columna] = s.nextInt();
      }
    }
    System.out.println();
    
    // tabla
    System.out.print("        ");
    for(columna = 0; columna < 5; columna++) {
      System.out.print("  Columna " + columna);
    }
    System.out.print(" | Total");
    
    // suma de filas
    for(fila = 0; fila < 4; fila++) {
      System.out.print("\nFila " + fila);
      sumaFila = 0;
      for(columna = 0; columna < 5; columna++) {
        System.out.printf("%9d  ", n[fila][columna]);
        sumaFila += n[fila][columna];
      }
      System.out.printf("   |");
      System.out.printf("%6d", sumaFila);
    }
    System.out.println("\n------------------------------------------------------------------------");
    System.out.print("Total ");
    
    // suma de columnas y total
    int sumaTotal = 0;
    for(columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for(fila = 0; fila < 4; fila++) {
        sumaColumna += n[fila][columna];
      }
      sumaTotal += sumaColumna;
      System.out.printf("%9d  ", sumaColumna);
    }
    System.out.printf("   |");
    System.out.printf("%6d  ", sumaTotal);
    
   }
  }
