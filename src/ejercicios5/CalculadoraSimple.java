package ejercicios5;

import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simple");
        
        int opcion;

        do {
        	
        	System.out.print(" Ingrese el primer numero: ");
            double numero1 = scanner.nextDouble();

            System.out.print(" Ingrese el segundo numero: ");
            double numero2 = scanner.nextDouble();
            
        	System.out.println("\nSeleccione la operacion:");
            System.out.println(" 1. Suma");
            System.out.println(" 2. Resta");
            System.out.println(" 3. Multiplicacion");
            System.out.println(" 4. Division");
            System.out.println(" 5. Salir");
            System.out.print("\nOpcion: ");
            opcion = scanner.nextInt();

            double resultado = 0;

            switch (opcion) {
                case 1:
                    resultado = suma(numero1, numero2);
                    break;
                case 2:
                    resultado = resta(numero1, numero2);
                    break;
                case 3:
                    resultado = multiplicacion(numero1, numero2);
                    break;
                case 4:
                    resultado = division(numero1, numero2);
                    break;
                case 5:
                	System.out.println("Saliendo del programa . . .");
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

            if (opcion >= 1 && opcion <= 4) {
                if (!Double.isNaN(resultado)) {
                    System.out.println("El resultado es: " + resultado + "\n");
                } else {
                	System.err.println("No se puede realizar la división. Intente de nuevo. \n");
                }
            }
        } while (opcion != 5);
        
        scanner.close();
        
}

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0 || a < b) {
            return Double.NaN; 
        } else {
            return a / b;
        }
    }

}
