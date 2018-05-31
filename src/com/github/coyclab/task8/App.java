package com.github.coyclab.task8;

import com.github.coyclab.utils.Reader;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Input number from 0 to 100!");

        try {
            int n = Integer.parseInt(Reader.read());

            List<Integer> palindromNums = new ArrayList<>();

            if (n < 0 || n > 100) {
                System.out.println("Wrong input!!!");
            } else {
                for (int i = 0; i < n; i++) {
                    if (isPalindromNum(i)) {
                        palindromNums.add(i);
                    }
                }
            }

            System.out.println(getStringFromList(palindromNums));

        } catch (NumberFormatException ex) {
            System.out.println("Input error!!!");
        }
    }

    private static boolean isPalindromNum(int number) {
        if (number < 10) {
            return true;
        }

        int firstNum = number % 10;
        int secondNum = number / 10;
        return firstNum == secondNum;
    }

    private static String getStringFromList(List list) {
        StringBuilder builder = new StringBuilder();

        for (Object item : list) {
            builder.append(item).append(" ");
        }

        return builder.toString();
    }
}
