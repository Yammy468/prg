/**
 * Lagarto.java
 */
 
public class Lagarto extends Animal {
    
    public Lagarto(String n, int e, Sexo s) {
        super(n, e, s);
    }

    public String toString() {
        return super.toString()
            + "Soy un lagarto.\n";
    }

    /*
     * Hacer que el largado tome el sol
     */
    public void tomaSol() {
        System.out.println("Hummm. Que calorcito más agrabable. BD ");
    }

    /*
     * Hacer que el lagarto tome un chapuzon 
     */
    public void tomaChapuzon() {
        System.out.println("Al agua voy! *SLAP* ^u^ ");
    }

    /*
     * Hacer que el lagarto se esconda
     */
    public void esconde() {
        System.out.println("Me ve y ahora ··· no me ve");
    }
}
