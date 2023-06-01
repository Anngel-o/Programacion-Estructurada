package Arreglos.Ejercicio4;

import java.util.Scanner;

// Leer por teclado 10 números enteros, la aplicación debe indicarnos si los números están ordenados de forma creciente, decreciente o si están desordenados.
public class ArreglosCuatro {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int array[] = new int[10];
        boolean creciente = false, decreciente = false;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) { // 1 < 2 < 3 < 4 ...
                creciente = true;
            }
            if (array[i] > array[i + 1]) { // 1 > 2 > 3 > 4 ...
                decreciente = true;
            }
        }

        if (creciente && !decreciente) {
            System.out.println("El arreglo es creciente");
        } else if (!creciente && decreciente) {
            System.out.println("El arreglo es decreciente");
        } else if (creciente && decreciente) {
            System.out.println("El arreglo está desordenado");
        } else if (!creciente && !decreciente) {
            System.out.println("Los números del arreglo son todos iguales");
        }
    }
}
