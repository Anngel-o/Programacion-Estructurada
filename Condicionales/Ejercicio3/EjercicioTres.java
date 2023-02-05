package Java.Condicionales.Ejercicio3;

import javax.swing.JOptionPane;

public class EjercicioTres {
    /*
     * Hacer un programa que lea un carácter y compruebe si es mayúscula
     */
    public static void main(String[] args) {
        char c;

        c = JOptionPane.showInputDialog("Digita un carácter: ").charAt(0);

        // comprueba si el carácter es una letra mayúscula
        if (Character.isUpperCase(c)) {
            JOptionPane.showMessageDialog(null, "ES MAYÚSCULA");
        }
        // comprueba si el carácter es una letra minúscula
        else if (Character.isLowerCase(c)) {
            JOptionPane.showMessageDialog(null, "Es minúscula");
        } else {
            JOptionPane.showMessageDialog(null, "No es un carácter");
        }
    }
}
