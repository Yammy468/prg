/**
 * Monedas.java
 */

public class Monedas {
    private static String valorMoneda[] = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25 céntimos", "50 céntimos", "1 euro", "2 euros"};
    private static String posicionMoneda[] = {"cara", "cruz"};
    private String valor;
    private String posicion;

    public Monedas() {
        this.valor = valorMoneda[(int)(Math.random()*8)];
        this.posicion = posicionMoneda[(int)(Math.random()*2)];
    }

    /* getter */
    public String getValor() {
        return this.valor;
    }

    public String getPosicion() {
        return this.posicion;
    }

    public String toString() {
        return this.valor + " - " + this.posicion;
    }

}