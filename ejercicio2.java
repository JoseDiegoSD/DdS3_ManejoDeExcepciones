import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, introduce una secuencia de caracteres: ");
        String input = entrada.nextLine();

        try {
            char charEnPosicion7 = obtenerCaracter(input, 7);
            System.out.println("El carácter en la posición 7 es: " + charEnPosicion7);
        } catch (Exception e) {
            System.out.println("Has intentado acceder a una posición inexistente en la cadena.");
        }
    }

    public static char obtenerCaracter(String cadena, int posicion) throws Exception {
        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("La posición se encuentra fuera del rango de la cadena");
        }
    }
}
    /*
    II. Construye un programa “main” en Java que realice las siguientes acciones:

        Crea un objeto de la clase “Scanner” y lo asocia con la entrada estándar (la consola de MSDOS);

        Lee un objeto de tipo “String” de la misma en un objeto “lectTeclado”;

        Invoca al método “caracterEn” definido en el ejercicio anterior,
        con la “String” leída de la entrada estándar y el entero “7”, mostrándolo por pantalla;

        Captura la posible excepción, mostrando por pantalla un mensaje:
        “Has intentado recuperar una posición de la cadena de caracteres que no existe;”.

        */
