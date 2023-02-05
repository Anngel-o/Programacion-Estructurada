package Java.Arreglos.Ejercicio1;
import javax.swing.JOptionPane;

public class ArreglosUno {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número " + (i + 1) + ": "));
        }
        JOptionPane.showMessageDialog(null, "Orden introducido: ");
        for (int i: numeros){
            JOptionPane.showMessageDialog(null, i);
        }
    }
}
