public class S04Ejercicio01 {
  public static void main(String[] args) {
    
    System.out.print("Escribe un dia de la semana: ");
    String respuesta = System.console().readLine();
    
    if (respuesta.equals("lunes")) {
      System.out.println("A la primera hora toca BDA (Base de datos)");
    }
    
    if (respuesta.equals("martes")) {
      System.out.println("A la primera hora toca EDS (Entorno de desarrollo)");
    }
    
    if (respuesta.equals("miercoles")) {
      System.out.println("A la primera hora toca PRG (Programación)");
    }
    
    if (respuesta.equals("jueves")) {
      System.out.println("A la primera hora toca EDS (Entorno de desarrollo)");
    }
    
    if (respuesta.equals("viernes")) {
      System.out.println("A la primera hora toca BDA (Base de datos)");
    }
  }
}
