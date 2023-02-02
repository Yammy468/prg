/**
 * Programa que prueba la clase Disco segundario
 */
import java.util.Scanner;
import java.io.Console;
public class ColeccionDeDiscos {
    public static void main(String agrs[]) {
        Scanner s = new Scanner(System.in);
        Console c = System.console();

        // Definir el array
        Discos[] disco = new Discos[50]; // tiene como cantidad de disco, por ejemplo, unos 50 discos

        // Crear el objeto disco para los espacios vacios
        for(int i = 0; i < 50; i++) {
            disco[i] = new Discos();
        }

        // Cargar algunos discos
        disco[0] = new Discos("92SHC", "Big Fish", "Zhou Shen", "MandoPop", 45);
        disco[1] = new Discos("AK0912", "Aikatsu!", "Star Anis", "Rhythm", 80);
        disco[2] = new Discos("82CSC", "The Most Beautiful Sun", "Zhan Jie", "MandoPop", 65);
        disco[3] = new Discos("15DDT", "If Only", "Dove Cameron", "Pop", 50);

        int opcion = 0;
        String codigoIntroducido;
        String tituloIntroducido;
        String autorIntroducido;
        String generoIntroducido;
        int duracionIntroducido;

        while (opcion != 5) {
            System.out.println("\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listas de discos.");
            System.out.println("2. Añadir nuevos discos.");
            System.out.println("3. Modificar discos.");
            System.out.println("4. Borrar discos");
            System.out.println("5. Salir.");
            System.out.print("Elige una opción (1-5): ");
            opcion = s.nextInt();
            
            switch(opcion) {
                case 1:
                System.out.println("\nLISTAS DE DISCOS.");
                System.out.println("=================");
                for(Discos d : disco) {
                    if (!d.getCodigo().equals("VACIO")) {
                      System.out.println(d);
                    }
                  }
                break;

                case 2:
                System.out.println("\nNUEVOS DISCOS.");
                System.out.println("==============");

                // Buscar la primera posicion libre del array
                int primeraLibre = -1;
                do {
                    primeraLibre++;
                } while(!((disco[primeraLibre].getCodigo()).equals("VACIO")));

                System.out.println("Por favor, a continuación, introduzca los datos del nuevo disco.");
                System.out.print("CÓDIGO: ");
                codigoIntroducido = c.readLine();
                System.out.print("TÍTULO: ");
                tituloIntroducido = c.readLine();
                System.out.print("AUTOR: ");
                autorIntroducido = c.readLine();
                System.out.print("GÉNERO: ");
                generoIntroducido = c.readLine();
                System.out.print("DURACIÓN: ");
                duracionIntroducido = s.nextInt();

                disco[primeraLibre] = new Discos(codigoIntroducido, tituloIntroducido, autorIntroducido, generoIntroducido, duracionIntroducido);
                break;

                case 3:
                System.out.println("\nMODIFICAR DISCOS.");
                System.out.println("==============");

                System.out.print("Por favor, introduzca el codigo del disco: ");
                codigoIntroducido = c.readLine();

                int i = -1;
                do {
                    i++;
                } while(!((disco[i].getCodigo()).equals(codigoIntroducido)));

                System.out.println("A continuación, introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
                
                System.out.println("CÓDIGO: " + disco[i].getCodigo());
                System.out.print("NUEVO Código: ");
                codigoIntroducido = c.readLine();
                if(!codigoIntroducido.equals("")) {
                    disco[i].setCodigo(codigoIntroducido);
                }
                System.out.println("TÍTULO: " + disco[i].getTitulo());
                System.out.print("NUEVO Título: ");
                tituloIntroducido = c.readLine();
                if(!tituloIntroducido.equals("")) {
                    disco[i].setTitulo(tituloIntroducido);
                }
                System.out.println("AUTOR: " + disco[i].getAutor());
                System.out.print("NUEVO Autor: ");
                autorIntroducido = c.readLine();
                if(!autorIntroducido.equals("")) {
                    disco[i].setAutor(autorIntroducido);;
                }
                System.out.println("GÉNERO: " + disco[i].getGenero());
                System.out.print("NUEVO Género: ");
                generoIntroducido = c.readLine();
                if(!generoIntroducido.equals("")) {
                    disco[i].setGenero(generoIntroducido);
                }
                System.out.println("DURACIÓN: " + disco[i].getDuracion());
                System.out.print("NUEVO Duración: ");
                final String duracionIntroducidoString = c.readLine();
                if(!duracionIntroducidoString.equals("")) {
                    disco[i].setDuracion(Integer.parseInt(duracionIntroducidoString));;
                }
                break;

                case 4:
                System.out.println("\nBORRAR DISCOS.");
                System.out.println("==============");
                
                System.out.print("Por favor, introduzca el codigo del disco: ");
                codigoIntroducido = c.readLine();

                i = -1;
                do {
                    i++;
                } while(!((disco[i].getCodigo()).equals(codigoIntroducido)));
                
                disco[i].setCodigo("VACIO");
                System.out.println("Disco borrado.");
                break;

                default:
            }
        } 
    }
}
