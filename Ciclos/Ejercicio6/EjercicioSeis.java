package Java.Ciclos.Ejercicio6;

import javax.swing.JOptionPane;

public class EjercicioSeis {
    /*
     * Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
     * la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que
     * miden más de 1.75
     */
    public static void main(String[] args) {
        int edad, sumE = 0;
        float altura, promE = 0, promA = 0, sumA = 0;
        int countEd = 0, countAl = 0;

        for (int i = 1; i <= 5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Digita tu edad: "));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Digita tu altura: "));

            sumE += edad;
            sumA += altura;
            if (edad >= 18) {
                countEd++;
            }
            if (altura >= 1.75) {
                countAl++;
            }
        }
        promE = sumE / 5;
        promA = sumA / 5;
        JOptionPane.showMessageDialog(null, "Existen " + countEd + "alumnos mayores de 18 años" +
                "\nExisten " + countAl + " alumnos con estatura mayor a 1.75 m");
        JOptionPane.showMessageDialog(null, "Edad promedio es " + promE + "\nAltura promedio es de" +
                promA);
    }
}
