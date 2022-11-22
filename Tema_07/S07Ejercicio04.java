import java.util.Scanner;

public class S07Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] numero = new int [20];
    int[] cuadrado = new int [20];
    int[] cubo = new int [20];
    int i;
    
    for(i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()*101);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = cuadrado[i] * numero[i];
    }
    
    System.out.println("   n  |   n²  |   n³  ");
    System.out.println("----------------------");
    for(i = 0; i < 20; i++) {
      System.out.printf(" %4d | %5d | %6d \n", numero[i], cuadrado[i], cubo[i]);
    }stem.out.printf("%4d │ %5d │%8d\n", numero[i], cuadrado[i], cubo[i]);
      }
    
  }
}

