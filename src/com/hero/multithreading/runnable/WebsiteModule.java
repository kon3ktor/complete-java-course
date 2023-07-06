package com.hero.multithreading.runnable;

public class WebsiteModule implements Runnable {

    private String moduleName;

    public WebsiteModule(String moduleName) {
        this.moduleName = moduleName;
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println( moduleName + " module will be loaded in " + i + "sec.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
