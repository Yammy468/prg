/**
 * Programa que prueba la clase Cartas
 */

import java.util.ArrayList;
public class PruebaCartas {
    public static void main(String agrs[]) {
        ArrayList<Cartas> a = new ArrayList<Cartas>();

        Cartas cartaAux = new Cartas();
        a.add(cartaAux);

        String cartaValor = cartaAux.getValor();
        String cartaPalo = cartaAux.getPalo();

        for(int i = 0; i < 9; i++) {
            do {
                cartaAux = new Cartas();
            } while(!((cartaAux.getValor()).equals(cartaValor)) && !((cartaAux.getPalo()).equals(cartaPalo)));

            a.add(cartaAux);
            cartaValor = cartaAux.getValor();
            cartaPalo = cartaAux.getPalo();
        }

        for(Cartas carta: a) {
            System.out.println(carta);
        }
    }
}