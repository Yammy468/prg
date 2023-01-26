/**
 * Mamifero.java
 */
 
public class Mamifero extends Animal {
    
    public Mamifero(String n, int e, Sexo s) {
        super(n, e, s);
    }

    public String toString() {
        return super.toString();
    }

    // Metodos

    /* 
     * Los mamiferos amamanta a sus crias, pero solo las HEMBRAS
     */
    public void amamanta() {
        if(this.getSexo() == Sexo.HEMBRA) {
            System.out.println("Ven mi bebe, es hora de comer. <3 ");
        } else {
            System.out.print("Lo siento mi bebe, yo no puedo darte leche. Soy un 'Macho'.");
            System.out.println("Pero, ven con 'papa' vamos a buscar a 'mama'. ^v^ ");
        }
    }

    /*
     * Hacer que los mamiferos den un paseo
     */
    public void anda() {
        System.out.println("Vamos a dar un paseo, andando!");
    }

    /*
     * Los mamiferos crian a sus crias ellos mismos
     */
    public void cuidaCrias() {
        System.out.println("Lo siento, estoy cuidando a mis crias.");
    }
}
