public class S01Ejerccicio05 { 
  public static void main(String[] args) {
    
    String BDA = "\033[31m";
    String ING = "\033[32m";
    String FOL = "\033[33m";
    String EDS = "\033[34m";
    String PRG = "\033[35m";
    String LMS = "\033[36m";
    String SIN = "\033[37m";
    
    System.out.println("Lunes" + "\t" + "Martes" + "\t" + "Miércoles" + "\t" + "Jueves" + "\t"+ "Viernes");
    System.out.println(BDA + "BDA" + "\t" + EDS + "EDS" + "\t" + PRG + "PRG" + "\t" + "\t" + EDS + "EDS" + "\t"+ BDA + "BDA");
    System.out.println(BDA + "BDA" + "\t" + EDS + "EDS" + "\t" + PRG + "PRG" + "\t" + "\t" + PRG + "PRG" + "\t"+ BDA + "BDA");
    System.out.println(ING + "ING" + "\t" + PRG + "PRG" + "\t" + PRG + "PRG" + "\t" + "\t" + PRG + "PRG" + "\t"+ SIN + "SIN");
    System.out.println(FOL + "FOL" + "\t" + PRG + "PRG" + "\t" + ING + "ING" + "\t" + "\t" + PRG + "PRG" + "\t"+ SIN + "SIN");
    System.out.println(FOL + "FOL" + "\t" + LMS + "LMS" + "\t" + SIN + "SIN" + "\t" + "\t" + SIN + "SIN" + "\t"+ LMS + "LMS");
    System.out.println(FOL + "FOL" + "\t" + LMS + "LMS" + "\t" + SIN + "SIN" + "\t" + "\t" + SIN + "SIN" + "\t"+ LMS + "LMS");
    
  }
}
