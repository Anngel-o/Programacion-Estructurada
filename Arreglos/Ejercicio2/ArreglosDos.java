import java.util.Scanner;

public class ArreglosDos {
    // //Leer 5 números por teclado, almacenarlos en un arreglo y realizar la media
    // de los positivos, la media de los negativos y contar el número de ceros
    public static void main(String[] args) {
        float array[] = new float[5];
        int countPos = 0, countNeg = 0, countZer = 0;
        float addPos = 0, addNeg = 0, addZer = 0;
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingresa un número " + "(" + (i+1) + " de " + "5): ");
            array[i] = input.nextInt();

            if (array[i] > 0) {
                addPos += array[i];
                countPos++;
            }
            else if(array[i] < 0) {
                addNeg += array[i];
                countNeg++;
            }
            else if(array[i] == 0) {
                countZer++;
            }
        }
        float medPos = addPos/countPos;
        float medNeg = addNeg/countNeg;

        System.out.println("La media positiva es: " + medPos);
        System.out.println("La media negativa es: " + medNeg);
        System.out.println("La cantidad de ceros es: " + countZer);
    }
}
