/** 
 * Perro.java
 */
 
public class Perro extends Mamifero {
    
    private String raza;

    public Perro(String n, int e, String r, Sexo s) {
        super(n, e, s);
        raza = r;
    }

    public String toString() {
        return super.toString()
            + "Soy un perro de raza " + this.raza + ".\n";
    }

    /*
     * Hacer que el perro ladre
     */
    public void ladra() {
        System.out.println("Guau guau!");
    }

    /*
     * Hacer que le perro de la patita
     */
    public void darPata() {
        System.out.println("Toma mi patita.");
    }

    /*
     * Pone a pelear dos perros. Solo si ambos son MACHOS
     * @param contricante es el perro contra el que pelear
     */
    public void peleaCon(Perro contricante) {
        if(this.getSexo() == Sexo.HEMBRA) {
            System.out.println("Lo siento, no me gusta pelear.");
        } else {
            if(contricante.getSexo() == Sexo.HEMBRA) {
                System.out.println("No puedo, yo no peleo con perritas.");
            } else {
                System.out.println("Vamos, ven aqui que no vas a escapar de mi. >:( ");
            }
        }
    }
}
