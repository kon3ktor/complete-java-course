package com.hero.optional.get;

import java.util.Optional;
import java.util.Scanner;

public class GetApp {

    public static void main(String[] args) {
        Optional<String> username = Optional.ofNullable(getUsername());
        if (username.isPresent()) {
            System.out.println("The username entered: " + username.get());
            System.out.println("Welcome, " + username.get() + "!");
        }

    }

    private static String getUsername() {
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        return input.length() > 0 ? input : null;
    }
}
