package Arreglos.Ejercicio6;

import java.util.Scanner;

// Leer 5 números introducidos por teclado de forma creciente. Éstos se guardarán en una tabla de de tamanio 10. Leer un número N, e insertarlo en el lugar adecuado para que la tabla continue ordenada.
public class ArreglosSeis {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int array[] = new int[10];
        int num = 0, positionNum = 0;
        boolean creciente = true;

        do {
            // LLENAR EL ARRAY
            for (int i = 0; i < 5; i++) {
                System.out.print("Introduce una valor para " + (i + 1) + ": ");
                array[i] = input.nextInt();
            }
            // COMPROBAR SI EL ARREGLO ES CRECIENTE O NO
            for (int i = 0; i < 4; i++) {
                if (array[i] < array[i + 1]) { // Forma creciente 1 2 3
                    creciente = true;
                }
                if (array[i] > array[i + 1]) { // Forma decreciente 3 2 1
                    creciente = false;
                    break; // No hace iteraciones si ya se sabe que el arreglo es decreciente debido a un
                           // par de valores que no lo fueron.
                }
            }

            if (!creciente) {
                System.out.println("El arreglo no está ordenado crecinete, vuelve a introducirlo");
            }
        } while (!creciente);

        System.out.print("Digite un número a insertar: ");
        num = input.nextInt();

        // CONOCER EN QUÉ POSICIÓN SE COLOCARÁ EL NÚMERO INTRODUCIDO
        int j = 0;
        while (array[j] < num && j < 5) {
            positionNum++;
            j++;
        }

        // TRASLADAR LOS NÚMEROS UNA POSICIÓN EN EL ARREGLO
        for (int i = 4; i >= positionNum; i--) {
            array[i + 1] = array[i];
        }

        // INSERTAR EL NÚMERO DIGITADO AL ARREGLO
        array[positionNum] = num;

        // IMPRIMIMOS EL NUEVO ARREGLO EN ORDEN
        System.out.println("Nuevo arreglo con el número introducido acomodado en orden creciente");
        for (int i = 0; i < 6; i++) {
            System.out.print(array[i] + "-");
        }
        System.out.println();
    }
}
