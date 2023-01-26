public class Canario extends Ave {
    
    public Canario(String n, int e, Sexo s) {
        super(n, e, s);
    }

    public String toString() {
        return super.toString()
        + "Soy un canario.\n";
    }

    /*
     * Hacer que cante el canario
     */
    public void canta() {
        System.out.println("~~♪♫~~♪♫~~♪♫~~");
    }

    /*
     * Hacer piar al canario
     */
    public void pia() {
        System.out.println("Pío pío pío");
    }

    /*
     * Hacer que el canario venga cuando le llama
     */
    public void ven() {
        System.out.println("*PLOT* *PLOT* ... Aqui estoy! ^Y^ ");
    }
}
