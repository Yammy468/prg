/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author zhuyana
 */

import java.util.Scanner;
import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Console c = System.console();

        String verde = "\033[32m";
        String blanco = "\033[37m";

        Pokedex p = new Pokedex();
        p.leeCSV("pokemon.csv"); // Se carga la lista de Pokemon del archivo CSV (de forma automático)

        int opcion = 0;

        while(opcion != 9) {
            System.out.println("\n***** POKEDEX *****");
            System.out.println("===================");
            System.out.println("1. Capturar Pokemon.");
            System.out.println("2. Mostrar Porcentajes de Capturas.");
            System.out.println("3. Buscar Pokemon según su ID.");
            System.out.println("4. Buscar Pokemon según su Nombre.");
            System.out.println("5. Mostrar Listado de Pokemon.");
            System.out.println("6. Mostrar Listado de Pokemon Capturados.");
            System.out.println("7. Mostrar Listado de Pokemon según el Tipo.");
            System.out.println("8. Mostrar Listado de Pokemon Capturados por Tipo.");
            System.out.println("9. Salir.");
            System.out.print("Elige una opción (1-9): ");
            opcion = s.nextInt();

            switch(opcion) {

                // CAPTURAR POKEMON
                case 1:
                System.out.println("\nCAPTURAR POKEMON.");
                System.out.println("=================");
                System.out.print("Introduce el nombre del pokemon capturado: ");
                String nombreCaptura = c.readLine();
                p.capturaPokemon(nombreCaptura);
                System.out.println("¡¡¡ENHORABUENA POR LOGRAR CAPTURAR UN NUEVO POKEMON!!!");
                break;

                // PORCENTAJES DE CAPTURAS
                case 2:
                System.out.println("\nPORCENTAJES DE CAPTURAS.");
                System.out.println("========================");
                double porcentaje = p.porcentajeCapturas();
                System.out.println("El porcentaje de los pokemon que ha sido capturado es del " + verde + porcentaje + "%" + blanco);
                break;

                // BUSCAR POKEMON POR ID
                case 3:
                System.out.println("\nBUSCAR POKEMON POR ID.");
                System.out.println("======================");
                System.out.print("Introduce el ID del Pokemon que busca: ");
                int buscaId = s.nextInt();
                Pokemon idPokemon = p.buscaPokemon(buscaId);
                if(idPokemon != null) {
                    System.out.println("Pokemon encontrado.");
                    System.out.println(idPokemon.toString());
                } else {
                    System.out.println("Pokemon NO encontrado.");
                }
                break;

                // BUSCAR POKEMON POR NOMBRE
                case 4:
                System.out.println("\nBUSCAR POKEMON POR NOMBRE.");
                System.out.println("==========================");
                System.out.print("Introduce el NOMBRE del Pokemon que busca: ");
                String buscaNombre = c.readLine();
                Pokemon nombrePokemon = p.buscaPokemon(buscaNombre);
                if(nombrePokemon != null) {
                    System.out.println("Pokemon encontrado.");
                    System.out.println(nombrePokemon.toString());
                } else {
                    System.out.println("Pokemon NO encontrado.");
                }
                break;

                // LISTADO POKEMON
                case 5:
                System.out.println("\nLISTADO POKEMON.");
                System.out.println("================");
                System.out.println("Listado de Pokemon:");
                p.listadoPokemon();
                break;

                // LISTADO POKEMON CAPTURADOS
                case 6:
                System.out.println("\nLISTADO POKEMON CAPTURADOS.");
                System.out.println("===========================");
                System.out.println("Listado de Pokemon capturados:");
                p.listadoPokemonCapturados();
                break;

                // LISTADO POKEMON POR TIPO
                case 7:
                System.out.println("\nLISTADO POKEMON POR TIPO.");
                System.out.println("=========================");
                System.out.print("Introduce el TIPO del Pokemon: ");
                String listaTipo = c.readLine();
                System.out.println("Listado de Pokemon según el Tipo:");
                p.listadoPokemonTipo(listaTipo);
                break;

                // LISTADO POKEMON CAPTURADOS POR TIPO
                case 8:
                System.out.println("\nLISTADO POKEMON CAPTURADOS POR TIPO.");
                System.out.println("====================================");
                System.out.print("Introduce el TIPO del Pokemon CAPTURADOS: ");
                String listaTipoCapturado = c.readLine();
                System.out.println("Listado de Pokemon Capturados según el Tipo:");
                p.listadoPokemonCapturadosTipo(listaTipoCapturado);
                break;
            
                default:
            }
        }

        p.guardaCSV("pokemon.csv"); // Se guarda la lista de pokemon (de forma automático)
        System.out.println(verde + "\n¡Gracias por usar la Pokedex!" + blanco);
    }

}
