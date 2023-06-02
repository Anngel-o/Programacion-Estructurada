package Matrices;

import java.util.Scanner;

public class Ejercicio5 {
    //Crear y cargar una matriz de 5 x 5, mostrar la suma de cada fila y de cada columna.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[7][7];
        int sumFil = 0, sumCol = 0;

        //Rellenar matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digita el valor de " + "[" + i + "]" + "[" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println();

        //Imprimir matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //Sumar filas
        for (int i = 0; i < 5; i++) {//filas
            for (int j = 0; j < 5; j++) {//columnas
                sumFil += matriz[i][j];
            }
            System.out.println("La suma de la fila " + i + " es: " + sumFil);
        }
        System.out.println();
        
        //Sumar columnas
        for (int j = 0; j < 5; j++) {//columnas
            for (int i = 0; i < 5; i++) {//filas
                sumCol += matriz[i][j];
            }
            System.out.println("La suma de la columna " + j + " es: " + sumCol);
        }
        System.out.println();
    }
}
