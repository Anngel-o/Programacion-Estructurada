package b_operadoresejercicio2;

import java.util.Scanner;

public class B_OperadoresEjercicio2 {
    /*
    Guillermo tiene N dólares, Luis tiene la mitad de lo que
    posee Guillermo, Juan tiene la mitad de lo que poseen Luis 
    y Guillermo juntos.
    Calcular e imprimir la cantidad de dinero que tienen entre todos
    */
    public static void main(String[] args) {
        float g, l, j, t;
        System.out.println("Introduce la cantidad de billetes de Guillermo: ");
        Scanner entrada = new Scanner(System.in);
        g = entrada.nextFloat();
        
        l = g/2;
        j = (g + l)/2;
        t = g + l + j;
        
        System.out.println("Luis tiene: " + l);
        System.out.println("Juan tiene: " + j);
        System.out.println("En total tienen: " + t);
    }
    
}
