package com.advanced.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class BufferedReaderApp {

    public static void main(String[] args) {

        String HAMLET_PART_FILE_PATH = "src\\com\\advanced\\filehandling\\Hamlet.txt";

        try (FileReader hamletReader = new FileReader(HAMLET_PART_FILE_PATH)) {
            BufferedReader hamletBufferReader = new BufferedReader(hamletReader, 16384);
            String hamletPart = hamletBufferReader.lines()
                    .collect(Collectors.joining(System.lineSeparator()));
            System.out.println(hamletPart);
            //readAllLines(hamletBufferReader);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void readAllLines(BufferedReader hamletBufferReader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = hamletBufferReader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(System.lineSeparator());
        }
        System.out.println(stringBuilder.toString());
    }

}
