import java.util.Scanner;

public class S04Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca un numero de un dia de la semana: ");
    int dia = s.nextInt();
    
    String diaDeLaSemana;
    
    switch (dia) {
      case 1:
      diaDeLaSemana = "Lunes";
      break;
      
      case 2:
      diaDeLaSemana = "Martes";
      break;
      
      case 3:
      diaDeLaSemana = "Miércoles";
      break;
      
      case 4:
      diaDeLaSemana = "Jueves";
      break;
      
      case 5:
      diaDeLaSemana = "Viernes";
      break;

      case 6:
      diaDeLaSemana = "Sábado";
      break;
    
      case 7:
      diaDeLaSemana = "Domingo";
      break;
      default: 
      diaDeLaSemana = "No existe ese dia";
    }
    
    System.out.println("Dia " + dia + ": " + diaDeLaSemana);
    
  }
  
}

