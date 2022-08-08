package com.hero.optional.oldway;

import java.util.List;

public class FriendFinderService {

    public Friend findFriend(String friendName) {
        List<Friend> friends = List.of(
                new Friend(123123L, "Adrian", 31, 1245),
                new Friend(123124L, "Lala", 29, 345),
                new Friend(123125L, "Diego", 43, 432),
                new Friend(123126L, "Sasha", 22, 564));
        Friend friendFound = null;
        for (Friend friend : friends) {
            if (friendName.equals(friend.getName())) {
                friendFound = friend;
            }
        }
        return friendFound;
    }

}
