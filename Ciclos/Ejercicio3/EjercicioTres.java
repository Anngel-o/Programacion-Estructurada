package Java.Ciclos.Ejercicio3;

import javax.swing.JOptionPane;

public class EjercicioTres {
    /*
     * Pedir números hasta que se teclee uno negativo.
     * Mostrar cuántos números se han introducido.
     */
    public static void main(String[] args) {
        int n = 0, count = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
            count++;
        } while (n >= 0);

        JOptionPane.showMessageDialog(null, "Introdujo un total de " + count + " números");
    }
}
