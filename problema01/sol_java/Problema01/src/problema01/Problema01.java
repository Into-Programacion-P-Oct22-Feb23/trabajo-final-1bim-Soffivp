package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author sofiv
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double angulo1;
        double angulo2;
        double angulo3;
        String tipo = "";
        System.out.println("Ingresar el primer ángulo");
        angulo1 = entrada.nextDouble();
        System.out.println("Ingresar el segundo ángulo");
        angulo2 = entrada.nextDouble();
        System.out.println("Ingresar el tercer ángulo");
        angulo3 = entrada.nextDouble();
        if (angulo1 == 90) {
            tipo = tipo + "Primer ángulo: Recto,";
        } else if (angulo1 < 90) {
            tipo = tipo + "Primer ángulo: Acutángulo,";
        } else if (angulo1 > 90 && angulo1 < 180) {
            tipo = tipo + "Primer ángulo: Obtusángulo,";
        }
        if (angulo2 == 90) {
            tipo = tipo + "Segundo ángulo: Recto,";
        } else if (angulo2 < 90) {
            tipo = tipo + "Segundo ángulo: Acutángulo,";
        } else if (angulo2 > 90 && angulo2 < 180) {
            tipo = tipo + "Segundo ángulo: Obtusángulo,";
        }
        if (angulo3 == 90) {
            tipo = tipo + "Tercer ángulo: Recto,";
        } else if (angulo3 < 90) {
            tipo = tipo + "Tercer ángulo: Acutángulo,";
        } else if (angulo3 > 90 && angulo3 < 180) {
            tipo = tipo + "Tercer ángulo: Obtusángulo,";
        }
        System.out.println(tipo);

    }

}
