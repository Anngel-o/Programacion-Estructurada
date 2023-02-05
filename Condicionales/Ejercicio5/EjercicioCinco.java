package Java.Condicionales.Ejercicio5;

import javax.swing.JOptionPane;

public class EjercicioCinco {
    /*
     * Un obrero necesita calcular su salario semanal, el cual se obtiene:
     * -> si trabaja 40 horas o menos se le paga $16 por hora
     * -> si trabaja más de 40 horas se le paga $16 por cada una de las primeras
     * 40 horas y $20 por hora extra
     */
    public static void main(String[] args) {
        int horas, pago;

        JOptionPane.showMessageDialog(null, "Calculador de salario");
        horas = Integer.parseInt(JOptionPane.showInputDialog("Cuántas horas trabajó? "));

        if (horas <= 40) {
            pago = horas * 16;
            JOptionPane.showMessageDialog(null, "El pago es " + pago);
        } else if (horas > 40) {
            pago = (40 * 16) + ((horas - 40) * 20);
            JOptionPane.showMessageDialog(null, "El pago es " + pago);
        }
    }
}
