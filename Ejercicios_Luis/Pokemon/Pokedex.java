
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Pokedex {
    private ArrayList <Pokemon> listaPokemon;

		String rojo = "\033[31m";
        String verde = "\033[32m";
        String blanco = "\033[37m";
        
    // Constructor vacio
    public Pokedex() {
        this.listaPokemon = new ArrayList<Pokemon>();
    }

    // Constructor que lee un archivo CSV
    public Pokedex(String nombreFichero) {
        this.listaPokemon = new ArrayList<Pokemon>();
        this.leeCSV(nombreFichero);
    }

    // Metodo que carga la lista y lo lee
    public void leeCSV(String nombreFichero) {
        BufferedReader br = null;
        String linea = "";
        try {
            FileReader fr = new FileReader(nombreFichero);
            br = new BufferedReader(fr);
            
            while((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");

                int id = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                String tipo = partes[2];
                int ataque = Integer.parseInt(partes[3]);
                int defensa = Integer.parseInt(partes[4]);
                int vida = Integer.parseInt(partes[5]);
                int ataqueEspecial = Integer.parseInt(partes[6]);
                int defensaEspecial = Integer.parseInt(partes[7]);
                int velocidad = Integer.parseInt(partes[8]);
                String habilidad = partes[9];
                boolean capturado = Boolean.parseBoolean(partes[10]);

                Pokemon pokemon = new Pokemon(id, nombre, tipo, ataque, defensa, vida, ataqueEspecial, defensaEspecial, velocidad, habilidad, capturado);
                this.listaPokemon.add(pokemon);
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encunetra el fichero " + nombreFichero);
        } catch (IOException e) {
            System.out.println("ERROR! No se puede leer el archivo " + nombreFichero);
        } catch (NumberFormatException e) {
            System.out.println("Archivo CSV mal formateado.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Archivo CSV mal formateado.");
        }
    }

    // Metodo donde guarda la lista
    public void guardaCSV(String nombreFichero) {
        try {
            FileWriter fw = new FileWriter(nombreFichero);
            PrintWriter pw = new PrintWriter(fw);

            for(Pokemon a: listaPokemon) {
                pw.print(a.getId() + ",");
                pw.print(a.getNombre() + ",");
                pw.print(a.getTipo() + ",");
                pw.print(a.getAtaque() + ",");
                pw.print(a.getDefensa() + ",");
                pw.print(a.getVida() + ",");
                pw.print(a.getAtaqueEspecial() + ",");
                pw.print(a.getDefensaEspecial() + ",");
                pw.print(a.getVelocidad() + ",");
                pw.print(a.getHabilidad() + ",");
                pw.print(a.getCapturado() + "\n");
            }
            pw.close();

        } catch (IOException e) {
            System.out.println("ERROR! No se puede guardar el archivo " + nombreFichero);
        }
    }

    // Metodo que marca que el pokemon esta capturado
    public void capturaPokemon(String nombrePokemon) {
        for(Pokemon a: listaPokemon) {
            if(a.getNombre().equals(nombrePokemon)) {
                a.setCapturado(true);
                System.out.println("El pokemon " + verde + nombrePokemon + blanco + " ha sido CAPTURADO CON EXISTO!!!!");
            } 
        }
    }

    // Metodo en la que nos muestra el porcentaje de los pokemon capturado
    public double porcentajeCapturas() {
        int totalLista = listaPokemon.size();
        int captura = 0;
        for(Pokemon a: listaPokemon) {
            if(a.getCapturado()) {
                captura++;
            }
        }

        double porcentaje = ((double) captura * 100.0) / (double) listaPokemon.size();
        return porcentaje;
    }

    // Metodo de buscar pokemon con el codigo id
    public Pokemon buscaPokemon(int id) {
        for(Pokemon a: listaPokemon) {
            if(a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    // Metodo que buscar pokemon a partir del nombre
    public Pokemon buscaPokemon(String nombre) {
        for(Pokemon a: listaPokemon) {
            if(a.getNombre().equals(nombre)) {
                return a;
            }
        }
        return null;
    }

    // Metodo que muestra la lista de pokemon
    public void listadoPokemon() {
        for(Pokemon a: listaPokemon) {
            String cadena = "\n---------------------------------";
            cadena += "\nID: " + a.getId();
            cadena += "\nNombre: " + a.getNombre();
            cadena += "\nTipo: " + a.getTipo();
            cadena += "\nCapturado: " + a.getCapturado();
            cadena += "\n---------------------------------";

			System.out.println(cadena);
        }
    }

    // Muestra una lista de los pokemon capturados
    public void listadoPokemonCapturados() {
        for(Pokemon a: listaPokemon) {
            if(a.getCapturado()) {
                String cadena = "\n---------------------------------";
                cadena += "\nID: " + a.getId();
                cadena += "\nNombre: " + a.getNombre();
                cadena += "\nTipo: " + a.getTipo();
                cadena += "\n---------------------------------";

                System.out.println(cadena);
            }
        }
    }

    // Muestra una lista de los pokemon segun sus tipos
    public void listadoPokemonTipo(String tipo) {
        for(Pokemon a:listaPokemon) {
            if(a.getTipo().equals(tipo)) {
                String cadena = "\n---------------------------------";
                cadena += "\nID: " + a.getId();
                cadena += "\nNombre: " + a.getNombre();
                cadena += "\nCapturado: " + a.getCapturado();
                cadena += "\n---------------------------------";

                System.out.println(cadena);
            }
        }
    }

    // Muestra una lista de los pokemon capturado pero segun el tipo
    public void listadoPokemonCapturadosTipo(String tipo) {
        for(Pokemon a: listaPokemon) {
            if(a.getCapturado() && a.getTipo().equals(tipo)) {
                String cadena = "\n---------------------------------";
                cadena += "\nID: " + a.getId();
                cadena += "\nNombre: " + a.getNombre();
                cadena += "\n---------------------------------";

                System.out.println(cadena);
            } 
        }
    }
}
