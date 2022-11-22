package d_ciclosejercicio8;

import javax.swing.JOptionPane;

public class D_CiclosEjercicio8 {
    /*
    Pedir 10 números y mostar si existe alguno negativo
    */
    public static void main(String[] args) {
        boolean neg = false; int n, countN = 0;
        
        for (int i = 1; i <= 10; i++) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));
            
            if (n < 0) {
                neg = true;
                countN++;
            }
        }
        
        if (neg == true) {
            JOptionPane.showMessageDialog(null, "Existen " +countN + " números negativos" );
        }
        else{
            JOptionPane.showMessageDialog(null, "Existen números negativos");
        }  
    }  
}
