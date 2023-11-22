package com.gmail.zavsek_o2;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        String[] words = {"brange", "plum", "tomato", "onibn", "grape"};
        correctAndPrint(words);
    }

    private static void correctAndPrint(String[] words) {
        ArrayList<String> correctedWords = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String correctedWord = correctWord(words[i]);
            correctedWords.add(correctedWord);
        }

        printInColumn(correctedWords);
    }

    private static String correctWord(String word) {
        StringBuilder correctedWord = new StringBuilder(word);
        int index = correctedWord.indexOf("onibn");
        if (index != -1) {
            correctedWord.replace(index, index + "onibn".length(), "onion");
        }
        return correctedWord.toString();
    }

    private static void printInColumn(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            System.out.println((i + 1) + ") " + words.get(i));
        }
    }
}