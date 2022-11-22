import java.util.Scanner;

public class S07Ejercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    char[][] simbolo = new char[10][1];
    simbolo[0][0] = 'a';
    simbolo[1][0] = 'x';
    simbolo[4][0] = '@';
    simbolo[6][0] = ' ';
    simbolo[7][0] = '+';
    simbolo[8][0] = 'Q';
    
    int columna, fila;
    
    for(columna = 0; columna < 10; columna++) {
      System.out.print("Índice: " + columna);
      for(fila = 0; fila < 1; fila++) {
        System.out.printf("      Valor: " + simbolo[columna][fila]);
      }
      System.out.println();
    }
    
   }
  }

// Con los valores que no han sido inicializados, en su lugares no se muestran nada(esta en blanco).
