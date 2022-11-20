package d_ciclosejercicio1;

import javax.swing.JOptionPane;

public class D_CiclosEjercicio1 {
    /*
    Leer un número y mostrar su cuadro, repetir el proceso hasta
    que se introduzca un número negativo
    */
    public static void main(String[] args) {
        int n = 0;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        while (n >= 0) {            
            JOptionPane.showMessageDialog(null, "El cuadrado es: " + Math.pow(n, 2));
        }
    }
    
}
