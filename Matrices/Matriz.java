package Matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz0[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int matriz1[][]; 
        int numFil, numCol;
        
        for (int i = 0; i < matriz0.length; i++) { //Filas
            for (int j = 0; j < matriz0.length; j++) { //Columnas
                System.out.print(matriz0[i][j] + " ");
            }
        }

        numFil = Integer.parseInt(JOptionPane.showInputDialog("Digita el número de filas de la matriuz"));
        numCol = Integer.parseInt(JOptionPane.showInputDialog("Digita el número de columnas de la matriuz"));

        matriz1 = new int[numFil][numCol];

        //Rellenar matriz
        for (int i = 0; i < numFil; i++) {
            for (int j = 0; j < numCol; j++) {
                System.out.print("Digita el valor de " + "[" + i + "]" + "[" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }
        System.out.println();

        //Imprimir matriz
        for (int i = 0; i < numFil; i++) {
            for (int j = 0; j < numCol; j++) {
                System.out.println(matriz1[i][j] + " " );
            }
        }
        System.out.println();
    }
}