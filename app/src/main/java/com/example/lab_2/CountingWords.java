package com.example.lab_2;

public class CountingWords {
    public static int getCharCount(String phrase){
        return phrase.length();
    }
    public static int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = input.length() - 1;
        char[] characters = input.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (Character.isLetter(characters[i]) && i != endOfLine){
                isWord = true;
            } else if (!Character.isLetter(characters[i]) && isWord) {
                wordCount++;
                isWord = false;
            }
            else if (Character.isLetter(characters[i]) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }

}





