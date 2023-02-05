package Java.Ciclos.Ejercicio4;

import javax.swing.JOptionPane;

public class EjercicioCuatro {
    /*
     * Realizar un juego para adivinar un número. Para ello generar un número
     * aleatorio entre 0-100,
     * luego ir pidiendo números indicando "es mayor" o "es menor" con respecto a N.
     * El proceso termina cuando se acierta y mostrar el número de intentos.
     */
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100), us = 0, count = 0;
        System.out.println(n);
        do {
            us = Integer.parseInt(JOptionPane.showInputDialog("ADIVINA EL NÚMERO QUE ESTOY PENSANDO"
                    + "\n¿De qué número crees que se trate?"));
            count++;

            if (us < n) {
                JOptionPane.showMessageDialog(null, "Es un número mayor");
            } else if (us > n) {
                JOptionPane.showMessageDialog(null, "Es un número menor");
            }

        } while (n != us);

        JOptionPane.showMessageDialog(null, "CORRECTO " + "\nEl número es " + n + "\nTe tomó " + count + " intentos");
    }
}
