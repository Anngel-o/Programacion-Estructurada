package arreglosllenar;

import javax.swing.JOptionPane;

public class ArreglosLlenar {

    public static void main(String[] args) {
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de elementos: "));
        
        char[] letras = new char[nElementos];
        
        for (int i = 0; i < nElementos; i++) {  
            letras[i] = JOptionPane.showInputDialog("Digita el caractér " + (i + 1)).charAt(0);
        }
        
        JOptionPane.showMessageDialog(null, "Los caracteres del arreglo son: ");
        for (int i = 0; i < nElementos; i++) {  
            JOptionPane.showMessageDialog(null, letras[i]);
        }
    }
    
}
