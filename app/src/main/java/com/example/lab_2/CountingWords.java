package com.example.lab_2;

public class CountingWords {
    public static int getCharCount(String phrase){
        return phrase.length();
    }
    public static int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.split("\\s+");
        return words.length;
    }
}



