package Matrices;

import java.util.Scanner;

public class Ejercicio6 {
    //Crear una matriz "marco" de 5 x 5, todos sus elementos deben se 0, salvo los de los bordes que deben ser 1.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[5][5];
        int sumFil = 0, sumCol = 0;

        //Rellenar matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i == 0 || i == 4){ //Delimita las columnas
                    matriz[i][j] = 1;
                }  
                else if (j == 0 || j == 4) {
                    matriz[i][j] = 1;
                }
                else {
                    matriz[i][j] = 0;
                }
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
    }
}
