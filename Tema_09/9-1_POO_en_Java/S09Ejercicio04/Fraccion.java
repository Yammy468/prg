/**
 * Fraccion.java
 */

public class Fraccion {

    // Atributos
    private int signo;
    private int numerador;
    private int denominador;

    public Fraccion(int n, int d) {
        if(d == 0) {
            System.out.println("Lo siento, el denominador nunca puede ser 0.");
        } else {
            if(n * d < 0) {
                this.signo = -1;
            } else {
                this.signo = 1;
            }
        }
        this.numerador = Math.abs(n);
        this.denominador = Math.abs(d);
    }

    // getter
    public int getNumerador() {
        return this.numerador;
    }
    public int getDenominador() {
        return this.denominador;
    }

    public String toString() {
        if(signo == -1) {
            return "-" + this.numerador + "/" + this.denominador;
        } else {
            return this.numerador + "/" + this.denominador;
        }
    }

    // Métodos

    /*
     * Hacer que la fracción se invierta o viceversa
     */
    public Fraccion invierte() {
        return new Fraccion(this.signo * this.denominador, this.numerador);
    }

    /*
     * Multiplicar la fraccion por un numero
     * 
     * @param k un numero por el que se multiplica la fraccion
     */
    public Fraccion multiplicaNumero(int k) {
        return new Fraccion(this.signo * this.numerador * k, this.denominador);
    }

    /*
     * Multiplicar la fraccion con otra fraccion
     * 
     * @param f nueva fracion que se multiplica con la fraccion anterior
     */
    public Fraccion multiplicaFraccion(Fraccion f) {
        return new Fraccion(this.signo * this.numerador * f.getNumerador(), 
                            this.denominador * f.getDenominador());
    }

    /*
     * Dividir la fraccion por un numero
     * 
     * @param k un numero por el que se divide la fraccion
     */
    public Fraccion divideNumero(int k) {
        return new Fraccion(this.signo * this.numerador, this.denominador * k);
    }

    /*
     * Dividir la fraccion con otra fraccion
     * 
     * @param f nueva fracion que se divide con la fraccion anterior
     */
    public Fraccion divideFraccion(Fraccion f) {
        return new Fraccion(this.signo * this.numerador * f.getDenominador(),
                            this.denominador * f.getNumerador());
    }

    /* 
     * Simplificar la fraccion
     */
    public Fraccion simplifica() {

        final int s = this.signo;
        int n = this.numerador;
        int d = this.denominador;
      
        for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
            while (((n % i) == 0) && ((d % i) == 0)) {
                n /= i;
                d /= i;
            }
        }

        return new Fraccion(s * n, d);
    }
 }
