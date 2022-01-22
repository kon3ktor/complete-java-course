package com.advanced.finalpractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GameService {

    private static final String SRC_COM_ADVANCED_FINAL_PRACTICE_WORD_TXT = "src/com/advanced/finalpractice/words.txt";

    public void start() throws FileNotFoundException {
        Scanner inputScanner = new Scanner(System.in);
        String randomWord = getRandomWord();
        char[] randomWordArray = randomWord.toCharArray();
        char[] guessingArray = new char[randomWord.length()];
        Arrays.fill(guessingArray, '_');
        int numberOfChances = randomWord.length();

        System.out.println("Starting the game");
        System.out.println("The length of the word and the number of chances: " + numberOfChances);
        System.out.println("The word: " + new String(guessingArray));

        while (true) {
            System.out.println("-------------------------------------");
            System.out.print("Please type in a letter: ");
            String inputLine = inputScanner.nextLine().toLowerCase();
            char letter = inputLine.charAt(0);

            boolean isGuessingCorrect = false;
            for (int i = 0; i < randomWord.length(); i++) {
                if (letter == randomWordArray[i]) {
                    guessingArray[i] = letter;
                    isGuessingCorrect = true;
                }
            }

            if (isGuessingCorrect) {
                System.out.println("It was a good guess.");
                if (isGameFinished(guessingArray)) {
                    break;
                }
            } else {
                numberOfChances--;
                if (numberOfChances == 0) {
                    System.out.println("Sorry you ran out of chances.");
                    System.out.println("The word was: " + randomWord);
                    break;
                }
                System.out.println("Your number of chances is decreased to: " + numberOfChances);
                System.out.println("Try another letter!");
            }
            System.out.println("The word: " + new String(guessingArray));
        }
    }

    private boolean isGameFinished(char[] guessingArray) {
        for (int i = 0; i < guessingArray.length; i++) {
            if (guessingArray[i] == '_') {
                return false;
            }
        }

        System.out.println("Congratulation you won!");
        System.out.println("The word: " + new String(guessingArray));
        return true;
    }

    private String getRandomWord() throws FileNotFoundException {
        List<String> words = getTheWords();
        Random randomNumberGenerator = new Random();
        int randomIndex = randomNumberGenerator.nextInt(words.size());

        return words.get(randomIndex);
    }

    private List<String> getTheWords() throws FileNotFoundException {
        List<String> words = new ArrayList<>();

        File wordsFile = new File(SRC_COM_ADVANCED_FINAL_PRACTICE_WORD_TXT);
        Scanner wordScanner = new Scanner(wordsFile);
        while (wordScanner.hasNextLine()) {
            words.add(wordScanner.nextLine());
        }

        return words;
    }
}