package com.advanced.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class FileClassUsefulFunctionsApp {

    public static void main(String[] args) {
        File fileHandlingApp = new File("src\\com\\advanced\\filehandling\\FileHandlingApp.java");

        System.out.println("File name: " + fileHandlingApp.getName());
        System.out.println("Parent: " + fileHandlingApp.getParent());
        System.out.println("This file exists: " + fileHandlingApp.exists());
        System.out.println("This file object is a directory: " + fileHandlingApp.isDirectory());
        System.out.println("This file object is a file: " + fileHandlingApp.isFile());
        System.out.println("This pathname is absolute: " + fileHandlingApp.isAbsolute());


        System.out.println("This file can be executed: " + fileHandlingApp.canExecute());
        System.out.println("This file can be read: " + fileHandlingApp.canRead());
        System.out.println("This file can be written: " + fileHandlingApp.canWrite());

        System.out.println("Get path: " + fileHandlingApp.getPath());
        System.out.println("Get absolute path: " + fileHandlingApp.getAbsolutePath());
        try {
            System.out.println("Get canonical path: " + fileHandlingApp.getCanonicalPath());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("Get URI path: " + fileHandlingApp.toURI());

        Calendar lastModified = Calendar.getInstance();
        lastModified.setTimeInMillis(fileHandlingApp.lastModified());
        System.out.println("Last modified: " + lastModified.getTime());

        System.out.println("Total space: " + fileHandlingApp.getTotalSpace() + "bytes");
        System.out.println("Free space: " + fileHandlingApp.getFreeSpace() + "bytes");
        System.out.println("Usable space: " + fileHandlingApp.getUsableSpace() + "bytes");

        fileHandlingApp.setReadOnly();
        fileHandlingApp.setReadable(true);
        fileHandlingApp.setWritable(true);
        fileHandlingApp.setExecutable(false);

        fileHandlingApp.setLastModified(Calendar.getInstance().getTimeInMillis());
        lastModified.setTimeInMillis(fileHandlingApp.lastModified());
        System.out.println("New last modified: " + lastModified.getTime());


    }
}
