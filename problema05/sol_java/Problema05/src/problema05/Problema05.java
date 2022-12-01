package problema05;

/**
 *
 * @author sofiv
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero1 = 5;
        double numero2 = -1;
        if (numero1 > 0 && numero2 > 0) {
            System.out.println("Es el cuadrante 1");
        }
        if (numero1 < 0 && numero2 > 0) {
            System.out.println("Es el cuadrante 2");
        }
        if (numero1 > 0 && numero2 < 0) {
            System.out.println("Es el cuadrante 3");
        }
        if (numero1 < 0 && numero2 < 0) {
            System.out.println("Es el cuadrante 4");
        }

    }

}
