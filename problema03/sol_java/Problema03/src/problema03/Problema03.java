package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author sofiv
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        int tipoEmpleado;
        double horasTrabajadas;
        double horasExtras = 0;
        double valorHora;
        double sueldo;
        System.out.println(" Ingrese el nombre del empleado");
        nombre = entrada.nextLine();
        System.out.println(" Ingrese el tipo de empleado");
        tipoEmpleado = entrada.nextInt();
        System.out.println(" Ingrese el número de horas trabajadas por el empleado");
        horasTrabajadas = entrada.nextDouble();
        System.out.println("Ingrese el valor de la hora del empleado");
        valorHora = entrada.nextDouble();
        sueldo = horasTrabajadas * valorHora;
        while (horasTrabajadas > 40) {
            if (tipoEmpleado == 1) {
                valorHora = valorHora * 1.5;
                horasTrabajadas = horasTrabajadas - 40;
                horasExtras = horasTrabajadas * valorHora;
            }
            if (tipoEmpleado == 2) {
                valorHora = valorHora * 2;
                horasTrabajadas = horasTrabajadas - 40;
                horasExtras = horasTrabajadas * valorHora;
            }
            if (tipoEmpleado == 3) {
                valorHora = valorHora * 2.5;
                horasTrabajadas = horasTrabajadas - 40;
                horasExtras = horasTrabajadas * valorHora;
            }
            if (tipoEmpleado == 4) {
                valorHora = valorHora * 3;
                horasTrabajadas = horasTrabajadas - 40;
                horasExtras = horasTrabajadas * valorHora;
            }
        }
        sueldo = sueldo + horasExtras;
        System.out.printf(" El sueldo a pagar es: %.2f", sueldo);

    }

}
