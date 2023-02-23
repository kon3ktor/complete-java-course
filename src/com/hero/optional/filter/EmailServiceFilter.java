package com.hero.optional.filter;

import com.hero.optional.ifpresent.User;

public class EmailServiceFilter {
    public static void sendPromotion(User user) {
        user.getEmail()
                .filter(email -> email.length() > 3 && email.contains("@") && email.contains("."))
                .ifPresentOrElse(
                    email -> System.out.println("Promotion email is sent to: " + email),
                    () -> System.out.println("Promotion SMS is sent to:" + user.getPhoneNumber())
        );
    }

}
