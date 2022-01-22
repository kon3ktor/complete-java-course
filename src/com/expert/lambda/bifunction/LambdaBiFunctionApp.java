package com.expert.lambda.bifunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class LambdaBiFunctionApp {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> getPow = (numberOne, numberTwo) -> Math.pow(numberOne, numberTwo);
        System.out.println(getPow.apply(5, 2));

        BiFunction<Integer, Integer, List<Integer>> generateList = (size, multiply) -> {
          List<Integer> generatedList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                generatedList.add(i * multiply);
            }
          return generatedList;
        };
        System.out.println(generateList.apply(10, 1));
    }
}
