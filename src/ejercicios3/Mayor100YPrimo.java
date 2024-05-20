package ejercicios3;
import java.util.Scanner;


public class Mayor100YPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingresa un numero mayor que 100 y que sea primo: ");
            numero = scanner.nextInt();

            if (numero <= 100 || !esPrimo(numero)) {
            	System.err.println("El numero ingresado no cumple con las condiciones. Intente de nuevo.");
            }

        } while (numero <= 100 || !esPrimo(numero));

        System.out.println("El numero ingresado es: " + numero);
        System.out.println("Programa finalizado.");
        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}
