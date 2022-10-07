import java.util.Scanner;

public class S04Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO DE 1º DAW");
    
    System.out.println("1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?");
    System.out.println("a) int \nb) double \nc) float"); 
    System.out.print("=> ");
    respuesta = s.next();
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }

    System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos");
    System.out.println("a) XML \nb) SELECT \nc) SQL"); 
    System.out.print("=> ");
    respuesta = s.next();  
    if (respuesta.equals("c")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }

    System.out.println("3. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
    System.out.println("a) href \nb) a \nc) link"); 
    System.out.print("=> ");
    respuesta = s.next();
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }
    
    System.out.println("4. ¿En qué directorio se encuentran los archivos de configuración de Linux?");
    System.out.println("a) /etc \nb) /config \nc) /cfg"); 
    System.out.print("=> ");
    respuesta = s.next();
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }
    
    System.out.println("5. ¿Cuál de las siguientes memorias es volátil?");
    System.out.println("a) RAM \nb) EPROM \nc) ROM"); 
    System.out.print("=> ");
    respuesta = s.next();
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }
    
    System.out.println("6. El lenguaje ensamblador es un lenguaje informático de ... ");
    System.out.println("a) alto nivel \nb) nivel medio \nc) bajo nivel");
    System.out.print("=> ");
    respuesta = s.next();
    if (respuesta.equals("c")) {
		puntos++;
		System.out.println("Correcto");
	} else {
		System.out.println("Incorrecto");
	}
	
	System.out.println("7. ¿Cuál de los siguientes se considera una familia de sistema operativo?");
    System.out.println("a) Windows NT \nb) Ubuntu \nc) macOS");
    System.out.print("=> ");
    respuesta = s.next();
    if (respuesta.equals("a")) {
		puntos++;
		System.out.println("Correcto");
	} else {
		System.out.println("Incorrecto");
	}
	
	System.out.println("8. ¿Cuál de los siguientes sistemas operativos tiene más participación en el mercado?");
    System.out.println("a) Ubuntu GNU/Linux \nb) Microsoft Windows \nc) Ambos tiene una participación");
    System.out.print("=> ");
    respuesta = s.next();
    if (respuesta.equals("b")) {
		puntos++;
		System.out.println("Correcto");
	} else {
		System.out.println("Incorrecto");
	}
	
	System.out.println("9. La unidad mínima de información en informática es: ");
    System.out.println("a) Bit \nb) Gigabyte \nc) Byte");
    System.out.print("=> ");
    respuesta = s.next();
    if (respuesta.equals("a")) {
		puntos++;
		System.out.println("Correcto");
	} else {
		System.out.println("Incorrecto");
	}
	
	System.out.println("10. La incorporación de multimedia en la informática se produjo en generación: ");
    System.out.println("a) Tercera \nb) Segunda \nc) Cuarta");
    System.out.print("=> ");
    respuesta = s.next();
    if (respuesta.equals("c")) {
		puntos++;
		System.out.println("Correcto");
	} else {
		System.out.println("Incorrecto");
	}

    System.out.println("\nHa obtenido " + puntos + " puntos.");
  
  }
  
}

