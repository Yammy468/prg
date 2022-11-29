import java.util.Scanner;

public class S07Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] n = new int[10];
    int[] resultado = new int[10];
    int i;
    int nInicial;
    int nFinal;
    boolean valido;
    
    System.out.println("Introduzca 10 números separados por INTRO:");

    for (i = 0; i < 10; i++) {
      n[i] = s.nextInt();
    }
    
    // Muestra el array original.
    System.out.println("\nArray INICIAL\n");
    
    System.out.print(" Índice ");
    for(i = 0; i < 10; i++) {
      System.out.printf("|%4d ", i);
    }
    System.out.println("|");
    for(i = 0; i < 75; i++) {
      System.out.print("-");
    }
    System.out.println("-");
    System.out.print(" Valor  ");
    for(i = 0; i < 10; i++) {
      System.out.printf("|%4d ", n[i]);
    }
    System.out.println("|");
    
    // Pide las posiciones inicial y final.
    do {
      valido = true;
      
      System.out.print("\nIntroduzca la posición inicial (0 - 9): ");
      nInicial = s.nextInt();
      if ((nInicial < 0) || (nInicial > 9)) {
        System.out.println("Valor incorrecto, debe ser un número entre el 0 y el 9.");
        valido = false;
      }
  
      System.out.print("Introduzca la posición final (0 - 9): ");
      nFinal = s.nextInt();
      if ((nFinal < 0) || (nFinal > 9)) {
        System.out.println("Valor incorrecto, debe ser un número entre el 0 y el 9.");
        valido = false;
      }
      
      if (nInicial >= nFinal) {
        System.out.println("Valores incorrectos, la posición inicial debe ser menor que la posición final.");
        valido = false;
      }
    } while (!valido);

    // Muestra de nuevo el array original.
    System.out.println("\n\nArray INICIAL\n");
    
    System.out.print(" Índice ");
    for(i = 0; i < 10; i++) {
      System.out.printf("|%4d ", i);
    }
    System.out.println("|");
    for(i = 0; i < 75; i++) {
      System.out.print("-");
    }
    System.out.println("-");
    System.out.print(" Valor  ");
    for(i = 0; i < 10; i++) {
      System.out.printf("|%4d ", n[i]);
    }
    System.out.println("|");
        
    // Copia el array n en resultado.
    for (i = 0; i < 10; i++) {
      resultado[i] = n[i];
    }
    
    resultado[nFinal] = n[nInicial];
    
    for (i = nFinal + 1; i < 10; i++) {
      resultado[i] = n[i - 1];
    }
    resultado[0] = n[9];
    
    for (i = 0; i < nInicial; i++) {
      resultado[i + 1] = n[i];
    }
    // Muestra el resultado.
    System.out.println("\nArray RESULTADO\n");
    
    System.out.print(" Índice ");
    for(i = 0; i < 10; i++) {
      System.out.printf("|%4d ", i);
    }
    System.out.println("|");
    for(i = 0; i < 75; i++) {
      System.out.print("-");
    }
    System.out.println("-");
    System.out.print(" Valor  ");
    for(i = 0; i < 10; i++) {
      System.out.printf("|%4d ", resultado[i]);
    }
    System.out.println("|");
  }
}

