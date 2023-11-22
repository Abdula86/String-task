package com.gmail.zavsek_o2;

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {
        String[] words = {"orange", "plum", "tomato", "onion", "grape", "onion"};
        removeAndPrint(words, "onion");
    }

    private static void removeAndPrint(String[] words, String wordToRemove) {
        ArrayList<String> updatedWords = new ArrayList<>();
        for (String word : words) {
            if (!word.equals(wordToRemove)) {
                updatedWords.add(word);
            }
        }

        printInColumn(updatedWords);
    }

    private static void printInColumn(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            System.out.println((i + 1) + ") " + words.get(i));
        }
    }
}