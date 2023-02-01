/**
 * Programa que prueba la clase gato usando array
 */
import java.util.Scanner;
import java.io.Console;
public class ArrayDeGato {
    public static void main(String agrs[]) {
        Scanner s = new Scanner(System.in);
        Console c = System.console();

        String verde = "\033[32m";
        String blanco = "\033[37m";

        // Define el array
        Gato[] gat = new Gato[4];

        // Pedir los datos de los gatos
        System.out.println("A continuación, debe introducir los datos de los gatos (nombre, raza, sexo y edad).");
        
        String nombreIntroducido;
        String razaIntroducido;
        String sexoIntroducido;
        int edadIntroducido;

        for(int i = 0; i < 4; i++) {
            
            // Crear los objetos
            gat[i] = new Gato();

            System.out.println("Gato " + i);

            // nombre
            System.out.print("Nombre: ");
            nombreIntroducido = c.readLine();
            gat[i].setNombre(nombreIntroducido);

            // raza
            System.out.print("Raza: ");
            razaIntroducido = c.readLine();
            gat[i].setRaza(razaIntroducido);

            // sexo
            System.out.print("Sexo: ");
            sexoIntroducido = c.readLine();
            gat[i].setSexo(sexoIntroducido);

            // edad
            System.out.print("Edad: ");
            edadIntroducido = s.nextInt();
            gat[i].setEdad(edadIntroducido);
        }

        // Mostracción de los datos de los gatos
        System.out.println("\n\nLos datos introducidos son los siguientes:\n");

        for(int i = 0; i < 4; i++) {
            System.out.println(verde + "Gato " + i + blanco);
            System.out.println("Nombre: " + gat[i].getNombre());
            System.out.println("Raza: " + gat[i].getRaza());
            System.out.println("Sexo: " + gat[i].getSexo());
            System.out.println("Edad: " + gat[i].getEdad());
            System.out.println("----------------------------");
        } 

    }
}
