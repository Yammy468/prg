/**
 * Programa que prueba la clase gato usando array opcion 2
 */
public class ArrayDeGato02 {
    public static void main(String agrs[]) {

        String verde = "\033[32m";
        String blanco = "\033[37m";

        // Define el array
        Gato[] cat = new Gato[4];

        // Cargar los datos de los gatos
        cat[0] = new Gato("Blanca", "persa", "hembra", 6);
        cat[1] = new Gato("Tigre", "suizo", "macho", 4);
        cat[2] = new Gato("Luna", "turco", "hembra", 7);
        cat[3] = new Gato("Tom", "siamés", "macho", 5);

        // Mostracción de los datos de los gatos
        System.out.println("Los datos de los gatos son:\n");

        for(int i = 0; i < 4; i++) {
            System.out.println(verde + "Gato " + i + blanco);
            System.out.println("Nombre: " + cat[i].getNombre());
            System.out.println("Raza: " + cat[i].getRaza());
            System.out.println("Sexo: " + cat[i].getSexo());
            System.out.println("Edad: " + cat[i].getEdad());
            System.out.println("----------------------------");
        } 

    }
}
