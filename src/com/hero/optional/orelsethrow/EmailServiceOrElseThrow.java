package com.hero.optional.orelsethrow;

import com.hero.optional.ifpresent.User;

import java.util.NoSuchElementException;

public class EmailServiceOrElseThrow {

    public static void sendPromotion(User user) {
        try {
            String email = user.getEmail().orElseThrow(NoSuchElementException::new);
            System.out.println("Promotion email is sent to: " + email);
        } catch (NoSuchElementException exception) {
            System.out.println("Something is wrong with the email address.");
        }
    }

}
