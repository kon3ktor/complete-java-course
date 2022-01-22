package com.expert.lambda.predicate;

import java.util.function.Predicate;

public class LambdaPredicateApp {

    public static void main(String[] args) {
        Predicate<String> moreThan5Letters = text -> text.length() > 5;
        Predicate<String> startsWithWelcome = text -> text.startsWith("Welcome");

        boolean isMoreThan5Letters = moreThan5Letters.test("Welcome");
        System.out.println("The text typed in is longer than 5 letter: " + isMoreThan5Letters);

        boolean isStartsWithWelcome = startsWithWelcome.test("Welcome");
        System.out.println("The text typed in starts with \"Welcome\": " + isStartsWithWelcome);

        boolean isLessThan5Letters = moreThan5Letters.negate().test("Welcome");
        System.out.println("The text typed in is shorter than 5 letter: " + isLessThan5Letters);

        boolean isCombinedAnd = moreThan5Letters.and(startsWithWelcome).test("Welcome");
        System.out.println("The text typed in is longer than 5 letter and starts with \"Welcome\": " + isCombinedAnd);

        boolean isCombinedOr = moreThan5Letters.or(startsWithWelcome).test("Welcom");
        System.out.println("The text typed in is longer than 5 letter or starts with \"Welcome\": " + isCombinedOr);


    }
}
