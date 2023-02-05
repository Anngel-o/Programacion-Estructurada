package Java.Ciclos.CiclosWhile;

public class CiclosWhile {
    public static void main(String[] args) {
        int i = 1, j = 10;
        // números del 1 al 10
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        // números del 1 al 10
        do {
            System.out.println(j);
            j--;
        } while (j >= 1);
    }
}
