package Arreglos.Ejercicio5;

import java.util.Scanner;

// Crear un programa que lea por teclado 10 números enteros y la despace una posición hacía abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero, etc. El último pasa a ser el primero.
public class ArreglosCinco {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int array[] = new int[10];
        int ultimo;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el valor de " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        ultimo = array[9]; // guardamos la posición del último elemento del array
        System.out.println("Los valores nuevos son: ");
        for (int i = 8; i >= 0; i--) {
            array[i] = array[i + 1];
        }
        array[0] = ultimo; // al primer valor del nuevo arreglo le asignamos el último valor guardado del
                           // vector anterior
    }
}
