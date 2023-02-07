package Java.Arreglos.Ejercicio3;

import java.util.Scanner;

public class ArreglosTres {
    //Leer por teclado 2 tablas de 5 números enteros y mezclarlas en una tercera
    //de la forma 1° de A, el 1° de B, el 2° de A, el 2° de B. etc.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[5], b[] = new int[5], c[] = new int[10];

        System.out.println("Rellenar el primer arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa un número " + "(" + (i +1 ) + " de 5): ");
            a[i] = input.nextInt();
        }
        System.out.println("Rellenar el segundo arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa un número " + "(" + (i + 1) + " de 5): ");
            b[i] = input.nextInt();
        }

        int j = 0;
        for (int i = 0; i < 5; i++) {
            c[j] = a[i];//el primer valor de a, en la siguiente iteración el segundo valor de a...
            j++;//se aumenta para guardar el valor de b
            c[j] = b[i];// el primer valor de b, en la siguiente iteración el segundo valor de b...
            j++;
        }

        System.out.println("El tercer arreglo es: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
