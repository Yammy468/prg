/**
 * Programa que prueba la clase Caballo.
 */
 
public class PruebaCaballo {
	public static void main(String agrs[]) {
		
		Caballo numero1 = new Caballo("Reina", "Lipizzano", "blanco", "macho", 14);
		Caballo numero2 = new Caballo("Lucero", "Zaino", "castaño" , "hembra", 8);
		
		System.out.println("Este caballo de raza " + numero1.getRaza() + ", se llama " + numero1.getNombre() +".");
		System.out.println("Vamos " + numero1.getNombre() + " a dar un paseo.");
		numero1.trota();
		System.out.println(numero1.getNombre() + ", STOP!");
		numero1.relincha();
		System.out.println("Buen trabajo " + numero1.getNombre() + ", toma heno como premio.");
		numero1.come("heno");
		
		System.out.println("\nEste otro caballo de raza " + numero2.getRaza() + ", se llama " + numero2.getNombre() + " es el más joven.");
		System.out.println("Ven aqui " + numero2.getNombre() + "!");
		numero2.trota();
		System.out.println("Es hora de tu comida! Toma una manzana, a ver si te gusta.");
		numero2.come("manzana");
		System.out.println("Entonces, toma heno.");
		numero2.come("heno");
		
	}
}



