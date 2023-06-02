package Matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    // Crear y cargar una matriz de tamanio n x  m y decir si es simétrica o no.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][];
        int n, m;
        boolean simetrica = true;

        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la fila: "));
        m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la columna: "));

        matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Digita el valor de " + "[" + i + "]" + "[" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        if (n == m) {
            int i,j;
            i = 0;
            while (i < n && simetrica) {
                j = 0;
                while (j < m && simetrica) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if (simetrica == true) {
                JOptionPane.showMessageDialog(null, "La matriz es simétrica");
            }   
            else{
                JOptionPane.showMessageDialog(null, "La matriz es no simétrica");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "La matriz es no simétrica");
        }
    }
}
