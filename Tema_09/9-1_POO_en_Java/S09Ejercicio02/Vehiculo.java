/**
 * Vehiculo.java
 */
 
public abstract class Vehiculo {
	
	// atributos de clase
	private static int vehiculosCreados = 0;
	private static int kilometrosTotales = 0;
	
	// atributo de instancia
	private int kilometrosRecorridos;
	
	public Vehiculo() {
		this.kilometrosRecorridos = 0;
	}
	
	public static int getKilometrosTotales() {
		return Vehiculo.kilometrosTotales;
	}
	
	public int getKilometrosRecorridos() {
		return this.kilometrosRecorridos;
	}
	
	/** 
	 * Recorre una determinada distancia
	 * @param km distancia a recorrer en kilometros
	 */
	 public void recorre(int km) {
		 this.kilometrosRecorridos += km;
		 Vehiculo.kilometrosTotales += km;
	 }
	 
}

