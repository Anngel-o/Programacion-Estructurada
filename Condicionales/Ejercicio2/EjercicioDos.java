package Java.Condicionales.Ejercicio2;

import javax.swing.JOptionPane;

public class EjercicioDos {
    /*
     * Pedir dos números y decir cuál es mayor o si son iguales
     */
    public static void main(String[] args) {
        int n, m;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
        m = Integer.parseInt(JOptionPane.showInputDialog("Digita otro numero: "));

        if (n == m) {
            JOptionPane.showMessageDialog(null, "Son numeros iguales");
        } else if (n > m) {
            JOptionPane.showMessageDialog(null, n + " es mayor que " + m);
        } else {
            JOptionPane.showMessageDialog(null, m + " es mayor que " + n);
        }
    }
}
