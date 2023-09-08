package com.hero.multithreading.join;

public class JoinApp {

    public static void main(String[] args) {
        RecipeStep onion = new RecipeStep("Dice 2 onions!", 2000);
        RecipeStep tomato = new RecipeStep("Dice 2 tomatoes!", 2000);
        RecipeStep pan = new RecipeStep("Get a pan and start frying the diced onion!", 2000);
        RecipeStep water = new RecipeStep("Boil 1L of water!", 10000);
        RecipeStep pasta = new RecipeStep("Put the pasta into the boiling water!", 500);

        Thread onionThread = new Thread(onion);
        Thread tomatoThread = new Thread(tomato);
        Thread panThread = new Thread(pan);
        Thread waterThread = new Thread(water);
        Thread pastaThread = new Thread(pasta);

        try {
            onionThread.start();
            onionThread.join();
            tomatoThread.start();
            tomatoThread.join();
            panThread.start();
            waterThread.start();
            waterThread.join();
            pastaThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
