package com.github.coyclab.task2;

import com.github.coyclab.utils.Reader;

public class App {
    public static void main(String[] args) {
        int num1;
        int num2;

        try {
            final StringBuilder builder = new StringBuilder();
            System.out.println("Input first number:");
            num1 = Integer.parseInt(Reader.read());

            System.out.println("Input second number:");
            num2 = Integer.parseInt(Reader.read());

            builder.append("sum = ").append(num1 + num2).append("\n");
            builder.append("diff = ").append(num1 - num2).append("\n");

            builder.append("gcb = ").append(gcd(num1, num2)).append("\n");
            builder.append("lcm = ").append(lcm(num1, num2)).append("\n");

            System.out.println(builder);
        } catch (NumberFormatException ex) {
            System.out.println("ERROR");
        }
    }

    private static int gcd(int num1, int num2) {
        return num2 == 0 ? num1 : gcd(num2, num1 % num2);
    }

    private static int lcm(int num1, int num2) {
        return num1 / gcd(num1, num2) * num2;
    }
}
