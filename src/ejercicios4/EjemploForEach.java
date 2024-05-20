package ejercicios4;

public class EjemploForEach {

    public static void main(String[] args) {
    	
    	
        String[] marcas = {"toyota", "honda", "ford", "chevrolet", "ferrari"}; // Se crea un array de marcas de autos.

        
        // Usando forEach.
        System.out.println("Marcas de autos:");
        for (String marca : marcas) {
            System.out.println(marca); // Se imprime cada marca.
        }

        // Usando forEach.
        System.out.println("\nMarcas de autos en mayusculas:");
        for (String marca : marcas) {
            String marcaEnMayusculas = marca.toUpperCase(); // Se convierte la marca a mayuscula y se guarda en marcaMayusculas.
            System.out.println(marcaEnMayusculas); // Se imprime la marca en mayuscula.
        }
    }
}
