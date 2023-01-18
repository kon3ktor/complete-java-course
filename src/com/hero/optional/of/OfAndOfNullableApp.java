package com.hero.optional.of;

import java.util.Optional;
import java.util.Scanner;

public class OfAndOfNullableApp {

    public static void main(String[] args) {
        System.out.println("Enter your username of identification:");
        Optional<String> username = Optional.of(getUsername());
        if (!"".equals(username.get())) {
            System.out.println("Welcome, " + username.get() + "!");
        } else {
            System.out.println("Username is not entered.");
        }

    }

    private static String getUsername() {
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        return input.length() > 0 ? input : "";
    }

}
