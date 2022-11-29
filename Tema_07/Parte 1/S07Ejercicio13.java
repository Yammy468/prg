import java.util.Scanner;

public class S07Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    Sint i;
    String[] color = {
      "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro ", "blanco", "morado"
    };

    String[] palabra = new String[8];
    String[] resultado = new String[8];

    System.out.println("Introduzca 8 palabras (separado por INTRO): ");
    
    int j = 0;
    
    for (i = 0; i < 8; i++) {
      palabra[i] = s.next();
      
      // Si la palabra introducida es un color.
      for (String c : color) {
        if (palabra[i].equals(c)) {
          resultado[j++] = c;
        }
      }
    }
    
    // La palabra no es color
    for (i = 0; i < 8; i++) {
      boolean esColor = false;

      for (String c : color) {
        if (palabra[i].equals(c)) {
          esColor = true;
        }
      }

      if (!esColor) {
        resultado[j++] = palabra[i];
      }
    }

    // Array original.
    System.out.println("\n\nArray original:");
    for (i = 0; i < 8; i++) {
      System.out.printf("│%7d ", i);
    }
    System.out.println("|");
    for(i = 0; i < 75; i++) {
      System.out.print("-");
    }
    System.out.println("-");
    for (String p : palabra) {
      System.out.printf("│%-7s ", p);
    }
    System.out.println("|");

    // Array resultado.
    System.out.println("\n\nArray original:");
    for (i = 0; i < 8; i++) {
      System.out.printf("│%7d ", i);
    }
    System.out.println("|");
    for(i = 0; i < 75; i++) {
      System.out.print("-");
    }
    System.out.println("-");
    for (String r: resultado) {
      System.out.printf("│%-7s ", r);
    }
    System.out.println("|");
    
  }
}

