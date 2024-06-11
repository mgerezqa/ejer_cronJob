package domain;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainWriter
{
    static String input_text;
    static String rutaAlArchivo;

    public static void main( String[] args )
    {
        for(String arg: args){
            System.out.println(arg);
            rutaAlArchivo = args[0];
            input_text = args[1];
        }

        Writer input_file = new Writer();
        input_file.init(rutaAlArchivo);
        input_file.write(input_text);
        input_file.read();

    }
}

class Writer{
    String path;

    FileWriter file;

    //inicializar apertura de archivo
    public void init(String path) {
        System.out.println("Inicializando archivo.......");
        try {
            this.file = new FileWriter(path,true);
            this.path = path;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //escribir en archivo
    public void write(String text) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        String fechaHoraActual = formatter.format(LocalDateTime.now());
        System.out.println("Escribiendo en archivo.......");
        try {
            this.file.write("[" + fechaHoraActual + "]"+" "+text+"\n");
            this.file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void read(){
        System.out.println("Leyendo archivo.......");
        try {
            FileReader file = new FileReader(this.path);
            java.util.Scanner scanner = new java.util.Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}