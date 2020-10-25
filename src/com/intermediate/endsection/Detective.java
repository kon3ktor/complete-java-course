package com.intermediate.endsection;

public class Detective extends Person {

    public static final int SUCCESS_PERCENTAGE = 20;

    public Detective(String name, String nickname, int yearOfBorn, String expertIn, Item[] items) {
        super(name, nickname, yearOfBorn, expertIn, items);
    }

    @Override
    public void printBioData() {
        System.out.println("Detective:");
        super.printBioData();
    }
}
