package com.hero.optional.oldway;

import java.util.Objects;

public class Friend {

    private long id;
    private String name;
    private int age;
    private int numberOfFriends;

    public Friend(long id, String name, int age, int numberOfFriends) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.numberOfFriends = numberOfFriends;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return id == friend.id && age == friend.age && numberOfFriends == friend.numberOfFriends && name.equals(friend.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, numberOfFriends);
    }
}
