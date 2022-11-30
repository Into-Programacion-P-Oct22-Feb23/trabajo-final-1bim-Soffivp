package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author sofiv
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int cantidad;
        double precio;
        double subtotal;
        double total = 0;
        double descuento = 0;
        System.out.println("Ingrese la cantidad de trajes comprados: ");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese la el precio del traje comprado: ");
        precio = entrada.nextDouble();
        subtotal = precio * cantidad;
        if (cantidad == 1) {
            descuento = subtotal * 0.2;
            total = subtotal - descuento;
        }
        if (cantidad == 2) {
             descuento = subtotal * 0.25;
             total = subtotal - descuento;
        }
        if (cantidad == 3) {
                descuento = subtotal * 0.4;
        total = subtotal - descuento;
        }
        if (cantidad > 3) {
            descuento = subtotal * 0.5;
        total = subtotal - descuento;
        }
        System.out.println("El subtotal de la venta es :" + subtotal );
        System.out.println("El descuento es: " + descuento);
        System.out.println("El precio total es: " + total);
    }

}
