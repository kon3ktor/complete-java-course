package com.hero.garbagecollection;

public class GarbageCollectionApp {

    public static void main(String[] args) {

        UnstablePlanet artemis = new UnstablePlanet("Artemis", 5648, "gas");
        UnstablePlanet dunon = new UnstablePlanet("Dunon", 66472, "solid");
        System.out.println("The number of unstable planets: " + UnstablePlanet.getNumberOfUnstablePlanets());

        newUnstablePlanets();
        System.out.println("The number of unstable planets: " + UnstablePlanet.getNumberOfUnstablePlanets());
        artemis = null;
        dunon = null;

        System.gc();
        System.runFinalization();
        System.out.println("The number of unstable planets: " + UnstablePlanet.getNumberOfUnstablePlanets());
    }

    private static void newUnstablePlanets() {
        UnstablePlanet lethris = new UnstablePlanet("Lethris", 1486, "solid");
        UnstablePlanet okmaron = new UnstablePlanet("Okmaron", 3574, "gas");
    }


}
