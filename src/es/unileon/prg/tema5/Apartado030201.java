package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a cadenas de caracteres.
 * La clase "String"
 *
 * @author PRG
 * @version 1.0
 */
    public class Apartado030201 extends Apartado {
   
       protected String obtenerPractica(){
         return "P-VAR";
      }
   
       protected String obtenerBloque() {
         return "Cadenas de caracteres - Clase <<String>>";
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio1.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Obtener el numero de caracteres de la cadena.
    *	Calcular la posicion intermedia de la cadena.
    *	Extraer el caracter que ocupa dicha posicion.
    *	Mostrar por pantalla dicho caracter y el codigo que lo representa.
    */
       public void ejercicio01() {
         cabecera("01","");
         String cadena = "En un lugar de la Mancha";
         int longitud = cadena.length();
         int posicionIntermedia = longitud / 2;
         char caracterIntermedio = cadena.charAt(posicionIntermedia);

         System.out.println("Número de caracteres: " + longitud);
         System.out.println("Posición intermedia: " + posicionIntermedia);
         System.out.println("Carácter en la posición intermedia: " + caracterIntermedio);
         System.out.println("Código que lo representa: " + (int) caracterIntermedio);
        // Inicio modificacion
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio2.
    *
    * </br>
    *
    *	Comparar las dos cadenas para ver si son iguales y mostrar por pantalla el resultado de la comparacion.
    * Volver a compararlas pero ahora sin tener en cuenta si estan en mayusculas o minusculas y mostrar por pantalla el resultado de la comparacion.
    *	Convertir las dos cadenas a minusculas, volver a compararlas y mostrar por pantalla el resultado de la comparacion.
    *
    */
       public void ejercicio02() {
         cabecera("02", "");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "ViAje al pArnaso";
      // Inicio modificacion
      System.out.println("¿Son iguales?: " + cadena.equals(otraCadena));
      System.out.println("¿Iguales (sin importar mayús/minús)?: " + cadena.equalsIgnoreCase(otraCadena));
      System.out.println("¿Iguales en minúsculas?: " + cadena.toLowerCase().equals(otraCadena.toLowerCase()));
      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio3.
    *
    * </br>
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Concatenar las dos cadenas formando una tercera usando el operador +
    * Concatenar las dos cadenas formando una tercera usando el metodo concat
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio03() {
         cabecera("03", "");
      
         String cadena = "Viaje al Parnaso";
         String otraCadena = "Persiles y Segismunda";
         String concatenacion1 = cadena + " " + otraCadena;
         String concatenacion2 = cadena.concat(" ").concat(otraCadena);
      // Inicio modificacion
          System.out.println("Concatenación usando '+': " + concatenacion1);
          System.out.println("Concatenación usando 'concat': " + concatenacion2);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio4.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Comprobar si la cadena termina con la palabra Parnaso utilizando endsWith.
    * Comprobar si la cadena empieza con la palabra Viaje utilizando startsWith.
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio04() {
         cabecera("04", "");
         String cadena = "Viaje al Parnaso";
        // Inicio modificacion
         boolean terminaConParnaso = cadena.endsWith("Parnaso");
          boolean empiezaConViaje = cadena.startsWith("Viaje");
    
          System.out.println("¿Termina con 'Parnaso'?: " + terminaConParnaso);
          System.out.println("¿Empieza con 'Viaje'?: " + empiezaConViaje);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio5.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes busquedas en cadena utilizando indexOf:
    * Buscar si el caracter p esta en la cadena y mostrar el resultado por pantalla.
    * Buscar si la cadena Par esta en la cadena y mostrar el resultado por pantalla.
    * Buscar la ultima ocurrencia de la letra a en la cadena y mostrar el resultado por pantalla.
    * Buscar la letra a empezando por la posicion 3 y mostrar el resultado por pantalla.
    */
       public void ejercicio05() {
         cabecera("05","");
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
      System.out.println("Posición del carácter 'p': " + cadena.indexOf('p'));
      System.out.println("Posición de la cadena 'Par': " + cadena.indexOf("Par"));
      System.out.println("Última ocurrencia de 'a': " + cadena.lastIndexOf('a'));
      System.out.println("Posición de 'a' desde la posición 3: " + cadena.indexOf('a', 3));
        // Fin modificacion  
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio6.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Reemplazar las ocurrencias de la letra a por * y mostrar el resultado por pantalla.
    * Reemplazar las ocurrencias de la palabra Parnaso por Olimpo y mostrar en resultado por pantalla
    */
       public void ejercicio06() {
         cabecera("06", "");
      
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
      String reemplazoLetra = cadena.replace('a', '*');
         String reemplazoPalabra = cadena.replace("Parnaso", "Olimpo");
   
         System.out.println("Reemplazo de 'a' por '*': " + reemplazoLetra);
         System.out.println("Reemplazo de 'Parnaso' por 'Olimpo': " + reemplazoPalabra);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio7.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Obtener la subcadena que va desde la mitad al final.
    * Obtener la subcadena que empieza en la primera j y termina antes de la primera s
    */
       public void ejercicio07() {
         cabecera("07", "");
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
      System.out.println("Subcadena desde la mitad: " + cadena.substring(cadena.length() / 2));
   System.out.println("Subcadena entre 'j' y 's': " + cadena.substring(cadena.indexOf('j'), cadena.indexOf('s')));
// Fin modificacion
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio8.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario quitar los espacios sobrantes al principio y al final.
    */
       public void ejercicio08() {
         cabecera("08", "");
         String cadena = " La Galatea   ";
      // Inicio modificacion
      System.out.println("Cadena sin espacios: '" + cadena.trim() + "'");
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio9.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario convertir las variables a String utilizando el metodo valueOf. Mostrar el resultado por pantalla.
    */
       public void ejercicio09() {
         cabecera("09", "");
         double numero = 1.12e12;
         boolean expresion = true;
         long enteroGrande = 1231231L;
      // Inicio modificacion
         String numeroStr = String.valueOf(numero);
         String expresionStr = String.valueOf(expresion);
         String enteroGrandeStr = String.valueOf(enteroGrande);

         System.out.println("Número como String: " + numeroStr);
         System.out.println("Expresión como String: " + expresionStr);
         System.out.println("Entero grande como String: " + enteroGrandeStr);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio10.
    *
    * </br>
    *
    * Se pide compara las dos cadenas lexicograficamente y mostrar el resultado por pantalla.
    */
       public void ejercicio10() {
         cabecera("10", "");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "Viaje al Olimpo";
      // Inicio modificacion
      System.out.println("Comparación lexicográfica: " + cadena.compareTo(otraCadena));
        // Fin modificacion
      }
   }
