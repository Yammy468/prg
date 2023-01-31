/**
 * Programa que prueba la clase Zona
 */
import java.util.Scanner;
public class PruebaZona {
    public static void main(String agrs[]) {
        Scanner s = new Scanner(System.in);

        int opcion = 0;
        int opcionZona = 0;
        int numeroCompra;

        Zona salaPrincipal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        while(opcion != 3) {
            System.out.println("\nEXPOCOCHES CAMPANILLAS");
            System.out.println("======================");
            System.out.println("1. Mostrar número de entradas libres.");
            System.out.println("2. Vender entradas.");
            System.out.println("3. Salir.");
            System.out.println("Elige una opción (1-3): ");

            opcion = s.nextInt();

            switch(opcion) {
            	case 1:
                System.out.println("\nEn la zona de la sala principal esta disponible " + salaPrincipal.getEntradasPorVender() + " entradas libres.");
                System.out.println("\nEn la zona de compra-venta esta disponible " + compraVenta.getEntradasPorVender() + " entradas libres.");
                System.out.println("\nEn la zona VIP esta disponible " + vip.getEntradasPorVender() + " entradas libres.");
                break;

                case 2:
                System.out.println("\nZona");
                System.out.println("=====");
                System.out.println("1. Sala principal.");
                System.out.println("2. Zona de compra-venta.");
                System.out.println("3. Zona VIP.");
                System.out.println("Elige la zona para las que quieres comprar las entradas (1-3): ");

                opcionZona = s.nextInt();

                System.out.println("\n¿Cuántas entradas desea comprar?");
                numeroCompra = s.nextInt();

                switch(opcionZona) {
                    case 1:
                    salaPrincipal.vender(numeroCompra);
                    break;

                    case 2:
                    compraVenta.vender(numeroCompra);
                    break;

                    case 3:
                    vip.vender(numeroCompra);
                    break;

                    default:
                };
                default:
            }
        }
    }
}
