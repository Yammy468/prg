
public class Pokemon {
    // Atributos
    private int id;
    private String nombre, tipo;
    private int ataque, defensa, vida, ataqueEspecial, defensaEspecial, velocidad;
    private String habilidad;
    boolean capturado;

    // Constructor
    public Pokemon (int id, String nombre, String tipo, int ataque, int defensa, int vida, int ataqueEspecial, int defensaEspecial, int velocidad, String habilidad, boolean capturado) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.habilidad = habilidad;
        this.capturado = capturado;
    }

    // Getters y Setters para cada atributo
    
    public int getId() { // id
        return this.id;
    }
    
    public String getNombre() { // nombre
        return this.nombre;
    }
    
    public String getTipo() { // tipo
        return this.tipo;
    }
    
    public int getAtaque() { // ataque
        return this.ataque;
    }
    
    public int getDefensa() { // defensa
        return this.defensa;
    }
    
    public int getVida() { // vida
        return this.vida;
    }
    
    public int getAtaqueEspecial() { // ataque especial
        return this.ataqueEspecial;
    }
    
    public int getDefensaEspecial() { // defensa especial
        return this.defensaEspecial;
    }
    
    public int getVelocidad() { // velocidad
        return this.velocidad;
    }
    
    public String getHabilidad() { // habilidad
        return this.habilidad;
    }
    
    public boolean getCapturado() { // capturado
        return this.capturado;
    }
    
    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }
    
    // Método toString()
    @Override
    public String toString() {
        String cadena = "\n---------------------------------";
               cadena += "\nID: " + this.id;
               cadena += "\nNombre: " + this.nombre;
               cadena += "\nTipo: " + this.tipo;
               cadena += "\nAtaque: " + this.ataque;
               cadena += "\nDefensa: " + this.defensa;
               cadena += "\nVida: " + this.vida;
               cadena += "\nAtaque Especial: " + this.ataqueEspecial;
               cadena += "\nDefensa Especial: " + this.defensaEspecial;
               cadena += "\nVelocidad: " + this.velocidad;
               cadena += "\nHabilidad: " + this.habilidad;
               cadena += "\nCapturado: " + this.capturado;
               cadena += "\n---------------------------------";

        return cadena;
    }
}
