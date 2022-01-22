package com.advanced.finalpractice;

import java.io.FileNotFoundException;

public class HangmanApp {

    public static void main(String[] args) throws FileNotFoundException {
        GameService gameService = new GameService();
        gameService.start();


    }

}
