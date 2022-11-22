package c_condicionalesejercicio7;

import javax.swing.JOptionPane;

public class C_CondicionalesEjercicio7 {
    /*
    Hacer un programa que simule un cajero automático con un saldo inicial
    de $1000 con el menú:
    ->Ingresar dinero
    ->Retirar dinero
    ->Salir
    */
    public static void main(String[] args) {
        int saldo = 1000, retiro, ingreso, usuario;
        
        JOptionPane.showMessageDialog(null, "Bienvenido a Cajeros Anngelo");
        
        usuario = Integer.parseInt(JOptionPane.showInputDialog("Qué desea hacer?"
                + "\nSaldo Actual: " + saldo + "\n1. Ingresar Dinero" + "\n2. Retirar Dinero" + "\n3. Salir"));
        
        switch (usuario) {
            case 1:
                ingreso = Integer.parseInt(JOptionPane.showInputDialog("Cuánto dinero desea ingresar"));
                saldo += ingreso;
                JOptionPane.showMessageDialog(null, "Saldo actualizado: " + saldo);
                break;
            case 2:
                retiro = Integer.parseInt(JOptionPane.showInputDialog("Cuánto dinero desea ingresar"));
                saldo -= retiro;
                JOptionPane.showMessageDialog(null, "Saldo actualizado: " + saldo);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Gracias por su preferencia!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción invalida, intente de nuevo");
                throw new AssertionError();
        }
    }
    
}
