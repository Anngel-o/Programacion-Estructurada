package b_operadoresejercicio1;

import java.util.Scanner;

public class B_OperadoresEjercicio1 {
    /*
    Programa que solicite 3 calificaciones y muestra 
    la suma de ellas
    */
    public static void main(String[] args) {
        float c1, c2, c3, sum, prom;
        System.out.print("Introduzca 3 calificaciones: ");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita tres numeros: ");
        c1 = entrada.nextInt(); 
        c2 = entrada.nextInt(); 
        c3 = entrada.nextInt(); 
        
        sum = c1 + c2 + c3;
        prom = (c1 + c2 + c3) / 3;
        System.out.println("La suma es: " + sum);
        System.out.println("El promedio es: " + prom);
    }
    
}
