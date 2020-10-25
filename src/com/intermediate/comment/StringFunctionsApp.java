package com.intermediate.comment;

import java.util.Scanner;

public class StringFunctionsApp {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        String inputText = keyboardInput.nextLine();

        if ("Paris".equals(inputText)) {
            System.out.println("The capital of France is typed in.");
        } else {
            System.out.println("The text typed in is: " + inputText);
        }

        if (inputText.equalsIgnoreCase("Paris")) {
            System.out.println("Paris was typed in.");
        } else {
            System.out.println("The text typed in is: " + inputText);
        }

        if (inputText.contains("Par")) {
            System.out.println("The input text contains Par.");
        }

        if (inputText.isEmpty()) {
            System.out.println("The input text is empty.");
        }

        System.out.println("The input text's length is: " + inputText.length());
        System.out.println("The input text with uppercase: " + inputText.toUpperCase());
        System.out.println("The input text with lowercase: " + inputText.toLowerCase());

        if (inputText.startsWith("P") || inputText.endsWith("P")) {
            System.out.println("The input text starts or ends with a P letter.");
        }

        System.out.println("The replaced text: " + inputText.replace("N", "D"));
    }
}
