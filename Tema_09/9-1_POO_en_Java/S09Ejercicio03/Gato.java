/** 
 * Gato.java
 */
 
public class Gato extends Mamifero {
    
    private String raza; 

    public Gato(String n, int e, String r, Sexo s) {
        super(n, e, s);
        raza = r;
    }

    public String toString() {
        return super.toString()
            + "Soy un felino de raza " + this.raza + ".\n";
    }

    /*
     * Hacer que el gato maulle
     */
    public void maulla() {
        System.out.println("Miauuuuu");
    }

    /*
     * Hacer que el gato ronronee
     */
    public void ronronea() {
        System.out.println("Prrrrrrr");
    }

    /*
     * Hacer que el gato coma, pero solo come pescado
     */
    public void come(String comida) {
        if(comida.equals("pescado")) {
            System.out.println("Ñam ñam ñam, hmmm, me encanta! B) . Gracias");
        } else {
            System.out.println("Lo siento, solo me gusta el pescado.");
        }
    }
}
