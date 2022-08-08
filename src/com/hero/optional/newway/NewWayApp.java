package com.hero.optional.newway;

import com.hero.optional.oldway.Friend;
import com.hero.optional.oldway.FriendFinderService;

import java.util.Optional;
import java.util.Scanner;

public class NewWayApp {

    public static void main(String[] args) {

        FriendFinderService friendFinderService = new FriendFinderService();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Find friend:");
        Optional<Friend> friend = Optional.ofNullable(friendFinderService.findFriend(userInput.nextLine()));
        friend.ifPresentOrElse(System.out::println, () -> System.out.println("Not found."));

    }
}
