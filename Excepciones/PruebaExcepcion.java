package Excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PruebaExcepcion {
    public void leerArchivo() throws FileNotFoundException, IOException{
        File archivo = new File("C:\\Users\\annge\\OneDrive\\Carrera Programación\\Programacion JAVA\\Excepciones\\Prueba.txt");
        FileReader fileReader = new FileReader(archivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while((line = bufferedReader.readLine())!= null){
            System.out.println(line);
        }
    }

    public void leerArchivo2(){
        try {
            leerArchivo();
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo especificado");
        } catch (IOException e) {
            System.out.println("Ha ocurrido una exception");
        }
    }
    public static void main(String[] args) {
        PruebaExcepcion pruebaExcepcion = new PruebaExcepcion();
        pruebaExcepcion.leerArchivo2();
    }
}
