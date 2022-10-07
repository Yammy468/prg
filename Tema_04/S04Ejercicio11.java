import java.util.Scanner;

public class S04Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce una hora determinada (con los minutos incluidos).");
    
    System.out.print("\nPrimero introduzca la hora: ");
    int hora = s.nextInt();
    System.out.print("A continuacion introduzca los minutos: ");
    int minutos = s.nextInt();
    
    int segundoTranscurrido = ((hora * 3600) + (minutos * 60));
    int segundoFaltante = ((24 * 3600) - segundoTranscurrido);
    
    System.out.println("\nDesde la " + hora + ":" + minutos + " hasta la medianoche falta " + segundoFaltante + " segudos");
    
   
  }
  
}

