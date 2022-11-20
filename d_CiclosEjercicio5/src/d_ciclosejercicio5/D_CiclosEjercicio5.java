package d_ciclosejercicio5;

import javax.swing.JOptionPane;
/*
Pedir 10 números. Mostrar la media de los números positivos, la media de los
números negativos y la cantidad de ceros.
*/
public class D_CiclosEjercicio5 {

    public static void main(String[] args) {
        int n, countCero = 0, mediaP = 0, mediaN = 0;

        for (int i = 1; i <= 10; i++) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
            if (n > 0) {
                mediaP += n;
            }
            else if (n < 0) {
                mediaN += n;
            }
            else if (n == 0) {
                countCero++;   
            }
        }
        JOptionPane.showMessageDialog(null, "La media positiva es " + mediaP);
        JOptionPane.showMessageDialog(null, "La media negativa es " + mediaN);
        JOptionPane.showMessageDialog(null, "La cantidad de ceros es " + countCero);
    }
    
}

