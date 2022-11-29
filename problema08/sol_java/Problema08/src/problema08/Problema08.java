/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema08;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author darav
 */
public class Problema08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int metros;
        int contador = 1;
        double pies=0;
        double pulgadas=0;
        double yardas=0;
        int rep=1;
        String mensaje1 = "Metros\t\tYardas\t\tPulgadas\tPies\n ";

        System.out.println("Escriba una cantidad en metros");
        metros = entrada.nextInt();
        System.out.printf("%s",mensaje1);
        
        while (contador <= metros) {
            pulgadas = rep * 39.37;
            pies = rep * 3.28084;
            yardas = rep * 1.094;
            System.out.printf("%d\t\t%.3f\t\t%.3f\t\t%.3f\n", rep, yardas, pulgadas, pies);
            contador = contador + 1;
            
        
        rep = rep + 1;
        }
        
        
    }

  }