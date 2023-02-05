package Java.Intro.DatosJOptionPane;

import javax.swing.JOptionPane;

public class DatosJOptionPane {
    public static void main(String[] args) {
        String cad;
        int entero;
        char caracter;
        double doble;

        // JOption devuelve string, se necesita convertir
        cad = JOptionPane.showInputDialog("Digita una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digita una cadena: "));
        caracter = JOptionPane.showInputDialog("Digita una cadena: ").charAt(0);
        doble = Double.parseDouble(JOptionPane.showInputDialog("Digita una cadena: "));

        JOptionPane.showMessageDialog(null, "La cadena es: " + cad);
    }
}
