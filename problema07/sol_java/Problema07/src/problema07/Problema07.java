package problema07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author sofiv
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero;
        int par = 2;
        int suma = 0;
        boolean auxiliar = true;
        System.out.println("Ingresar un número par ");
        numero = entrada.nextInt();

        if (numero % 2 == 0 && numero > 2) {
            do {
               
                if (numero == par) {
                    auxiliar = false;
                }
                 suma = suma + par;
                par = par + 2;
            } while (auxiliar);
        } else {
            System.out.println("Escribir un número mayor a dos o par");
        }
        System.out.println("La suma de los numeros es: " + suma);

    }

}
