/* programa que prueba la clase Fracciones */

public class PruebaFracciones {
    public static void main(String agrs[]) {

        Fracciones f1 = new Fracciones(-3,4);
  
        // Fracción invertido 
        System.out.println("La fracción invertida de " + f1 + " es:");
        System.out.println(f1 + " ^-1 = " + f1.invierte() + "\n");

        // Fracción negativo o positivo 
        System.out.println("La fracción en negativa o positiva de " + f1 + " es:");
        System.out.println(f1 + " x -1 = " + f1.negate() + "\n");

        Fracciones f2 = new Fracciones(7, 8);

        // Suma de dos fracciones
        System.out.println("La fracción " + f1 + " más la otra fracción es:");
        System.out.println(f1 + " + " + f2 + " = " + f1.add(f2) + "\n");

        // Resta de dos fracciones
        System.out.println("La fracción " + f1 + " menos la otra fracción es:");
        System.out.println(f1 + " - " + f2 + " = " + f1.substract(f2) + "\n");

        // Fracción por otra fracción 
        System.out.println("La fracción " + f1 + " multiplicada por otra fracción es:");
        System.out.println(f1 + " x " + f2 + " = " + f1.multiply(f2) + "\n");
        
        // Fracción entre otra fracción 
        System.out.println("La fracción " + f1 + " dividida entre otra fracción es:");
        System.out.println(f1 + " : " + f2 + " = " + f1.divide(f2) + "\n");
        
        // Valor igual o no
        System.out.println("La fracción " + f1 + " es/no es igual a la otra fracción: ");
        System.out.println(f1 + " igual/no igual que " + f2 + " = " + f1.equals(f2) + "\n");

        // Fracción comparada con otra fracción 
        System.out.println("La fracción " + f2 + " comparada con la otra fracción es: ");
        System.out.println(f2 + " comparada con la otra " + f1 + " = " + f2.compareTo(f1) + "\n");
        System.out.println("▪ Si nuestra fracción es menor que la otra, devolveremos -1.");
        System.out.println("▪ Si nuestra fracción es mayor que la otra, devolveremos 1.");
        System.out.println("▪ Si son iguales, devolveremos 0.");
    }
}
