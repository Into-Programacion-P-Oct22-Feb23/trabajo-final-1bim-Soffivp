package problema09;

/**
 *
 * @author sofiv
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        int numero1 = 12;
        int numero2 = 11;
        boolean auxiliar = true;
        String serie = "";
        do {
            if (contador == 1000) {
                auxiliar = false;
            }
            serie = serie + numero1 + "-" + numero2 + "+";
            numero1 = numero1 + 12;
            numero2 = numero2 + 11;
            contador = contador + 1;
        } while (auxiliar);
        System.out.println(serie);
    }

}
