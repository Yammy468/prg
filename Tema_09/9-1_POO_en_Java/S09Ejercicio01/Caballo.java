/**
 * Caballo.java
 */
 
public class Caballo {
	
	// Atributos
	private String nombre, raza, color, sexo;
	private int edad;
	
	// Métodos
	
	// constructor
	Caballo (String n, String r, String c, String x, int e) {
		this.nombre = n;
		this.raza = r;
		this.color = c;
		this.sexo = x;
		this.edad = e;
	}
	
	// getter
	public String getNombre() {
		return this.nombre;
	}
	public String getRaza() {
		return this.raza;
	}
	
	/** 
	 * Hacer que el caballo trote
	 */
	public void trota() {
		System.out.println("Tocotoc tocotoc tocotoc");
	}
	 
	/**
	 * Hacer que el caballo relinche
	 */
	public void relincha() {
		System.out.println("Hiiiiiiiiiii");
	}
	  
	/** 
	 * Hacer que el caballo coma. Pero solo come heno.
	 */
	public void come(String comida) {
		if(comida.equals("heno")) {
			System.out.println("Ñam ñam ñam, decilioso.");
		} else {
			System.out.println("Lo siento, yo solo como heno.");
		}
	}
}



