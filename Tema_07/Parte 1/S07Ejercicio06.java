import java.util.Scanner;

public class S07Ejercicio06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] numero = new int[15];
      int i;
      
      System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");
      
      for (i = 0; i < 15; i++) {
        numero[i] = s.nextInt();
      }
      
      System.out.println();
      
      // Muestra el array original ///////////////
      System.out.println("Array original:");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i < 75; i++) {
        System.out.print("-");
      }
      System.out.println("-");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", numero[i]);
      }
      System.out.println("|");
      ////////////////////////////////////////////
      
      // rota una posición a la derecha //////////
      int aux = numero[14];
      for (i = 14; i > 0; i--) {
        numero[i] = numero[i-1];
      }
      numero[0] = aux;
      ////////////////////////////////////////////

      // Muestra el array rotado /////////////////
      System.out.println("\nArray rotado a la derecha una posición:");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i < 75; i++) {
        System.out.print("-");
      }
      System.out.println("-");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", numero[i]);
      }
      System.out.println("|");
    
  }
}

