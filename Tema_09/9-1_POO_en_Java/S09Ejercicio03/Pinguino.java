/**
 * Pinguino.java
 */

public class Pinguino extends Ave {
    
    public Pinguino(String n, int e, Sexo s) {
        super(n, e, s);
    }

    public String toString() {
        return super.toString()
        + "Soy un pingüino.\n";
    }

    /*
     * El pingüino esta triste porque no puede volar
     */
    @Override
    public void vuela() {
        System.out.print("*SNIF* *SNIF* ");
        System.out.println("No puedo volar. (T-T) ");
    }

    /*
     * Hacer que el pingüino nade
     */
    public void nada() {
        System.out.println("Estoy nadando, me encanta nadar. VuV ");
    }

    /*
     * Hacer que el pingüino caze 
     */
    public void caza() {
        System.out.println("He conseguido cazar un pescado! =D ");
    }
}
