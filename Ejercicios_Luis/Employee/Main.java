import java.util.Scanner;
import java.io.Console;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Console c = System.console();

        Company comp = new Company();

        comp.readCSV("datos.csv"); // lee archivo CSV de forma automatico

        int opcion = 0;

        while(opcion != 7) {
            System.out.print("\n****GESTIÓN DE EMPLEADOS EN UNA COMPAÑIA****");
            System.out.print("\n1. Mostrar el nombre de los empleados de la empresa (junto con su id).");
            System.out.print("\n2. Consultar información de un empleado dado.");
            System.out.print("\n3. Crear empleado con id autogenerado.");
            System.out.print("\n4. Eliminar empleado.");
            System.out.print("\n5. Actualizar el nombre de un empleado.");
            System.out.print("\n6. Actualizar el teléfono de un empleado.");
            System.out.print("\n7. Salvar los en un fichero especificado dado. ----> ¡¡ SALIR !!");
            System.out.print("\nElige un de las opciones dado: ");
            opcion = s.nextInt();

            switch(opcion) {
                case 1: // MOSTRAR NOMBRE DE LOS EMPLEADO CON SU IDS
                System.out.print("\nMOSTRAR NOMBRE DE LOS EMPLEADO CON SU IDS");
                System.out.print("\n=========================================");
                comp.muestraLista();
                break;

                case 2: // CONSULTAR INFORMACIÓN DEL EMPLEADO
                System.out.print("\nCONSULTAR INFORMACIÓN DEL EMPLEADO");
                System.out.print("\n==================================");
                System.out.println(comp.readEmployee());
                break;
                
                case 3: // CREAR EMPLEADO CON ID (AUTOGENERADO)
                System.out.print("\nCREAR EMPLEADO CON ID (AUTOGENERADO)");
                System.out.print("\n====================================");
                comp.create();
                break;

                case 4: // ELIMINAR EMPLEADO
                System.out.print("\nELIMINAR EMPLEADO");
                System.out.print("\n=================");
                comp.deletEmployee();
                break;

                case 5: // ACTUALIZAR NOMBRE DEL EMPLEADO
                System.out.print("\nACTUALIZAR NOMBRE DEL EMPLEADO");
                System.out.print("\n==============================");
                comp.updateName();
                break;

                case 6: // ACTUALIZAR TELÉFONO DEL EMPLEADO
                System.out.print("\nACTUALIZAR TELÉFONO DEL EMPLEADO");
                System.out.print("\n================================");
                comp.updatePhone();
                break;

                default: // GUARDAR LOS CAMBIOS
                comp.saveCSV("datos.csv"); 

            }
        }
    }
}
