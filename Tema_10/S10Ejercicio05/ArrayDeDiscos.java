/**
 * Programa que prueba la clase Disco
 * 
 * Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez
 * una lista para almacenar la información sobre los discos en lugar de un array
 * convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
 * ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
 * programa hecho con una lista?
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.Console;

public class ArrayDeDiscos {
    public static void main(String agrs[]) {
        Scanner s = new Scanner(System.in);
        Console c = System.console();

        ArrayList<Discos> a = new ArrayList<Discos>();
                
        a.add(new Discos("92SHC", "Big Fish", "Zhou shen", "Mandopop", 45));
		a.add(new Discos("AK0912", "Aikatsu!", "Star anis", "Rhythm", 80));
        a.add(new Discos("82CSC", "The Most Beautiful Sun", "Zhan jie", "Mandopop", 65));
        a.add(new Discos("15DDT", "If only", "Dove cameron", "Pop", 50));
   
        int i;
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

                // LISTADO //

                case 1:
                int opcionLista = 0;

                while(opcionLista != 5) {
                    System.out.println("\nLISTAS DE DISCOS.");
                    System.out.println("=================");
                    System.out.println("1. Listado completo.");
                    System.out.println("2. Listado por autor.");
                    System.out.println("3. Listado por género.");
                    System.out.println("4. Listado en un rango de duración.");
                    System.out.println("5. Menú principal.");
                    System.out.print("Elige una opción (1-5): ");
                    opcionLista = s.nextInt();

                    switch(opcionLista) {


                        /// LISTA COMPLETO ///

                        case 1: 
                        System.out.println("\nLISTADO COMPLETO.");
                        System.out.println("=================");
                        for(Discos d : a) {
                            if (!d.getCodigo().equals("VACIO")) {
                            System.out.println(d);
                            }
                        }
                        break;


                        /// LISTADO POR AUTOR ///

                        case 2:
                                                
                        System.out.print("Introduzca el nombre del autor: ");
                        autorIntroducido = c.readLine();

                        System.out.println("\nLISTADO POR AUTOR.");
                        System.out.println("==================");
                        for(Discos d : a) {
                            if (!d.getCodigo().equals("VACIO") && d.getAutor().equals(autorIntroducido)) {
                            System.out.println(d);
                            }
                        }
                        break;


                        /// LISTADO POR GÉNERO ///

                        case 3:
                        System.out.print("Introduzca el tipo de género: ");
                        generoIntroducido = c.readLine();

                        System.out.println("\nLISTADO POR GÉNERO.");
                        System.out.println("===================");
                        for(Discos d : a) {
                            if (!d.getCodigo().equals("VACIO") && d.getGenero().equals(generoIntroducido)) {
                            System.out.println(d);
                            }
                        }
                        break;


                        /// LISTADO EN UN RANGO DE DURACIÓN ///

                        case 4:
                        System.out.println("\nDetermina el rango de duración.");
                        System.out.print("Introduzca el limite inferior de duración (en minutos): ");
                        int limiteInferior = s.nextInt();
                        System.out.print("A continuación, introduzca el limite superior de duración (en minutos): ");
                        int limiteSuperior = s.nextInt();

                        System.out.println("\nLISTADO EN UN RANGO DE DURACIÓN.");
                        System.out.println("================================");
                        for(Discos d : a) {
                            if ((d.getDuracion() <= limiteSuperior) && (d.getDuracion() >= limiteInferior)) {
                            System.out.println(d);
                            }
                        }
                        break;

                        default:
                    }
                }
                break;


                // NUEVOS DISCOS //

                case 2:
                System.out.println("\nNUEVOS DISCOS.");
                System.out.println("==============");

                System.out.println("Por favor, a continuación, introduzca los datos del nuevo disco.");
                System.out.print("CÓDIGO: ");
                codigoIntroducido = c.readLine();

                // Comprobar que el codigo existe

                while(a.contains(new Discos(codigoIntroducido, "", "", "", 0))) {
                    System.out.println("Lo siento, este código ya existe.");
                    System.out.print("Por favor, introduzca otro código: ");
                    codigoIntroducido = c.readLine();
                }

                System.out.print("TÍTULO: ");
                tituloIntroducido = c.readLine();
                System.out.print("AUTOR: ");
                autorIntroducido = c.readLine();
                System.out.print("GÉNERO: ");
                generoIntroducido = c.readLine();
                System.out.print("DURACIÓN: ");
                duracionIntroducido = s.nextInt();

                a.add(new Discos(codigoIntroducido, tituloIntroducido, autorIntroducido, generoIntroducido, duracionIntroducido));
                
                break;


                // MODIFICAR //

                case 3:
                System.out.println("\nMODIFICAR DISCOS.");
                System.out.println("==============");

                System.out.print("Por favor, introduzca el codigo del disco: ");
                codigoIntroducido = c.readLine();

                while(!(a.contains(new Discos(codigoIntroducido, "", "", "", 0)))) {
                    System.out.println("Lo siento, este código NO EXISTE.");
                    System.out.print("Por favor, introduzca otro código: ");
                    codigoIntroducido = c.readLine();
                } 
                i = a.indexOf(new Discos(codigoIntroducido, "", "", "", 0));

                System.out.println("A continuación, introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
                            
                System.out.println("CÓDIGO: " + a.get(i).getCodigo());
                System.out.print("NUEVO Código: ");
                codigoIntroducido = c.readLine();
                if(!codigoIntroducido.equals("")) {
                    a.get(i).setCodigo(codigoIntroducido);
                }
                System.out.println("TÍTULO: " + a.get(i).getTitulo());
                System.out.print("NUEVO Título: ");
                tituloIntroducido = c.readLine();
                if(!tituloIntroducido.equals("")) {
                    a.get(i).setTitulo(tituloIntroducido);
                }
                System.out.println("AUTOR: " + a.get(i).getAutor());
                System.out.print("NUEVO Autor: ");
                autorIntroducido = c.readLine();
                if(!autorIntroducido.equals("")) {
                    a.get(i).setAutor(autorIntroducido);;
                }
                System.out.println("GÉNERO: " + a.get(i).getGenero());
                System.out.print("NUEVO Género: ");
                generoIntroducido = c.readLine();
                if(!generoIntroducido.equals("")) {
                    a.get(i).setGenero(generoIntroducido);
                }
                System.out.println("DURACIÓN: " + a.get(i).getDuracion());
                System.out.print("NUEVO Duración: ");
                final String duracionIntroducidoString = c.readLine();
                if(!duracionIntroducidoString.equals("")) {
                    a.get(i).setDuracion(Integer.parseInt(duracionIntroducidoString));;
                }

                break;


                // BORRAR //

                case 4:
                System.out.println("\nBORRAR DISCOS.");
                System.out.println("==============");
                
                System.out.print("Por favor, introduzca el codigo del disco: ");
                codigoIntroducido = c.readLine();

                if(!a.contains(new Discos(codigoIntroducido, "", "", "", 0))) {
                    System.out.println("\nERROR, este código no existe.");
                } else {
                    a.remove(a.indexOf(new Discos(codigoIntroducido, "", "", "", 0)));
                    System.out.println("Disco borrado.");
                }

                break;

                default:
            }
        } 
    }
}
