/* 
 * Programa que prueba la clase Animal
 */
public class PruebaAnimal {
    public static void main(String agrs[]) {

        // Gato
        Gato blanca = new Gato("Blanca", 8, "persa", Sexo.HEMBRA);
        System.out.println(blanca);
        System.out.println(blanca.getNombre() + ", Dónde estas?");
        blanca.maulla();
        blanca.cuidaCrias();
        System.out.println("Awww, que responsable eres. *ACARICIAR*");
        blanca.ronronea();
        System.out.println("Vamos es hora de comer, hoy toca tus favoritos! PES-CA-DO!!!");
        blanca.come("pescado");
        System.out.println("Hmm?, parece que los gatitos tiene hambre.");
        blanca.amamanta();
        System.out.println("**************************************************\n");

        // Perro
        Perro azul = new Perro("Azul", 10, "husky", Sexo.MACHO);
        System.out.println(azul);
        System.out.println(azul.getNombre() + ", Dónde estas?");
        azul.duerme();
        System.out.println("Vamos lenvantate.");
        azul.bosteza();
        System.out.println("¿Quieres ir a dar un paseo?");
        azul.anda();
        System.out.println("Buen chico, dame tu patita.");
        azul.darPata();
        System.out.println("Vamos!");
        azul.ladra();
        System.out.println("**************************************************\n");

        // Lagarto
        Lagarto leon = new Lagarto("León", 12, Sexo.MACHO);
        System.out.println(leon);
        System.out.println(leon.getNombre() + ", Dónde estas?");
        leon.esconde();
        System.out.println("Oh vamos! Es hora de tu baño~.");
        leon.tomaChapuzon();
        System.out.println("Ya salte. El baño se ha terminado.");
        leon.tomaSol();
        System.out.println(leon.getNombre() + "~~ vam--");
        leon.esconde();
        System.out.println("····· 0-0 Es enserio!? Ahh, que voy a hacer contigo.");
        System.out.println("**************************************************\n");

        // Canario
        Canario brillito = new Canario("Brillito", 6, Sexo.MACHO);
        System.out.println(brillito);
        System.out.println(brillito.getNombre() + ", vamos tu puedes. *" + brillito.getNombre() + " INTENTA VOLAR*");
        brillito.vuela();
        System.out.println("Muy bien! Ahora ven aqui.");
        brillito.ven();
        System.out.println("Muy bien, ahora vamos a ver si tienes huevos.");
        brillito.poneHuevos();
        System.out.println("Ah, es cierto. Se me olvido, jeje.");
        brillito.pia();
        System.out.println("No pasa nada. Vamos a tu bañerita.");
        brillito.aseate();
        System.out.println("Ahora canta un poco, por favor.");
        brillito.canta();
        System.out.println("**************************************************\n");

        // Pinguino
        Pinguino rosa = new Pinguino("Rosa", 14, Sexo.HEMBRA);
        System.out.println(rosa);
        System.out.println(rosa.getNombre() + "~ ¿Dónde estas? *VE A " + rosa.getNombre() + " INTENTAR VOLAR*");
        rosa.vuela();
        System.out.println("Ven aqui. *ABRAZA* ya ya. Mira vamos a nadar!");
        rosa.nada();
        System.out.println("*VE QUE LOGRA CAZAR UN PESCADO*");
        rosa.caza();
        System.out.println("Ohh eres increible!! *SALE DEL AGUA*");
        rosa.aseate();
        System.out.println("Es hora de volver a casa. ··· Todavia no tienes un huevo. :( ");
        rosa.poneHuevos();
        System.out.println("0o0 ··· es eso posible!?!?");

    }
}
