package Java.Condicionales.Condicionales;

import javax.swing.JOptionPane;

public class Condicionales {
    public static void main(String[] args) {
        int n, m;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digita tu edad: "));

        if (n <= 17) {
            System.out.println("Eres menor de edad");
        } else if (n >= 18 && n <= 150) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("No creo tu edad");
        }

        m = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));

        switch (m) {
            case 1:
                JOptionPane.showMessageDialog(null, "Numero 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Numero 2");
                break;
            default:
                throw new AssertionError();
        }
    }
}
