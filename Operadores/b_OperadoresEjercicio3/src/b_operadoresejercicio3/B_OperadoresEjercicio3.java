package b_operadoresejercicio3;

import java.util.Scanner;

public class B_OperadoresEjercicio3 {
    /*
    La calificación final de un estudiante de informática
    se calcula con base a las calificaciones de cuatro aspectos
    de su rendimiento académico: participación, 1er examen, 
    2do examen y examen final. Sabiendo que las calificaciones 
    anteriores entran a la calificación final con ponderaciones
    de 10%, 25%, 25% y 40%.
    Calcular e imprimir la calificación final pot estudiante.
    */
    public static void main(String[] args) {
        float p, e1, e2, ef, c;
        
        System.out.println("CALIIFICACION POR ESTUDIANTE");
        System.out.println("Ingrese en el siguiente orden los aspectos a calificar:");
        
        System.out.println("Participacion  Examen1  Examen2  Examen final");
        Scanner entrada = new Scanner(System.in);
        p = entrada.nextFloat();
        e1 = entrada.nextFloat();
        e2 = entrada.nextFloat();
        ef = entrada.nextFloat();
        
        p = (float) (p * 0.1);
        e1 = (float) (e1 * 0.25);
        e2 = (float) (e2 * 0.25);
        ef = (float) (ef * 0.4);
        c = p + e1 + e2 + ef;
        
        System.out.println("Ponderacion por aspecto: ");
        System.out.println(p + ", " + e1 + ", " + e2 + ", " + ef);
        System.out.println("Calificacion final: " + c);
        
    }
    
}
