import java.util.Scanner;

public class S04Ejercicio15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Dibuja un pirámide rellena.");
    System.out.println("\nPrimero introduzca un cartacter de relleno: ");
    String l = s.next();
    System.out.println("\n(Opción a elegir) El vértice de la pirámide está apuntado ... ");
    System.out.println("a) hacia arriba");
    System.out.println("b) hacia abajo");
    System.out.println("c) hacia la izquierda");
    System.out.println("d) hacia la derecha");
    System.out.print("\n===> ");
    String opcion = s.next();
    System.out.println("\n");
    switch (opcion) {
      case "a":
      System.out.println("   " + l + "   ");
      System.out.println("  " + l + l + l + "  ");
      System.out.println(" " + l + l + l + l + l + " ");
      System.out.println(l + l + l + l + l + l + l);
      break;
      
      case "b":
      System.out.println(l + l + l + l + l + l + l);
      System.out.println(" " + l + l + l + l + l + " ");
      System.out.println("  " + l + l + l + "  ");
      System.out.println("   " + l + "   ");
      break;
      
      case "c":
      System.out.println("   " + l);
      System.out.println("  " + l + l);
      System.out.println(" " + l + l + l);
      System.out.println(l + l + l + l);
      System.out.println(" " + l + l + l);
      System.out.println("  " + l + l);
      System.out.println("   " + l);
      break;

      case "d":
      System.out.println(l + "   ");
      System.out.println(l + l + "  ");
      System.out.println(l + l + l +" ");
      System.out.println(l + l + l + l);
      System.out.println(l + l + l +" ");
      System.out.println(l + l + "  ");
      System.out.println(l + "   ");
      
      default:
      break;
     }
     
  }
}
    
