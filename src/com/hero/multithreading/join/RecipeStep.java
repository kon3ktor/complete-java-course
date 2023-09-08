package com.hero.multithreading.join;

public class RecipeStep implements Runnable {

    private final String description;
    private final int duration;

    public RecipeStep(String description, int duration) {
        this.description = description;
        this.duration = duration;
    }

    @Override
    public void run() {

        try {
            System.out.println(description);
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
