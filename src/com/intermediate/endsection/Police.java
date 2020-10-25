package com.intermediate.endsection;

import java.util.Random;

public class Police {

    private Detective adamPalmer;

    Police() {
        Item[] adamItems = new Item[2];
        adamItems[0] = new Item("Revolver", 500.0);
        adamItems[1] = new Item("Magnifying glass", 10.0);
        adamPalmer = new Detective("Adam Palmer", "Coyote", 1960, "chess", adamItems);
    }

    public boolean catchCriminals(Gang gang) {
        if (areCriminalsCaught()) {
            System.out.println(adamPalmer.getName() + " managed to catch the gang");
            if (gang.getSumRobbedValue() > 0) {
                System.out.println("The stolen items are recovered.");
                System.out.println("Their overall value is estimated to $" + gang.getSumRobbedValue());
            } else {
                System.out.println("The gang couldn't steal anything.");
            }
            return true;
        } else {
            System.out.println(adamPalmer.getName() + " couldn't catch the criminals.");
            System.out.println("They managed to steal items valued $" + gang.getSumRobbedValue());
            return false;
        }
    }

    private boolean areCriminalsCaught() {
        Random randomNumberGenerator = new Random();
        if (randomNumberGenerator.nextInt(101) >= Detective.SUCCESS_PERCENTAGE) {
            return false;
        }
        return true;
    }
}
