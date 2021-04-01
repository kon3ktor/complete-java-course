package com.advanced.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterApp {
    public static void main(String[] args) {
        String JULIUS_CESAR_FILE_PATH = "src/com/advanced/filehandling/JuliusCesar.txt";

        try (FileWriter bookWriter = new FileWriter(JULIUS_CESAR_FILE_PATH) ){
            bookWriter.write("Even you, Brutus?");
            bookWriter.append("\nYes.");
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
