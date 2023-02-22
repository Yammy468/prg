/**
 * Programa que prueba la clase Cartas modificado
 */

import java.util.Collections;
import java.util.ArrayList;
public class OrdenarCartas {
    public static void main(String agrs[]) {
        ArrayList<Cartas> a = new ArrayList<Cartas>();

        Cartas cartaAux = new Cartas();
        a.add(cartaAux);

        for(int i = 0; i < 9; i++) {
            do {
                cartaAux = new Cartas();
            } while(a.contains(cartaAux));

            a.add(cartaAux);
        }

        System.out.println("\nLas barajas desordenados:");

        for(Cartas carta: a) {
            System.out.println(carta);
        }

        Collections.sort(a);

        System.out.println("\nLas barajas ordenados:");

        for(Cartas carta: a) {
            System.out.println(carta);
        }
    }
}