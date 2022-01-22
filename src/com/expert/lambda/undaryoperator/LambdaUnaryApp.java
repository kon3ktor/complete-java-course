package com.expert.lambda.undaryoperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class LambdaUnaryApp {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(operateOnList(numbers, number -> number * 3));

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        System.out.println(operateOnList(letters, letter -> letter + letter));

    }

    private static <T> List<T> operateOnList(List<T> list, UnaryOperator<T> operator) {
        List<T> result = new ArrayList<>();
        for (T listElement : list) {
            result.add(operator.apply(listElement));
        }
        return result;
    }
}
