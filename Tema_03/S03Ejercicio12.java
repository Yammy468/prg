import java.util.Scanner;

public class S03Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la base imponible: ");
    double baseImponible = s.nextDouble();
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipo = s.next();
    
    
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigo = s.next();
    
    System.out.println("Base imponible "+ "\t" + "\t" + baseImponible);
    
    double calculo;
    double suma;
    String tipoDeIva;
    switch (tipo) {
      case "general":
      tipoDeIva = "(21%)";
      calculo = baseImponible * 21/100;
      suma = baseImponible + calculo;
      System.out.println("IVA " + tipoDeIva + "\t" + "\t" + calculo);
      System.out.println("Precio con IVA " + "\t" + "\t" + suma);
      {
        String tipoDeCodigo;
          switch (codigo) {
          case "nopro":
          tipoDeCodigo = "(nopro)";
          System.out.println("Cod.promo." + tipoDeCodigo + "\t" + " -" + 0);
          System.out.println("Total "+ "\t" + "\t" + "\t" + suma);
          break;
          
          case "mitad":
          tipoDeCodigo = "(mitad)";
          System.out.println("Cod.promo." + tipoDeCodigo + "\t" + "-" + (suma/2));
          System.out.println("Total " + "\t" + "\t" + "\t" + (suma - (suma/2)));
          break;

          case "meno5":
          tipoDeCodigo = "(meno5)";
          System.out.println("Cod.promo." + tipoDeCodigo + "\t" + "-" + 5.0);
          System.out.println("Total " + "\t" + "\t" + "\t" + (suma-5.0));
          break;
           
          case "5porc":
          tipoDeCodigo = "(5porc)";
          System.out.println("Cod.promo." + tipoDeCodigo + "\t" + "-"+ (suma * 5 / 100));
          System.out.println("Total "+ "\t" +"\t" + "\t" +(suma - (suma * 5/100)));
          break;
          default:
          tipoDeCodigo = "tiene que ser los mencionados";
        }
      }
      
      break;
      
      case "reducido":
      tipoDeIva = "(10%)";
      calculo = baseImponible * 10/100;
      suma = baseImponible + calculo;
      System.out.println("IVA " + tipoDeIva + "\t" + "\t" + calculo);
      System.out.println("Precio con IVA " + "\t" + "\t" + suma);
      
      {
        String tipoDeCodigo;
          switch (codigo) {
          case "nopro":
          tipoDeCodigo = "(nopro)";
          System.out.println("Cod.promo." + tipoDeCodigo + "\t" + " -" + 0);
          System.out.println("Total "+ "\t" + "\t" + "\t" + suma);
          break;
          
          case "mitad":
          tipoDeCodigo = "(mitad)";
          System.out.println("Cod.promo." + tipoDeCodigo + "\t" + "-" + (suma/2));
          System.out.println("Total " + "\t" + "\t" + "\t" + (suma - (suma/2)));
          break;

          case "meno5":
          tipoDeCodigo = "(meno5)";
          System.out.println("Cod.promo." + tipoDeCodigo + "\t" + "-" + 5.0);
          System.out.println("Total " + "\t" + "\t" + "\t" + (suma-5.0));
          break;
           
          case "5porc":
          tipoDeCodigo = "(5porc)";
          System.out.println("Cod.promo." + tipoDeCodigo + "\t" + "-"+ (suma * 5 / 100));
          System.out.println("Total "+ "\t" +"\t" + "\t" +(suma - (suma * 5/100)));
          break;
          default:
          tipoDeCodigo = "tiene que ser los mencionados";
        }
      }
      
      break;
      
      case "superreducido":
      tipoDeIva = "(4%)";
      calculo = baseImponible * 4/100;
      suma = baseImponible + calculo;
      System.out.println("IVA " + tipoDeIva + "\t" + "\t" + calculo);
      System.out.println("Precio con IVA " + "\t" + "\t" + suma);
      
      {
        String tipoDeCodigo;
          switch (codigo) {
          case "nopro":
          tipoDeCodigo = "(nopro)";
          System.out.println("Cod.promo." + tipoDeCodigo + "\t" + " -" + 0);
          System.out.println("Total "+ "\t" + "\t" + "\t" + suma);
          break;
          
          case "mitad":
          tipoDeCodigo = "(mitad)";
          System.out.println("Cod.promo." + tipoDeCodigo + "\t" + "-" + (suma/2));
          System.out.println("Total " + "\t" + "\t" + "\t" + (suma - (suma/2)));
          break;

          case "meno5":
          tipoDeCodigo = "(meno5)";
          System.out.println("Cod.promo." + tipoDeCodigo + "\t" + "-" + 5.0);
          System.out.println("Total " + "\t" + "\t" + "\t" + (suma-5.0));
          break;
           
          case "5porc":
          tipoDeCodigo = "(5porc)";
          System.out.println("Cod.promo." + tipoDeCodigo + "\t" + "-"+ (suma * 5 / 100));
          System.out.println("Total "+ "\t" +"\t" + "\t" +(suma - (suma * 5/100)));
          break;
          default:
          tipoDeCodigo = "tiene que ser los mencionados";
        }
      }
      
      break;
      default:
      tipoDeIva = "tiene que ser los mencionados";
     }
     
  }
}
