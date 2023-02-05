package Java.Intro.Datos;

import java.util.Scanner;

public class EntradaSalidaDatos {
    public static void main(String[] args) {
        int num;
        String cad;
        char letra;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digita un numero: ");
            num = entrada.nextInt(); // guarda ese valor
        }
        try (Scanner entrada2 = new Scanner(System.in)) {
            System.out.println("Digita una cadena: ");
            // cad = entrada2.next(); //guarda ese valor hasta encontrar un espacio
            cad = entrada2.nextLine(); // guarda toda la cadena incluyendo espacios
        }
        try (Scanner entrada3 = new Scanner(System.in)) {
            System.out.println("Digita una letra: ");
            letra = entrada3.next().charAt(0); // guarda solo el caracter indicado por el index
        }
        System.out.println("El numero es: " + num);
        System.out.println("La cadena es: " + cad);
        System.out.println("El numero es: " + letra);
    }
}
