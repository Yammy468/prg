import java.util.Scanner;

public class S04Ejercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Escribe una hora del dia: ");
    int hora = s.nextInt();
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos dias!"); 
      }
    if ((hora >= 13) && (hora <= 20)) {
      System.out.println("Buenas tardes!"); 
      }
    if ((hora == 21) || (hora==22) || (hora==23) || (hora==0) || (hora==1) || (hora==2) || (hora==3) || (hora==4) || (hora==5)) {
      System.out.println("Buenas noches!"); 
      }
  }
  
}

