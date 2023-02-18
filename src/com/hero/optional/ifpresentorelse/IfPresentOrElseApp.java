package com.hero.optional.ifpresentorelse;

import com.hero.optional.ifpresent.User;
import com.hero.optional.ifpresent.UserRepository;

import java.util.ArrayList;

public class IfPresentOrElseApp {

    public static void main(String[] args) {
        ArrayList<User> users = UserRepository.getUsers();
        users.forEach(EmailService::sendPromotion);
    }

}
