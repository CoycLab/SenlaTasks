package com.github.coyclab.task3;

import com.github.coyclab.utils.Reader;

public class App {
    public static void main(String[] args) {
        String word = Reader.read();

        if (word.length() <= 1) {
            System.out.println("Enter correct word!");
        } else {
            if (isPalindrom(word)){
                System.out.println("This word is palindrome");
            } else{
                System.out.println("This word isn't palindrome");
            }
        }
    }

    private static boolean isPalindrom(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
