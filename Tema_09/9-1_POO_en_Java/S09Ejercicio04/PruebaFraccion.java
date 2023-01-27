/**
 * Programa que prueba la clase Fraccion
 */
public class PruebaFraccion {
    public static void main(String[] args) {

        Fraccion f1 = new Fraccion(-3,4);
  
        // Fracción invertido 
        System.out.println("La fracción invertida de " + f1 + " es:");
        System.out.println(f1 + " ^-1 = " + f1.invierte() + "\n");
        
        // Fracción por un número 
        System.out.println("La fracción " + f1 + " multiplicada por un número es:");
        System.out.println(f1 + " x 5 = "+ f1.multiplicaNumero(5) + "\n");
        
        // Fracción entre un número 
        System.out.println("La fracción " + f1 + " dividida entre un número es:");
        System.out.println(f1 + " x 5 = "+ f1.divideNumero(5) + "\n");
    
            
        Fraccion f2 = new Fraccion(7, 8);
    
        // Fracción por otra fracción 
        System.out.println("La fracción " + f1 + " multiplicada por otra fracción es:");
        System.out.println(f1 + " x " + f2 + " = " + f1.multiplicaFraccion(f2) + "\n");
        
        // Fracción entre otra fracción 
        System.out.println("La fracción " + f1 + " dividida entre otra fracción es:");
        System.out.println(f1 + " : " + f2 + " = " + f1.divideFraccion(f2) + "\n");
        
        // Fracción simplificado 
        Fraccion f3 = new Fraccion(750, -240);
        System.out.println("La fracción " + f3 + " simplificada es:");
        System.out.println(f3 + " = " + f3.simplifica());
    }
}
  