package Arreglos.Ejercicio8;

import java.util.Scanner;

//Leer 10 números ordenados de forma creciente. Leer N y buscarlo en la tabla. Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje.
public class ArreglosOcho {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int array[] = new int[10], num = 0;
            boolean creciente = false;

            do {
                // RELLENAR EL ARRAY
                System.out.println("Rellenar el array: ");
                for (int i = 0; i < array.length; i++) {
                    System.out.print("Introduce una valor para " + (i + 1) + ": ");
                    array[i] = input.nextInt();
                }

                // COMPROBAR SI EL ARRAY ESTÁ ORDENADO
                for (int i = 0; i < 9; i++) {
                    if (array[i] < array[i + 1]) { // Forma creciente 1 2 3
                        creciente = true;
                    }
                    if (array[i] > array[i + 1]) { // Forma decreciente 3 2 1
                        creciente = false;
                        break; // No hace iteraciones si ya se sabe que el arreglo es decreciente debido a un par de valores que no lo fueron.
                    }
                }
                if (!creciente) {
                    System.out.println("El arreglo no está ordenado crecinete, vuelve a introducirlo");
                }
            } while (!creciente);

            System.out.print("Digite un número a buscar: ");
            num = input.nextInt();

            for (int i = 0; i < array.length; i++) {
                if (array[i] == num) {
                    System.out.println("Valor encontrado: " + array[i]);
                }
                else {
                    System.out.println("Valor no encontrado");
                }
            }
        }
    }
}
