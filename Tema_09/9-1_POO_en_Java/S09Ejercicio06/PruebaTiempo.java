/**
 * Programa que pruebe la clase Tiempo
 */
public class PruebaTiempo {
	public static void main(String args[]) {
		String verde = "\033[32m";
		String blanco = "\033[37m";

		Tiempo t1 = new Tiempo(0, 30, 40);
		Tiempo t2 = new Tiempo(0, 35, 20);
		Tiempo t3 = new Tiempo(1, 30, 20);

		// Suma de dos tiempos
		System.out.println("La suma del tiempo " + verde + t1 + blanco + " y del tiempo " + verde + t2 + blanco + " es:");
		System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
		
		// Resta de dos tiempos
		System.out.println("\nLa resta del tiempo " + verde + t3 + blanco + " y del tiempo " + verde + t1 + blanco + " es:");
		System.out.println(t3 + " - " + t1 + " = " + t3.resta(t1));
	}
}
