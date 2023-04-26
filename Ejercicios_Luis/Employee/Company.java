import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.Console;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Company {
    Scanner s = new Scanner(System.in);
    Console c = System.console();

    ArrayList<Employee> listaEmployee;

    // Constructor vacio 
    public Company() {
        listaEmployee = new ArrayList<Employee>();
    }

    // Constructor que lee archivo CSV
    public Company(String filename) {
        listaEmployee = new ArrayList<Employee>();
        readCSV(filename);
    }

    // Metodo que lee el archivo CSV
    public void readCSV(String fileName) {
        BufferedReader br = null;
        String linea = "";

        try {
            FileReader fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            
            while((linea = br.readLine()) != null) {
                String [] partes = linea.split(",");

                int id = Integer.parseInt(partes[0]);
                String name = partes[1];
                String phone = partes[2];
                double salary = Double.parseDouble(partes[3]);

                Employee nuevEmployee = new Employee(id, name, phone, salary);
                this.listaEmployee.add(nuevEmployee);
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR!. No se puede encontrar el archivo.");
        } catch (IOException e) {
            System.out.println("Lo siento, no se pudo leer las cambios.");
        }
    }

    // Metodo que salva los cambios en un archivo CSV
    public void saveCSV(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(fw);

            for(Employee emp: listaEmployee) {
                pw.print(emp.getId() + ",");
                pw.print(emp.getName() + ",");
                pw.print(emp.getPhone() + ",");
                pw.print(emp.getSalary() + "\n");
            }
            pw.close();
        } catch (IOException e) {
            System.out.println("Lo siento, no se pudo guardar las cambios.");
        }
    }

    // Metodo para que el ID no se repita
    private boolean idEnUso(int id) {
        for(Employee emp: listaEmployee) {
            if(emp.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // Metode que crea un nuevo empleado
    public void create() {

        System.out.println("Introduce los nuevos datos.");

            Random random = new Random();
            int id;
        
            do {
                id = random.nextInt(1000);
            } while(idEnUso(id));

            System.out.println("Nuevo NAME: ");
            String name = c.readLine();
            System.out.println("Nuevo PHONE: ");
            String phone = c.readLine();
            System.out.println("Nuevo SALARY: ");
            double salary = s.nextDouble();

            Employee nuevEmployee = new Employee(id, name, phone, salary);
            this.listaEmployee.add(nuevEmployee);

            System.out.println("ENHORABUENA, se ha añadido un nuevo empleado.");
    
    }

    // Metodo donde muestra la lista de los empleado
    public void muestraLista() {
        for(Employee emp: listaEmployee) {
            String cadena = "\n----------------------------";
            cadena += "\nID: " + emp.getId();
            cadena += "\nNAME: " + emp.getName();
            cadena += "\n----------------------------";

            System.out.println(cadena);
        }
    }

    // Metodo donde se muestra el empleado segun id o nombre
    public Employee readEmployee() {
        System.out.println("\nElige entre la siguiente opciones: 1- Id, 2- Name");
        int opcion = s.nextInt();
        switch(opcion) {
            case 1:
            System.out.print("Introduce el ID que busca: ");
            int id = s.nextInt();
            for(Employee emp: listaEmployee) {
                if(emp.getId() == id) {
                    return emp;
                }
            }
            System.out.println("No se encontró ningún empleado con el ID especificado.");

            break;

            case 2:
            System.out.print("Introduce el NOMBRE que busca: ");
            String name = c.readLine();
            for(Employee emp: listaEmployee) {
                if(emp.getName().equals(name)) {
                    return emp;
                }
            }
            System.out.println("No se encontró ningún empleado con el NOMBRE especificado.");

            break;

            default:
        }
        return null;
    }

    // Metodo donde se borra empleado
    public Employee deletEmployee() {
        System.out.println("\nElige entre la siguiente opciones: 1- Id, 2- Name");
        int opcion = s.nextInt();
        Employee employeeBorrado = null; // Variable para almacenar el empleado borrado
        switch(opcion) {
            case 1:
            System.out.print("Introduce el ID que quieres borrar: ");
            int id = s.nextInt();
            for(int i = 0; i < listaEmployee.size(); i++) {
                Employee emp = listaEmployee.get(i);
                if(emp.getId() == id) {
                    employeeBorrado = listaEmployee.remove(i);
                    System.out.println("Se ha borrado con éxito el empleado.");
                    break;
                }
            }
            break;

            case 2:
            System.out.print("Introduce el NOMBRE que quieres borrar: ");
            String name = c.readLine();
            for(int i = 0; i < listaEmployee.size(); i++) {
                Employee emp = listaEmployee.get(i);
                if(emp.getName().equals(name)) {
                    employeeBorrado = listaEmployee.remove(i);
                    System.out.println("Se ha borrado con éxito el empleado.");
                    break;
                }
            }
            break;

            default:
        }
        return employeeBorrado;
    }

    // Metodo donde se actualiza los datos del nombre
    public void updateName() {
        System.out.println("\nElige entre la siguiente opciones: 1- Id, 2- Name");
        int opcion = s.nextInt();
        String nuevoName;
        
        switch(opcion) {
            case 1:
            System.out.print("Introduce el ID que busca: ");
            int id = s.nextInt();
            for(Employee emp: listaEmployee) {
                if(emp.getId() == id) {
                    System.out.println("A continuación, introduzca el nuevo nombre del empleado: ");
                    nuevoName = c.readLine();

                    emp.setName(nuevoName);
                    System.out.println("Se ha actualizado el nombre del empleado con éxito.");
                    return; // Salir del método después de actualizar el nombre
                }
            }
            break;

            case 2:
            System.out.print("Introduce el NOMBRE que busca: ");
            String name = c.readLine();
            for(Employee emp: listaEmployee) {
                if(emp.getName().equals(name)) {
                    System.out.println("A continuación, introduzca el nuevo nombre del empleado: ");
                    nuevoName = c.readLine();

                    emp.setName(nuevoName);
                    System.out.println("Se ha actualizado el nombre del empleado con éxito.");
                    return; // Salir del método después de actualizar el nombre                    
                }
            }
            break;

            default:
        }
        
    }

    // Metodo donde se actualiza los datos de telefono
    public void updatePhone() {
        System.out.println("\nElige entre la siguiente opciones: 1- Id, 2- Name");
        int opcion = s.nextInt();
        String nuevoPhone;
        
        switch(opcion) {
            case 1:
            System.out.print("Introduce el ID que busca: ");
            int id = s.nextInt();
            for(Employee emp: listaEmployee) {
                if(emp.getId() == id) {
                    System.out.println("A continuación, introduzca el nuevo telefono del empleado: ");
                    nuevoPhone = c.readLine();

                    emp.setName(nuevoPhone);
                    System.out.println("Se ha actualizado el telefono del empleado con éxito.");
                    return; // Salir del método después de actualizar el telefono
                }
            }
            break;

            case 2:
            System.out.print("Introduce el NOMBRE que busca: ");
            String name = c.readLine();
            for(Employee emp: listaEmployee) {
                if(emp.getName().equals(name)) {
                    System.out.println("A continuación, introduzca el nuevo telefono del empleado: ");
                    nuevoPhone = c.readLine();

                    emp.setName(nuevoPhone);
                    System.out.println("Se ha actualizado el telefono del empleado con éxito.");
                    return; // Salir del método después de actualizar el telefono                   
                }
            }
            break;

            default:
        }
    }
}
