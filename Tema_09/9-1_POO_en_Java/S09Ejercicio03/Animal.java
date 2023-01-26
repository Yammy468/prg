/**
 * Animal.java
 */

public abstract class Animal {

    // Atributos
    private String nombre;
    private int edad;
    private Sexo sexo;

    // Metodos
    // Constructor
    public Animal() {
        this.sexo = Sexo.MACHO;
    }

    public Animal(String n, int e, Sexo s) {
        this.nombre = n;
        this.edad = e;
        this.sexo = s;
    }
    
    // getter
    public Sexo getSexo() {
        return this.sexo;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getEdad() {
        return this.edad;
    }

    public String toString() {
        return "Mi nombre es " + this.nombre + ", y tengo " + this.edad + " años.\n";
    }

    /*
     * Hacer que el animal se duerma
     */
    public void duerme() {
        System.out.println("Zzzzzzzzzz");
    }

    /*
     * Hacer que el animal bosteza cuando se despierta
     */
    public void bosteza() {
        System.out.println("Ooouuuuaaahhhhh");
    }
}
