package com.advanced.generics;

import java.util.ArrayList;

public class GenericsApp {

    public static void main(String[] args) {

        Box<Integer> myFavoriteNumber = new Box<>();
        myFavoriteNumber.setTypeData(-15);
        Util.displayToString(myFavoriteNumber);

        Box<String> myFavoriteActor = new Box<>();
        myFavoriteActor.setTypeData("Russel Crow");
        Util.displayToString(myFavoriteActor);

        ArrayList<Box<String>> pileOfBoxes = new ArrayList<>();
        pileOfBoxes.add(myFavoriteActor);
        pileOfBoxes.add(myFavoriteActor);
        Util.displayToString(pileOfBoxes);

        OrderedPair<Integer, String> kobeBryant = new OrderedPair<>(24, "Kobe Bryant");
        Util.displayToString(kobeBryant);

        ArrayList<OrderedPair<String, String>> listOfCountries = new ArrayList<>();
        OrderedPair<String, String> malta = new OrderedPair<>("MLT", "Malta");
        OrderedPair<String, String> germany = new OrderedPair<>("GER", "Germany");

        listOfCountries.add(malta);
        listOfCountries.add(germany);
        Util.displayToString(listOfCountries);

    }
}
