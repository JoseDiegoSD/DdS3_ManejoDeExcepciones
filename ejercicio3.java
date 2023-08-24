import java.util.Scanner;
class NumeroNegativoExcepcion extends Exception {
    public NumeroNegativoExcepcion() {
        super("Se ha ingresado un número negativo");
    }
    public NumeroNegativoExcepcion(String mensaje) {
        super(mensaje);
    }
}

public class ejercicio3 {
    public static void main(String[] args) {

        try {
            double valor = pedirValor();
            if (valor >= 0) {
                double raizCuadrada = Math.sqrt(valor);
                System.out.println("La raíz cuadrada de " + valor + " es: " + raizCuadrada);
            } else {
                throw new NumeroNegativoExcepcion();
            }
        } catch (NumeroNegativoExcepcion e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin main
    public static double pedirValor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un valor que sea numérico: ");
        return scanner.nextDouble();
    }
}

/*
III. Define una clase “NumeroNegativoExcepcion” que herede de “Exception” y que contenga
un constructor sin parámetros y un constructor que reciba como parámetro una “String”,
de tal modo que ambos invoquen a los constructores de la clase “Exception” correspondientes.

Construye un programa con método main para probar la excepción.

Solicitar al usuario un valor numérico, si el valor es positivo calcular e imprimir
de la raíz cuadrada.  Si es negativo, lanzar la excepción "NumeroNegativoExcepcion”.

*/