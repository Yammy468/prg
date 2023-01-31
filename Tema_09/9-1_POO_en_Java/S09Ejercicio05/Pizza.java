/**
 * Pizza.java
 */

public class Pizza {

    // Atributos de clases
    private static int totalPedidas = 0;
    private static int totalServidas = 0;
    
    // Atributos
    private String tamaño;
    private String tipo;
    private String estado;
    
    // Métodos
    
    // Constructor
    public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.estado = "pedida";
        Pizza.totalPedidas ++;
    }
    
    // Getter
    public static int getTotalPedidas() {
        return Pizza.totalPedidas;
    }
    public static int getTotalServidas() {
        return Pizza.totalServidas;
    }
    
    public String toString() {
        return "pizza " + this.tipo + " "  + this.tamaño + ", " + this.estado;
    }
    
    /* 
     * Hacer que se sirva la pizza "pedida", como resultado se cambia de estado a "servida".
     * Pero si se quiere volver a servir la misma pizza otra vez, se mostrará un mensaje "esa pizza ya se ha servido"
     */ 
    public void sirve() {
        if(this.estado.equals("pedida")) {
            this.estado = "servida";
            Pizza.totalServidas ++;
        } else {
            System.out.println("esa pizza ya se ha servido");
        }
    }
    
}
    
