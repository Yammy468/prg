/**
 * Articulos.java
 */

public class Articulos {
    private String codigo = "VACIO";
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock; // numeros de unidades

    public Articulos(String c, String d, double pC, double pV, int s) {
        this.codigo = c;
        this.descripcion = d;
        this.precioCompra = pC;
        this.precioVenta = pV;
        this.stock = s;
    }

    public Articulos() {}

    public String getCodigo() {
        return this.codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return this.precioCompra;
    }
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return this.precioVenta;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return this.stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public String toString() {
        String cadena = "\n------------------------------------------";
        cadena += "\nCÓDIGO: " + this.codigo;
        cadena += "\nDESCRIPCIÓN: " + this.descripcion;
        cadena += "\nPRECIO COMPRA: " + this.precioCompra;
        cadena += "\nPRECIO VENTA: " + this.precioVenta;
        cadena += "\nSTOCK: " + this.stock + " unidades";
        cadena += "\n------------------------------------------";

        return cadena;
    }
}