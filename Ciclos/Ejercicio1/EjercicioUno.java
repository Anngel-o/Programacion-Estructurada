package Java.Ciclos.Ejercicio1;

import javax.swing.JOptionPane;

public class EjercicioUno {
    public static void main(String[] args) {
        /*
         * Leer un número y mostrar su cuadro, repetir el proceso hasta
         * que se introduzca un número negativo
         */
        int n = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        while (n >= 0) {
            JOptionPane.showMessageDialog(null, "El cuadrado es: " + Math.pow(n, 2));
        }
    }
}
