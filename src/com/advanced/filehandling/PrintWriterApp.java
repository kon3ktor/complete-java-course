package com.advanced.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterApp {

    public static void main(String[] args) {
        String JULIUS_CESAR_FILE_PATH = "src/com/advanced/filehandling/JuliusCesar.txt";

        try (PrintWriter bookWriter = new PrintWriter(new FileWriter(JULIUS_CESAR_FILE_PATH, true))) {
            bookWriter.println("Even you, Brutus?");
        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }
}
