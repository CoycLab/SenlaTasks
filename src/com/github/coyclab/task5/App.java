package com.github.coyclab.task5;

import com.github.coyclab.utils.Reader;

public class App {
    public static void main(String[] args) {
        String text = Reader.read();
        String word = Reader.read();

        String[] textWords = text.split("[ ,]");

        System.out.println("Word count: " + wordCount(word, textWords));
    }

    private static int wordCount(String word, String[] textWords) {
        int count = 0;
        for (final String textWord : textWords) {
            if (textWord.equalsIgnoreCase(word)) {
                count++;
            }
        }

        return count;
    }
}