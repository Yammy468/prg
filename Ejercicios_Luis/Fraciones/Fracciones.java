/* Fracciones.java */

public class Fracciones {
    private int numerador;
    private int denominador;
    private int signo;

    public Fracciones(int n, int d) {

        this.numerador = Math.abs(n);
        this.denominador = Math.abs(d);

        if(d == 0) {
            System.out.println("Lo siento, el denominador nunca puede ser 0.");
        } else {
            if(n * d > 0) {
                this.signo = 1;
            } else {
                this.signo = -1;
            }
        }
    }

    public Fracciones(int entero) {
        this.numerador = entero;
        this.denominador = 1;
    }

    public Fracciones(double decimal) {
    
        this.numerador = (int)(decimal * 10);
        this.denominador = 1 * 10;
    }

    /* getter y setter */

    public int getNumerador() { // numerador
        return this.numerador;
    }
    public void setNumerador(int num) {
        this.numerador = num;
    }

    public int getDenominador() { // denominador
        return this.denominador;
    }
    public void setDenominador(int denom) {
        this.denominador = denom;

        if(denom == 0) {
            System.out.println("Lo siento, el denominador nunca puede ser 0.");
        }
    } 

    public int getSigno() {
        return this.signo;
    }

    /* metodo privado */
    private static int maximoComunDivisor(int a, int b) {
        int aux; // para no perder b
        while(b != 0) {
            aux = b;
            b = a % b;
            a = aux;
        }
        return a;
    }

    private static int minimoComunMultiplo(int a, int b) {
        // mcm(a, b) = (a * b) / mcd(a, b)
        return (a * b) / maximoComunDivisor(a, b);
    }

    /* metodo */

    public String toString() {
        if(signo == -1) {
            return "-" + this.numerador + "/" + this.denominador;
        } else {
            return this.numerador + "/" + this.denominador;
        }
    }

    /*
     * Hacer que la fracción se invierta o viceversa
     */
    public Fracciones invierte() {
        return new Fracciones(this.signo * this.denominador, this.numerador);
    }

    /* metodo (OPERADORES) */

    /*
     * Hacer que la fracción sea negativa o viceversa
     */
    public Fracciones negate() {
        return new Fracciones((-1) * this.signo * this.numerador, this.denominador);
    }

    /*
     * Sumar la fraccion con otra fraccion
     * 
     * @param f nueva fracion que se suma con la fraccion anterior
     */
    public Fracciones add(Fracciones f) {
        // Buscar el mcm de las dos fracciones
        int a = this.denominador;
        int b = f.getDenominador();
        int mcm = minimoComunMultiplo(a, b);

        // cambiar los numeradores
        int n1 = (this.signo * (mcm / this.denominador * this.numerador));
        int n2 = (f.getSigno() * (mcm / f.getDenominador() * f.getNumerador()));

        return new Fracciones((n1 + n2), mcm);
    }

    /*
     * Restar la fraccion con otra fraccion
     * 
     * @param f nueva fracion que se resta con la fraccion anterior
     */
    public Fracciones substract(Fracciones f) {
        // Buscar el mcm de las dos fracciones
        int a = this.denominador;
        int b = f.getDenominador();
        int mcm = minimoComunMultiplo(a, b);

        // cambiar los numeradores
        int n1 = (this.signo * (mcm / this.denominador * this.numerador));
        int n2 = (f.getSigno() * (mcm / f.getDenominador() * f.getNumerador()));

        return new Fracciones((n1 - n2), mcm);
    }

    /*
     * Multiplicar la fraccion con otra fraccion
     * 
     * @param f nueva fracion que se multiplica con la fraccion anterior
     */
    public Fracciones multiply(Fracciones f) {
        return new Fracciones(this.signo * this.numerador * f.getNumerador(), 
                            this.denominador * f.getDenominador());
    }

    /*
     * Dividir la fraccion con otra fraccion
     * 
     * @param f nueva fracion que se divide con la fraccion anterior
     */
    public Fracciones divide(Fracciones f) {
        return new Fracciones(this.signo * this.numerador * f.getDenominador(), this.denominador * f.getNumerador());
    }

    /*
     * <true> si el valor de nuestra fracción y
     * la que le pasamos por parámetro es el mismo
     * 
     * @param f nueva fracion 
     */
    public boolean equals(Fracciones f) {
        if((this.signo * (this.numerador % this.denominador)) == (f.getSigno() * (f.getNumerador() % f.getDenominador()))) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Compara la fraccion con otra fraccion
     * 
     * @param f nueva fracion que se compara con la fraccion anterior
     */
    public int compareTo(Fracciones f) {
        if((this.signo * (this.numerador % this.denominador)) < (f.getSigno() * (f.getNumerador() % f.getDenominador()))) {
            return -1;
        } else if((this.signo * (this.numerador % this.denominador)) > (f.getSigno() * (f.getNumerador() % f.getDenominador()))) {
            return 1;
        } else if((this.signo * (this.numerador % this.denominador)) == (f.getSigno() * (f.getNumerador() % f.getDenominador()))) {
            return 0;
        }
        return denominador;
    }
}
