package GestorArchivos;

import Model.Juego;
import Model.Ronda;

import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
public class GestorDatos{

    public boolean registrarRonda(Ronda ronda) {
        boolean lineaVacia = false;
        try {
            File file = new File("C:\\Users\\56976\\Documents\\Nivel 5\\Ramos\\Laboratorio de Programacion II\\Tareas\\AdventureGame2\\src\\main\\resources\\rondas.txt");
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia = true;
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            if (lineaVacia == false) {
                bw.newLine();
            }
            bw.write(ronda.toString());
            bw.close();
            fw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al intentar registrar ronda, favor contactar con administrador");
            return false;
        }
    }
}
