package com.advanced.innerclasses.staticnested;

import com.advanced.enumcoding.PizzaSize;

public class PizzaBuilderApp {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("Pizza cake", PizzaSize.LARGE)
                .withExtraTomatoSauce(true)
                .withSalad(true)
                .build();
        System.out.println("Name: " + pizza.getName());
        System.out.println("Size: " + pizza.getPizzaSize().getPizzaSizeText());
        System.out.println("Extra tomato sauce: " + pizza.isExtraTomatoSauce());
        System.out.println("Salad: " + pizza.isSalad());
    }
}
