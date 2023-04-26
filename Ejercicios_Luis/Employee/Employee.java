public class Employee {

    // Atributos
    private int id;
    private String name, phone;
    private double salary;

    // Constructor completo
    public Employee(int id, String name, String phone, double salary) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    // Constructor con id y nombre
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor con nombre, telefono y salario
    public Employee(String name, String phone, double salary) {
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    // getter y setter
    public int getId() { // ID
        return this.id;
    }

    public String getName() { // NOMBRE
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() { // TELEFONO
        return this.phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() { // SALARIO
        return this.salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString
    @Override
    public String toString() {
        String cadena = "\n----------------------------";
        cadena += "\nID: " + this.id;
        cadena += "\nNAME: " + this.name;
        cadena += "\nPHONE: " + this.phone;
        cadena += "\nSALARY: " + this.salary;
        cadena += "\n----------------------------";

        return cadena;
    }
}