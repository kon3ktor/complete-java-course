package com.advanced.string;

public class StringPerformanceApp {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        String testString = "";
        for (int i = 0; i <= 100000; i++) {
            testString += i;
        }

//        StringBuilder something = new StringBuilder("");
//        for (int i = 0; i <= 100000; i++) {
//            something.append(i);
//        }
//
//        StringBuffer anything = new StringBuffer("");
//        for (int i = 0; i <= 100000; i++) {
//            anything.append(i);
//        }

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("It took " + totalTime / 1000000 + "ms");

    }
}
