/**
 * Disco.java
 */

public class Discos {

    private String codigo = "VACIO";
    private String titulo;
    private String autor;
    private String genero;
    private int duracion; // en minutos

    public Discos(String c, String t, String a, String g, int d) {
        this.codigo = c;
        this.titulo = t;
        this.autor = a;
        this.genero = g;
        this.duracion = d;
    }

    public Discos() {}

    public String getCodigo() {
        return this.codigo; // espacio vacio donde no hay discos
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return this.genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return this.duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String toString() {
        String cadena = "\n------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.titulo;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion;
        cadena += "\n------------------------------------------";
        
        return cadena;
    }
}
