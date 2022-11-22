package d_ciclosejercicio7;

import javax.swing.JOptionPane;

public class D_CiclosEjercicio7 {
    /*
    Una empresa que se dedica a la venta de desinfecantes necesita un programa para
    gestionar las facturas.En cada factura figura: código del artículo, cantidad vendida en litros
    y el precio por litro. Se pide 5 facturas introducidas: facturación total, cantidad en litros
    vendidos del artículo 1 y cuántas facturas se emitieron de más de $600
    */
    public static void main(String[] args) {
        int codigo, cantidad; float precio, total;
        int countUno = 0, countFacturacion = 0, countFacturas = 0;

        for (int i = 1; i <= 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el código de artículo: "));
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad vendida (litros): "));
            precio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el precio (por litro): "));
            
            total = (cantidad * precio);
            countFacturacion +=total;
            if (codigo == 1) {
                countUno += cantidad;
            }
            if (cantidad >= 600) {
                countFacturas++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Total de litros vendidos del artículo 1: " + countUno 
                + "\nCantidad de facturacióon total: " + countFacturacion
                + "\nFacturas mayores a 600: " + countFacturas);
    }
    
}
