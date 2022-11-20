package d_ciclosejercicio2;

import javax.swing.JOptionPane;

public class D_CiclosEjercicio2 {
    /*
    Leer números hasta que se introduzca  un 0. 
    Para cada uno indicar si es par o impar.
    */
    public static void main(String[] args) {
        int n = 0;
 
        do {            
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            
            if (n % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Número par");
            }
            else {
                JOptionPane.showMessageDialog(null, "Número impar");
            }
        } while (n != 0);
        
    }
    
}
