package c_condicionalesejercicio4;

import javax.swing.JOptionPane;

public class C_CondicionalesEjercicio4 {
    /*
    En la Friki Plaza otorgan un 20% de descuento si la compra es mayor
    a $300, calcular el descuento de la compra de un cliente
    */
    public static void main(String[] args) {
        float cant, des, ah;
        
        JOptionPane.showMessageDialog(null, "Bienvenido a FrikiPlaza");
        cant = Float.parseFloat(JOptionPane.showInputDialog("Cuál es el total a pagar?"));
        
        if (cant >= 300) {
            des = (float) (cant * 0.80);
            ah = (float) (cant * 0.20);
            JOptionPane.showMessageDialog(null, "Con el descuento del 20% el total es" + des);
            JOptionPane.showMessageDialog(null, "Usted ahorró " + ah);
        }
        else {
            JOptionPane.showMessageDialog(null, "Sin descuento, el total es " + cant);
        }
    }
    
}
