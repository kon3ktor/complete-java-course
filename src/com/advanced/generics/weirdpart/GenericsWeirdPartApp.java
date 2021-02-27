package com.advanced.generics.weirdpart;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericsWeirdPartApp {

    public static void main(String[] args) {
        ArrayList<Integer> lotteryNumbers = new ArrayList<>(Arrays.asList(23, 45, 57, 82, 14));
        GenericFunctions.addNumbers(lotteryNumbers);
        GenericFunctions.printList(lotteryNumbers);
        GenericFunctions.displayToString(lotteryNumbers);

        GenericFunctions<Double> genericFunctions = new GenericFunctions<>();
        //genericFunctions.printSimpleGenerics(lotteryNumbers);
    }
}
