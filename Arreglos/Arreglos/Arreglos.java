public class Arreglos {

    public static void main(String[] args) {
        int[] numeros = new int[3];
        //int[] nums = {5, 6, 9};
        
        //Llenar valores manualmente
        numeros[0] = 7;
        numeros[1] = 9;
        numeros[2] = 10;
        
        System.out.println(numeros[1]);
        
        for (int i = 0; i < 3; i++) {
            //imprime todo el arreglo
            System.out.println(numeros[i]);
        }
    }
    
}
