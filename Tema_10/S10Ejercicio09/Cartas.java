/** 
 * Modifica el programa anterior de tal forma que las cartas se muestren orde-
 * nadas. Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
 * coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 */

public class Cartas implements Comparable<Cartas> {
    private static String valorCarta[] = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballero", "rey"};
    private static String paloCarta[] = {"oros", "copas", "espadas", "bastos"};
    private Integer valor;
    private String palo;

    public Cartas() {
        this.valor = (int)(Math.random()*10);
        this.palo = paloCarta[(int)(Math.random()*4)];
    }

    /* getter */
    public int getValor() {
        return this.valor;
    }

    public String getPalo() {
        return this.palo;
    }

    public String toString() {
        return valorCarta[this.valor] + " de " + this.palo;
    }


    /* comparar */
    public int compareTo(Cartas c) {
        if(this.palo.equals(c.getPalo())) {
            return (this.valor).compareTo(c.getValor());
        } else {
            return (this.palo).compareTo(c.getPalo());
        }
    }
}
