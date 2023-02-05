package Java.Operadores.Ejercicio4;

import java.util.Scanner;

public class EjercicioCuatro {
    /*
     * Construir un programa que, dado un número total de horas,
     * devuelva el número de semanas, días y horas equivalentes.
     * Por ejemplo, dado un total de 1000 horas debe mostrar
     * 5 semanas, 6 días y 16 horas.
     */
    public static void main(String[] args) {
        int horasT, semanas, dias, horas;

        System.out.println("Introduce el numero de horas a convertir:");
        try (Scanner entrada = new Scanner(System.in)) {
            horasT = entrada.nextInt();
        }
        semanas = horasT / 168;
        dias = horasT % 168 / 24;
        horas = horasT % 24;

        System.out.println(semanas + " semanas" + ", " + dias + " dias" + ", " + horas + " horas");
    }
}
