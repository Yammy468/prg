/**
 * Programa que prueba la clase Articulo
 */
import java.util.Scanner;
import java.io.Console;
public class Gestisimal {
    public static void main(String agrs[]) {
        Scanner s = new Scanner(System.in);
        Console c = System.console();

        // Definir el tamaño del array
        Articulos[] articulo = new Articulos[50]; // la cantidad de artículos son 50 artículos, como ejemplo.

        // Crear el objeto en un array
        for(int i = 0; i < 50; i++) {
            articulo[i] = new Articulos();
        }

        int opcion = 0;
        String codigo;
        String codigoIntroducido = "";
        String descripcionIntroducido;
        double precioCompraIntroducido;
        double precioVentaIntroducido;
        int stockIntroducido;

        while(opcion != 7) {
            System.out.println("\nG E S T I S I M A L");
            System.out.println("===================");
            System.out.println("1. Listado.");
            System.out.println("2. Alta.");
            System.out.println("3. Baja.");
            System.out.println("4. Modificación.");
            System.out.println("5. Entrada de mercancia.");
            System.out.println("6. Salida de mercancia.");
            System.out.println("7. Salir.");
            System.out.print("Elige una opción (1-7): ");
            opcion = s.nextInt();

            switch(opcion) {


                // LISTADO //

                case 1:
                System.out.println("\nLISTADO.");
                System.out.println("========");
                for(Articulos a: articulo) {
                    if(!a.getCodigo().equals("VACIO")) {
                        System.out.println(a);
                    }
                }
                break;


                // ALTA (NUEVO ARTICULOS) //

                case 2:
                System.out.println("\nNUEVOS ARTICULOS (ALTA).");
                System.out.println("========================");

                // Buscar un espacio vacio
                int primeraLibre = 0;
                codigo = articulo[primeraLibre].getCodigo();
                while(!(codigo.equals("VACIO")) && (primeraLibre < 50)) {
                    primeraLibre++;
                    codigo = articulo[primeraLibre].getCodigo();
                }

                if(primeraLibre == 50) {
                    System.out.println("Lo siento, la base de datos esta lleno.");
                } else {
                    System.out.println("Por favor, a continuación, introduzca los datos del nuevo artículos.");
                    System.out.print("CÓDIGO: ");
                    
                    // Comprobar que el código existe
                    boolean existe = true;
                    while(existe) {
                        existe = false;
                        codigoIntroducido = c.readLine();

                        for(Articulos a: articulo)
                        if(codigoIntroducido.equals(a.getCodigo())) {
                            existe = true;
                        }
                        if(existe) {
                            System.out.println("Lo siento, este código ya existe.");
                            System.out.print("Por favor, introduzca otro código: ");
                        }
                    }

                    System.out.print("DESCRIPCIÓN: ");
                    descripcionIntroducido = c.readLine();
                    System.out.print("PRECIO COMPRA: ");
                    precioCompraIntroducido = s.nextDouble();
                    System.out.print("PRECIO VENTA: ");
                    precioVentaIntroducido = s.nextDouble();
                    System.out.print("STOCK: ");
                    stockIntroducido = s.nextInt();

                    articulo[primeraLibre] = new Articulos(codigoIntroducido, descripcionIntroducido, precioCompraIntroducido, precioVentaIntroducido, stockIntroducido);
                }
                break;
                

                // BAJA (BORRAR) //

                case 3:
                System.out.println("\nBORRAR ARTICULOS (BAJA).");
                System.out.println("========================");

                System.out.print("Por favor, introduzca el código del artículo: ");
                codigoIntroducido = c.readLine();

                int i = -1;
                codigo = "";
                do {
                    i++;
                    if(i < 50) {
                        codigo = articulo[i].getCodigo();
                    }
                } while(!(codigo.equals(codigoIntroducido)) && (i < 50));

                if(i == 50) {
                    System.out.println("\nERROR, este código no existe.");
                } else {
                    articulo[i].setCodigo("VACIO");
                    System.out.println("Artículo BORRADO.");
                }
                break;


                // MODIFICACIÓN //
                
                case 4:
                System.out.println("\nMODIFICAR ARTÍCULOS.");
                System.out.println("====================");

                System.out.print("Por favor, introduzca el codigo del artículo: ");
                codigoIntroducido = c.readLine();
                
                i = -1;
                codigo = "";
                do {
                    i++;
                    if(i < 50) {
                        codigo = articulo[i].getCodigo();
                    }
                } while(!(codigo.equals(codigoIntroducido)) && (i < 50));

                System.out.println("A continuación, introduzca los nuevos datos del artículo o INTRO para dejarlos igual.");
               
                System.out.println("CÓDIGO: " + articulo[i].getCodigo());
                System.out.print("NUEVO Código: ");
                codigoIntroducido = c.readLine();
                if(!codigoIntroducido.equals("")) {
                    articulo[i].setCodigo(codigoIntroducido);
                }
                System.out.println("DESCRIPCIÓN: " + articulo[i].getDescripcion());
                System.out.print("NUEVA Descripción: ");
                descripcionIntroducido = c.readLine();
                if(!descripcionIntroducido.equals("")) {
                    articulo[i].setDescripcion(descripcionIntroducido);
                }
                System.out.println("PRECIO COMPRA: " + articulo[i].getPrecioCompra());
                System.out.print("NUEVO Precio de compra: ");
                final String precioCompraIntroducidoString = c.readLine();
                if(!precioCompraIntroducidoString.equals("")) {
                    articulo[i].setPrecioCompra(Integer.parseInt(precioCompraIntroducidoString));
                }
                System.out.println("PRECIO VENTA: " + articulo[i].getPrecioVenta());
                System.out.print("NUEVO Precio de venta: ");
                final String precioVentaIntroducidoString = c.readLine();
                if(!precioVentaIntroducidoString.equals("")) {
                    articulo[i].setPrecioVenta(Integer.parseInt(precioVentaIntroducidoString));
                }
                System.out.println("STOCK: " + articulo[i].getStock());
                System.out.print("NUEVO Stock: ");
                final String stockIntroducidoString = c.readLine();
                if(!stockIntroducidoString.equals("")) {
                    articulo[i].setStock(Integer.parseInt(stockIntroducidoString));
                }
                break;


                // ENTRADA DE MERCANCIA (INCREMENTO) //

                case 5:
                System.out.println("\nENTRADA DE MERCANCIA.");
                System.out.println("=====================");
                System.out.print("Por favor, introduzca el código del artículo: ");
                codigoIntroducido = c.readLine();

                i = -1;
                codigo = "";
                do {
                    i++;
                    if(i < 50) {
                        codigo = articulo[i].getCodigo();
                    }
                } while(!(codigo.equals(codigoIntroducido)) && (i < 50));

                System.out.println("Entrada de mercancía del siguiente artículo: ");
                System.out.println(articulo[i]);
                System.out.print("Introduzca el número de unidades que entran: ");
                int numeroEntrada = s.nextInt();
                articulo[i].setStock(numeroEntrada + articulo[i].getStock());
                System.out.println("La mercancía ha entrado en el almacén.");  
                break;


                // SALIDA DE MERCANCIA (DECREMENTO) //

                case 6:
                System.out.println("\nSALIDA DE MERCANCIA.");
                System.out.println("====================");
                System.out.print("Por favor, introduzca el código del artículo: ");
                codigoIntroducido = c.readLine();

                i = -1;
                codigo = "";
                do {
                    i++;
                    if(i < 50) {
                        codigo = articulo[i].getCodigo();
                    }
                } while(!(codigo.equals(codigoIntroducido)) && (i < 50));

                System.out.println("Entrada de mercancía del siguiente artículo: ");
                System.out.println(articulo[i]);
                System.out.print("Introduzca el número de unidades que salen: ");
                stockIntroducido = s.nextInt();
                if (articulo[i].getStock() - stockIntroducido > 0) {
                    articulo[i].setStock(articulo[i].getStock() - stockIntroducido);
                    System.out.println("La mercancía ha salido del almacén.");
                  } else {
                    System.out.println("Lo siento, no se pueden sacar tantas unidades.");
                  } 
                break;

                default:
            }

        }
    }
}
