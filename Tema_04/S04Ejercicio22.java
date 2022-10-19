import java.util.Scanner;

public class S04Ejercicio22 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un día de la semana (de lunes a viernes): ");
    String dia = s.next();

    int diaNumerico = 0;

    switch(dia) {
      case "lunes":
        diaNumerico = 1;
        break;
      case "martes":
        diaNumerico = 2;
        break;
      case "miercoles":
        diaNumerico = 3;
        break;
      case "jueves":
        diaNumerico = 4;
        break;
      case "viernes":
        diaNumerico = 5;
        break;
      default:
        System.out.print("El día introducido no es correcto.");
    }
    
    System.out.println("\nA continuación introduzca la hora (con los minutos).");
    
    System.out.print("Hora: ");
    int horas = s.nextInt();
    
    System.out.print("Minutos: ");
    int minutos = s.nextInt();
    
    int minutosTotales = (4 * 24 * 60) + (15 * 60);
    int minutosActuales = (diaNumerico * 24 * 60) + (horas * 60) + minutos;
    int minutosRestantes = minutosTotales - minutosActuales;
    
    System.out.print("\nFaltan " + minutosRestantes + " minutos para llegar al fin de semana.");
    
   }
  }
