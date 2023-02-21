package com.hero.optional.orelse;

import com.hero.optional.ifpresent.User;

public class EmailServiceOrElse {

    public static void sendPromotion(User user) {
        String email = user.getEmail().orElse(guessingEmailAddress(user));
        System.out.println("Promotion email is sent to: " + email);
    }

    private static String guessingEmailAddress(User user) {
        System.out.println("Guessing the email address for: " + user.getName());
        return user.getName().toLowerCase() + "@example.com";
    }
}
