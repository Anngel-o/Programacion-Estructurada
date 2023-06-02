package Matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    // Crear y cargar dos matrices de 3 x 3, sumarlas y mostrar su suma.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int matriz2[][] = new int[3][3];

        //Rellenar matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digita el valor de " + "[" + i + "]" + "[" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digita el valor de " + "[" + i + "]" + "[" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }
        System.out.println();

        //Imprimir matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + matriz2[i][j] + " ");
            }
        }
        System.out.println();
    }
}
