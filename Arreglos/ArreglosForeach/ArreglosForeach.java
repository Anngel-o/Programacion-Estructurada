package Java.Arreglos.ArreglosForeach;

public class ArreglosForeach {
    public static void main(String[] args) {
        String[] nombres = { "Mariam", "Angel", "Saul", "Walter" };

        /*
         * for (int i = 0; i < nombres.length; i++) {
         * System.out.println(nombres[i]);
         * }
         */

        // Iterar a lo largo del arreglo
        for (String i : nombres) {
            System.out.println(i);
        }
    }
}


