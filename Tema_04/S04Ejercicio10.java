import java.util.Scanner;

public class S04Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca el dia de nacimiento: ");
    int dia = s.nextInt();
    System.out.print("Introduzca el mes de nacimiento: ");
    String mes = s.next();
           
    System.out.println("\n");

    
    String horoscopo;
    
    switch(mes) {
		
      case "enero":
        if (dia < 21) {
          horoscopo = "capricornio";
        } else {
          horoscopo = "acuario";
        }
      System.out.println("Su horóscopo es " + horoscopo);
        break;
        
      case "febrero":
        if (dia < 20) {
          horoscopo = "acuario";
        } else {
          horoscopo = "piscis";
        }
      System.out.println("Su horóscopo es " + horoscopo);
        break;
        
      case "marzo":
        if (dia < 21) {
          horoscopo = "piscis";
        } else {
          horoscopo = "aries";
        }
      System.out.println("Su horóscopo es " + horoscopo);
        break;
        
      case "abril":
        if (dia < 21) {
          horoscopo = "aries";
        } else {
          horoscopo = "tauro";
        }
      System.out.println("Su horóscopo es " + horoscopo);
        break;
        
      case "mayo":
        if (dia < 20) {
          horoscopo = "tauro";
        } else {
          horoscopo = "géminis";
        }
      System.out.println("Su horóscopo es " + horoscopo);
        break;
        
      case "junio":
        if (dia < 22) {
          horoscopo = "géminis";
        } else {
          horoscopo = "cáncer";
        }
      System.out.println("Su horóscopo es " + horoscopo);
        break;
        
      case "julio":
        if (dia < 22) {
          horoscopo = "cáncer";
        } else {
          horoscopo = "Leo";
        }
      System.out.println("Su horóscopo es " + horoscopo);
        break;
        
      case "agosto":
        if (dia < 24) {
          horoscopo = "leo";
        } else {
          horoscopo = "virgo";
        }
      System.out.println("Su horóscopo es " + horoscopo);
        break;
        
      case "septiemble":
        if (dia < 23) {
          horoscopo = "virgo";
        } else {
          horoscopo = "libra";
        }
      System.out.println("Su horóscopo es " + horoscopo);
        break;
        
      case "octuble":
        if (dia < 23) {
          horoscopo = "libra";
        } else {
          horoscopo = "escorpio";
        }
      System.out.println("Su horóscopo es " + horoscopo);
        break;
        
      case "nobiemble":
        if (dia < 23) {
          horoscopo = "escorpio";
        } else {
          horoscopo = "sagitario";
        }
      System.out.println("Su horóscopo es " + horoscopo);
        break;
        
      case "diciemble":
        if (dia < 21) {
          horoscopo = "sagitario";
        } else {
          horoscopo = "capricornio";
        }
      System.out.println("Su horóscopo es " + horoscopo);
        break;
      default:
      System.out.println("No existe");
      
    }
   
  }
  
}

