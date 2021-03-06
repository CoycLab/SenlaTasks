package com.github.coyclab.task4;

import com.github.coyclab.utils.Reader;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String line = Reader.read();
        String[] words = getSeparatedWords(line);

        Arrays.sort(words);

        System.out.println(makeString(words));

        System.out.println("Total words: " + words.length);
    }

    private static String[] getSeparatedWords(String line) {
        return line.split("[, ]");
    }

    private static String makeString(String[] array) {
        StringBuilder builder = new StringBuilder();

        for (String item : array) {
            builder.append(item).append("\n");
        }

        return builder.toString();
    }
}
