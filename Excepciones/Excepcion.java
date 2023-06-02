package Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Excepcion {
    //Verificadas(IOException), No Verificadas(RunTimeException)
    public static void main(String[] args) throws FileNotFoundException, IOException{
        //IOException - Verificadas
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\annge\\OneDrive\\Carrera Programación\\Programacion JAVA\\Excepciones\\Prueba.txt"));
        String line;
        while((line = bufferedReader.readLine())!= null){
            System.out.println(line);
        }

        //RunTimeException - No Verificadas
        int n = 5, m = 0;
        int res = n/m;
        System.out.println("El resultado es: " + res);
    }
}
