package com.hero.optional.empty;

import java.util.Optional;
import java.util.Scanner;

public class EmptyApp {

    public static void main(String[] args) {

        // Optional<String> nullStringOptional = null;
        // nullStringOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Empty"));

        Optional<String> emptyOptionalString = Optional.empty();
        emptyOptionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Empty"));

        FindFriendServiceEmpty findFriendServiceEmpty = new FindFriendServiceEmpty();
        Scanner userInput = new Scanner(System.in);

        findFriendServiceEmpty.findFriend(userInput.nextLine())
                .ifPresentOrElse(System.out::println, () -> System.out.println("Not found."));


    }
}
