package com.hero.optional.ifpresent;

import java.util.ArrayList;

public class UserRepository {

    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Alice", "alice@example.com", "(123) 456-7890"));
        users.add(new User("Bob", null, "(234) 567-8901"));
        users.add(new User("Charlie", "charlie@example.com", "(345) 678-9012"));
        users.add(new User("David", "david@example.com", "(456) 789-0123"));
        users.add(new User("Eve", null, "(567) 890-1234"));
        users.add(new User("Frank", "frank@example.com", "(678) 901-2345"));
        users.add(new User("Grace", "grace@example.com", "(789) 012-3456"));
        users.add(new User("Henry", "henry@example.com", "(890) 123-4567"));
        users.add(new User("Isabel", "isabel@example.com", "(901) 234-5678"));
        users.add(new User("Jack", null, "(012) 345-6789"));
        users.add(new User("Kate", "kate@example.com", "(123) 456-7890"));
        users.add(new User("Liam", "liam@example.com", "(234) 567-8901"));
        users.add(new User("Mia", null, "(345) 678-9012"));
        users.add(new User("Nora", "nora@example.com", "(456) 789-0123"));
        users.add(new User("Oliver", "oliver@example.com", "(567) 890-1234"));
        users.add(new User("Penny", "penny@example.com", "(678) 901-2345"));
        users.add(new User("Quinn", "quinn@example.com", "(789) 012-3456"));
        users.add(new User("Rachel", "rachel@example.com", "(890) 123-4567"));
        users.add(new User("Samantha", null, "(901) 234-5678"));
        users.add(new User("Tom", "tom@example.com", "(012) 345-6789"));
        users.add(new User("Ursula", "ursula@example.com", "(123) 456-7890"));
        users.add(new User("Victor", null, "(234) 567-8901"));
        users.add(new User("Wendy", "wendy@example.com", "(345) 678-9012"));
        users.add(new User("Xavier", "xavier@example.com", "(456) 789-0123"));
        users.add(new User("Yara", null, "(567) 890-1234"));
        users.add(new User("Zach", "zach@example.com", "(678) 901-2345"));
        users.add(new User("Amy", "amy@example.com", "(789) 012-3456"));
        users.add(new User("Ben", "ben@example.com", "(890) 123-4567"));
        users.add(new User("Cara", "cara@example.com", "(901) 234-5678"));
        users.add(new User("Dan", null, "(012) 345-6789"));
        users.add(new User("Emily", "emily@example.com", "(123) 456-7890"));
        users.add(new User("Fiona", null, "(111) 222-3333"));
        users.add(new User("Gabe", "gabe@example.com", "(222) 333-4444"));
        users.add(new User("Hannah", "hannah@example.com", "(333) 444-5555"));
        users.add(new User("Ian", null, "(444) 555-6666"));
        users.add(new User("Jasmine", "jasmine@example.com", "(555) 666-7777"));
        users.add(new User("Kai", null, "(666) 777-8888"));
        users.add(new User("Leah", "leah@example.com", "(777) 888-9999"));
        users.add(new User("Max", "max@example.com", "(888) 999-0000"));
        users.add(new User("Nathan", "nathan@example.com", "(999) 000-1111"));
        users.add(new User("Olivia", null, "(000) 111-2222"));
        return users;
    }

}
