/**
 * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
 * un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
 * anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
 * céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
 * cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
 * siguiendo la pauta correcta. Cada moneda generada debe ser una instancia
 * de la clase Moneda y la secuencia se debe ir almacenando en una lista.
 * Ejemplo:
 * 2 céntimos - cara
 * 2 céntimos - cruz
 * 50 céntimos - cruz
 * 1 euro - cruz
 * 1 euro - cara
 * 10 céntimos - cara
 */

import java.util.ArrayList;
public class Eurocoin {
    public static void main(String agrs[]) {
        ArrayList<Monedas> a = new ArrayList<Monedas>();

        Monedas monedaAux = new Monedas();
        a.add(monedaAux);

        String monedaValor = monedaAux.getValor();
        String monedaPosicion = monedaAux.getPosicion();

        for(int i = 0; i < 5; i++) {
            do {
                monedaAux = new Monedas();
            } while(!((monedaAux.getValor()).equals(monedaValor)) && !((monedaAux.getPosicion()).equals(monedaPosicion)));
            
            a.add(monedaAux);
            monedaValor = monedaAux.getValor();
			monedaPosicion = monedaAux.getPosicion();
        }

        for(Monedas moneda: a) {
            System.out.println(moneda);
        }
    }
}
