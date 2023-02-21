/** 
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 */

public class Cartas {
    private static String valorCarta[] = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "sota", "caballero", "rey"};
    private static String paloCarta[] = {"oros", "copas", "espadas", "bastos"};
    private String valor;
    private String palo;

    public Cartas() {
        this.valor = valorCarta[(int)(Math.random()*12)];
        this.palo = paloCarta[(int)(Math.random()*4)];
    }

    /* getter */
    public String getValor() {
        return this.valor;
    }

    public String getPalo() {
        return this.palo;
    }

    public String toString() {
        return this.valor + " de " + this.palo;
    }

}