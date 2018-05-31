package com.github.coyclab.task5;

import com.github.coyclab.utils.Reader;
import com.sun.org.apache.xpath.internal.SourceTree;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter text...");
        String text = Reader.read();

        System.out.println("Please enter word...");
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