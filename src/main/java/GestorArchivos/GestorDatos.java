package GestorArchivos;

import Model.Juego;
import Model.Ronda;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class GestorDatos{
    public Juego leerArchivoRondas(Juego juego, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            //Lee cada linea del archivo hasta que la linea sea nula
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
                juego.getRondas().add(new Ronda(data[0], data[1]));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
        return juego;
    }

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
