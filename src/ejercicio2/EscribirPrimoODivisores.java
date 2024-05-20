package ejercicio2;

public class EscribirPrimoODivisores {

	public static void main(String[] args) {
		for (int i = 50; i <= 100; i++) {
            boolean esPrimo = true;
            if (i <= 1) {
            	
                esPrimo = false;
                
            } else {
                for (int j = 2; j * j <= i; j++) {
                	
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                        
                    }
                }
            }

            if (esPrimo) {
            	
                System.out.println(i + " es primo");
                
            } else {
            	
                System.out.print(i + " no es primo, divisores: ");
                
                for (int j = 1; j * j <= i; j++) {
                	
                    if (i % j == 0) {
                    	
                        System.out.print(j + " ");
                        
                        if (i / j != j) {
                        	
                            System.out.print(i / j + " ");
                        }
                    }
                }
                
                System.out.println();
            }
        }
	}
    
}

