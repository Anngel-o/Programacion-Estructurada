package b_operadores_math;

public class B_operadores_math {

    public static void main(String[] args) {
        //calcular raiz -sólo funciona con double's
        double num = Math.sqrt(9);
        int num2 = (int)Math.sqrt(25);
        
        //calcular elevación
        double base = 7, exponente = 2;
        double res = Math.pow(base, exponente);
        
        //redondear
        double num3 = 4.78;
        long redondeo = Math.round(num3);
        
        //números aleatorios
        double num4 = Math.random(); //del 0 al 1
        
        System.out.println(num);
        System.out.println(num2);
        System.out.println(res);
        System.out.println(redondeo);
        System.out.println(num4);
    }
    
}
