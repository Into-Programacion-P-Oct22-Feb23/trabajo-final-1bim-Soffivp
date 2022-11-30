package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author sofiv
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Elaborar un programa que permita leer 3 números e imprima el mayor. Debe validar que sean diferentes, 
        es decir, si hay números iguales debe enviar un mensaje de error.*/
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero1;
        int numero2;
        int numero3;
        System.out.println("Ingrese un numero");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese un numero");
        numero2 = entrada.nextInt();
        System.out.println("Ingrese un numero");
        numero3 = entrada.nextInt();
        if (numero1 == numero2 || numero1 == numero3 || numero3 == numero2) {
            System.out.println("Los numeros ingresados son iguales");
        }else 
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El número mayor es: " + numero1);
        }else
        if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El número mayor es: " + numero2);
        }else
        if (numero3 > numero2 && numero3 > numero1) {
            System.out.println("El número mayor es: " + numero3);
        }

    }

}
