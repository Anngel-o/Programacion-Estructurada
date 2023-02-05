package Java.Operadores.OperadoresAritmeticos;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        float n1, n2;
        float sum, rest, mult, div, resi;
        System.out.println("CALCULADORA BÁSICA");

        try (Scanner num = new Scanner(System.in)) {
            System.out.print("Introduce dos numeros: ");
            n1 = num.nextFloat();
            n2 = num.nextFloat();
        }
        sum = n1 + n2;
        rest = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;
        resi = n1 % n2;

        System.out.println("La suma es: " + sum);
        System.out.println("La resta es: " + rest);
        System.out.println("La multiplicacion es: " + mult);
        System.out.println("La division es: " + div);
        System.out.println("El residuo o modulo es: " + resi);
    }
}
