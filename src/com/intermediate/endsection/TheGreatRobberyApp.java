package com.intermediate.endsection;

public class TheGreatRobberyApp {

    public static void main(String[] args) {
        City city = new City();
        Gang theGang = new Gang();
        Police police = new Police();
        theGang.printGangInfo();
        System.out.println();
        do {
            theGang.letsRob(city.getBuildings());
        } while (!police.catchCriminals(theGang));
    }
}
