/**
 * Ave.java
 */
 
public class Ave extends Animal {
    
    public Ave(String n, int e, Sexo s) {
        super(n, e, s);
    }

    public String toString() {
        return super.toString();
    }

    /*
     * Hacer que las aves ponga huevos, solo las HEMBRAS
     */
    public void poneHuevos() {
        if(this.getSexo() == Sexo.MACHO) {
            System.out.println("Lo siento, yo no pongo huevos. Soy un MACHO.");
        } else {
            System.out.print("Tranquila, .. (> ~ <) .. *PLO*. ");
            System.out.println("Aqui tienes un huevo. Se puede ver pero no tocar. :) ");
        }
    }

    /*
     * Hacer que el ave se limpie
     */
    public void aseate() {
        System.out.println("Ahh. Que limpia y refrescante estoy! >u< ");
    }

    /*
     * Hacer que el ave vuele
     */
    public void vuela() {
        System.out.println("Mirad, estoy volando!!!");
    }
}
