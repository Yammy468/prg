/**
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 */

import java.util.ArrayList;

public class S10Ejercicio01 {
    public static void main(String agrs[]) {
        ArrayList<String> nombre = new ArrayList<String>();

        nombre.add("Javier");
        nombre.add("Juan Jesús");
        nombre.add("Alberto");
        nombre.add("Mario");
        nombre.add("Jorge");
        nombre.add("Hector");

        System.out.println("Nombre de los 6 compañeros:\n");
        for(int i = 0; i < nombre.size(); i++) {
            System.out.println(nombre.get(i));
        }
    }
}
