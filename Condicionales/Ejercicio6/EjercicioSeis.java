package Java.Condicionales.Ejercicio6;

import javax.swing.JOptionPane;

public class EjercicioSeis {
    /*
     * Solicitar 3 números y mostrarlos de mayor a menor
     */
    public static void main(String[] args) {
        int a, b, c;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite un último número: "));

        if (a > b && b > c) {
            JOptionPane.showMessageDialog(null, "Orden: " + a + "-" + b + "-" + c);
        } else if (a > c && c > b) {
            JOptionPane.showMessageDialog(null, "Orden: " + a + "-" + c + "-" + b);
        } else if (b > a && a > c) {
            JOptionPane.showMessageDialog(null, "Orden: " + b + "-" + a + "-" + c);
        } else if (b > c && c > a) {
            JOptionPane.showMessageDialog(null, "Orden: " + b + "-" + c + "-" + a);
        } else if (c > a && a > b) {
            JOptionPane.showMessageDialog(null, "Orden: " + c + "-" + a + "-" + b);
        } else if (c > b && b > a) {
            JOptionPane.showMessageDialog(null, "Orden: " + c + "-" + b + "-" + a);
        }
    }
}
