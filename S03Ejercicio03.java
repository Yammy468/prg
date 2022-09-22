import java.util.Scanner;

public class S03Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introducir la cantidad de pesestas que desea: ");
    
    double pesetas = s.nextDouble();
    double division = (pesetas / 166.386);
    
    System.out.println(pesetas +" pesetas son " + division + " euros");
  }
}
