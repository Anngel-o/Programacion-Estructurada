package Java.Condicionales.Ejercicio1;

import javax.swing.JOptionPane;

public class EjercicioUno {
    /*
     * Hacer un programa que lea un número entero
     * y muestre si es múltiplo de 10
     */
    public static void main(String[] args) {
        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if (n % 10 == 0) {
            JOptionPane.showMessageDialog(null, "Es multiplo de 10");
        } else {
            JOptionPane.showMessageDialog(null, "No es multiplo de 10");
        }
    }
}
