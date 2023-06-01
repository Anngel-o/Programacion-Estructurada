package Arreglos.Ejercicio7;

import java.util.Scanner;

// Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares de la primera, y acontinuación los elementos impares
public class ArreglosSiete {
    public static void main(String[] args) {
        int array[] = new int[10];
        int conteoPar = 0, conteoImpar = 0;
        Scanner input = new Scanner(System.in);

        // RELLENAR EL ARREGLO
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor para " + (i + 1) + ": ");
            array[i] = input.nextInt();

            // DETERMINAR TAMAÑO PARA ARRAYS DE PARES E IMPARES
            if (array[i] % 2 == 0) {
                conteoPar++;
            } else {
                conteoImpar++;
            }
        }

        input.close();

        // CREAR ARRAYS PARA ELEMENTOS PARES E IMPARES
        int arrayImpares[] = new int[conteoImpar];
        int arrayPares[] = new int[conteoPar];

        // INICIAR LAS VARIABLES DE CONTEO DE 0 PARA ITERARLAS DESDE EL INICIO
        conteoPar = 0;
        conteoImpar = 0;

        // RELLENAR LOS ARREGLOS DE PARES E IMPARES
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayPares[conteoPar] = array[i];
                conteoPar++;
            } else {
                arrayImpares[conteoImpar] = array[i];
                conteoImpar++;
            }
        }

        // IMPRIMIR LOS ARREGLOS
        System.out.println("ARREGLO COMPLETO");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "-");
        }
        System.out.println();

        System.out.println("ARREGLO DE PARES");
        for (int i = 0; i < arrayPares.length; i++) {
            System.out.print(arrayPares[i] + "-");
        }
        System.out.println();
        
        System.out.println("ARREGLO DE IMPARES");
        for (int i = 0; i < arrayImpares.length; i++) {
            System.out.print(arrayImpares[i] + "-");
        }
        System.out.println();
    }
}
