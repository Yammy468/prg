import java.util.Scanner;

public class S04Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Adivina cual es su Horóscopo.");
    
    System.out.print("\nPor favor, introduzca su dia de nacimiento: ");
    int dia = s.nextInt();
    System.out.print("Acontinuación introduzca su mes de nacimiento: ");
    String mes = s.next();
    String horoscopo;
    
    switch (mes) {
      case "enero":
      if (dia < 21) {
        horoscopo = "capricornio";
      } else { 
        horoscopo = "acuario";
      }
      System.out.println("\nTu horóscopo es " + horoscopo);
      break;

      case "febreo":
      if (dia < 20) {
        horoscopo = "acuario";
      } else { 
        horoscopo = "piscis";
      }
      System.out.println("\nTu horóscopo es " + horoscopo);
      break;

      case "marzo":
      if (dia < 21) {
        horoscopo = "piscis";
      } else { 
        horoscopo = "aries";
      }
      System.out.println("\nTu horóscopo es " + horoscopo);
      break;
      
      case "abril":
      if (dia < 21) {
        horoscopo = "aries";
      } else { 
        horoscopo = "tauro";
      }
      System.out.println("\nTu horóscopo es " + horoscopo);
      break;
      
      case "mayo":
      if (dia < 22) {
        horoscopo = "tauro";
      } else { 
        horoscopo = "géminis";
      }
      System.out.println("\nTu horóscopo es " + horoscopo);
      break;
      
      case "junio":
      if (dia < 23) {
        horoscopo = "géminis";
      } else { 
        horoscopo = "cáncer";
      }
      System.out.println("\nTu horóscopo es " + horoscopo);
      break;
      
      case "julio":
      if (dia < 24) {
        horoscopo = "cáncer";
      } else { 
        horoscopo = "leo";
      }
      System.out.println("\nTu horóscopo es " + horoscopo);
      break;
      
      case "agosto":
      if (dia < 24) {
        horoscopo = "leo";
      } else { 
        horoscopo = "virgo";
      }
      System.out.println("\nTu horóscopo es " + horoscopo);
      break;
      
      case "septiembre":
      if (dia < 24) {
        horoscopo = "virgo";
      } else { 
        horoscopo = "libra";
      }
      System.out.println("\nTu horóscopo es " + horoscopo);
      break;
      
      case "octubre":
      if (dia < 24) {
        horoscopo = "libra";
      } else { 
        horoscopo = "escorpio";
      }
      System.out.println("\nTu horóscopo es " + horoscopo);
      break;
      
      case "noviembre":
      if (dia < 23) {
        horoscopo = "escorpio";
      } else { 
        horoscopo = "sagitario";
      }
      System.out.println("\nTu horóscopo es " + horoscopo);
      break;
      
      case "diciembre":
      if (dia < 22) {
        horoscopo = "sagitario";
      } else { 
        horoscopo = "capricornio";
      }
      System.out.println("\nTu horóscopo es " + horoscopo);
      break;

      default:
    }   
    
  }
  
}

