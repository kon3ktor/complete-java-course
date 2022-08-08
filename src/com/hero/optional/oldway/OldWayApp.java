package com.hero.optional.oldway;

import java.util.Scanner;

public class OldWayApp {

    public static void main(String[] args) {
        FriendFinderService friendFinderService = new FriendFinderService();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Find friend:");
        Friend friend = friendFinderService.findFriend(userInput.nextLine());
        if (friend != null) {
            System.out.println(friend.toString());
        } else {
            System.out.println("Not found");
        }

    }
}
