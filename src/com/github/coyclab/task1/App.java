package com.github.coyclab.task1;

import com.github.coyclab.utils.Reader;

public class App {
    public static void main(String[] args) {
        int number;

        try {
            number = Integer.parseInt(Reader.read());

            System.out.println(checkNumber(number));
        } catch (NumberFormatException ex) {
            System.out.println("Wrong input! Enter correct number...");
        }
    }

    private static String checkNumber(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        if (number <= 0) {
            return "Wrong number! Number must be greater then 0";
        }

        if (number % 2 == 0) {
            stringBuilder.append("Your number is even");
        } else {
            stringBuilder.append("Your number is odd");
        }

        stringBuilder.append("\n");

        if (number == 1) {
            return stringBuilder.append("Your number isn't prime or nonprime").toString();
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return stringBuilder.append("Your number is nonprime").toString();
            }
        }
        return stringBuilder.append("Your number is prime").toString();
    }
}
