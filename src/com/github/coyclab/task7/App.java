package com.github.coyclab.task7;

import com.github.coyclab.utils.Reader;

import java.util.Random;

public class App {
    private static final int MIN_NUMBER = 10;
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {

        int size = 0;

        try {
            size = Integer.parseInt(Reader.read());
        } catch (NumberFormatException e) {
            System.out.println("Wrong array size!");
        }

        int[] array = generateRandomArray(size);

        System.out.println(getArrayLine(array));

        System.out.println("MIN = " + getMinItem(array));
        System.out.println("MAX = " + getMaxItem(array));
    }

    private static String getArrayLine(int[] array) {
        StringBuilder builder = new StringBuilder();

        for (final int item : array) {
            builder.append(item).append(" ");
        }

        return builder.toString();
    }

    private static int getMinItem(int[] array) {
        int min = array[0];

        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }

    private static int getMaxItem(int[] array) {
        int max = array[0];

        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    private static int[] generateRandomArray(int size) {
        final int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = getRandomInt();
        }

        return array;
    }

    private static int getRandomInt() {
        Random random = new Random();

        return random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }
}
