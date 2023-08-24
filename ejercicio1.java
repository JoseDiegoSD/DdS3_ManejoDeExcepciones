public class ejercicio1{
    public static char obtenerChar(String str, int index) throws Exception {

        int longitud = str.length();

        if (index >= 0 && index < longitud) {
            return str.charAt(index);
        } else {
            throw new Exception("Índice fuera del rango válido en la cadena.");
        }
    }//fin obtenerChar

    public static void main(String[] args) {

        String miCadena = "QueVivaCristoRey";
        int miPosicion = 7;

        //Intenta y atrapa
        try {
            char resultado = obtenerChar(miCadena, miPosicion);
            System.out.println("El carácter en la posición " + miPosicion + " es: " + resultado);
        } catch (Exception e) {
            System.out.println("Ocurrió un problema: " + e.getMessage());
        }

    }//fin main
}

  /*  I. Escribe un método auxiliar de nombre “caracterEn” en Java que realice la siguiente acción:

        //Recibe como parámetros una cadena (String) y un entero (int);

        /*Si el entero está entre 0 y la longitud de la cadena (puedes hacer uso del método
        “length(): int” de la clase “String”) devuelve el carácter en la posición correspondiente
        (puedes hacer uso del método “charAt(int)” de la clase “String”).

        En caso contrario, construye y lanza una excepción de tipo “Exception”.
  */