/**
 * Programa que prueba la clase Vehiculo.
 */
import java.util.Scanner; 
public class PruebaVehiculo {
	public static void main(String agrs[]) {
		Scanner s = new Scanner(System.in);
		
		int opcion = 0;
		int km;
		
		Coche rayo = new Coche();
		Bicicleta biciRosa = new Bicicleta();
		
		while(opcion != 8) {
			System.out.println("\nVEHÍCULOS.");
			System.out.println("==========");
			System.out.println("1. Anda con la bicicleta.");
			System.out.println("2. Haz el caballito con la bicicleta.");
			System.out.println("3. Anda con el coche.");
			System.out.println("4. Quema rueda con el coche.");
			System.out.println("5. Ver kilometraje de la bicicleta.");
			System.out.println("6. Ver kilometraje del coche.");
			System.out.println("7. Ver kilometraje total.");
			System.out.println("8. Salir.");
			System.out.println("Elige una opción (1-8): ");
			
			opcion = s.nextInt();
			
			System.out.println("\n");
						
			switch(opcion) {
				case 1:
				biciRosa.andaBici();
				System.out.println("¿Cuánto km a reccorrido con la bicicleta?:");
				km = s.nextInt();
				biciRosa.recorre(km);
				break;
				
				case 2:
				biciRosa.hazCaballito();
				break;
				
				case 3:
				rayo.andaCoche();
				System.out.println("¿Cuánto km a reccorrido con el coche?: ");
				km = s.nextInt();
				rayo.recorre(km);
				break;
				
				case 4: 
				rayo.quemaRueda();
				break;
				
				case 5:
				System.out.println("He recorrido con la bicicleta " + biciRosa.getKilometrosRecorridos() + " km.");
				break;
				
				case 6:
				System.out.println("He recorrido con el coche " + rayo.getKilometrosRecorridos() + " km.");
				break;
				
				case 7:
				System.out.println("Ambos vehículos han recorrido " + Vehiculo.getKilometrosTotales() + " km.");
				break;
				
				default:
			}
		}
		
	}
}

