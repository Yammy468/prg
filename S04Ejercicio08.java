import java.util.Scanner;

public class S04Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        
    System.out.print("Introduce las notas de tres examenes (puede incluir decimales) separados por espacio: ");
    
    double x1 = s.nextDouble();
    double x2 = s.nextDouble();
    double x3 = s.nextDouble();
    
    double media = (x1 + x2 + x3)/3;
    
    if (media <5) {
      System.out.println("La nota media: " + media + "\t" + " Insuficiente");
    }
    
    if ((media >=5) && (media <=6)) {
      System.out.println("La nota media: " + media + "\t" + " Bien");
    }
    
    if ((media >=7) && (media <=8)) {
      System.out.println("La nota media: " + media + "\t" + " Notable");
    }
    
    if ((media >=9) && (media <=10)) {
      System.out.println("La nota media: " + media + "\t" + " Sobresaliente");
    }
  }
  
}

