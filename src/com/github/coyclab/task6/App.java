package com.github.coyclab.task6;

import com.github.coyclab.utils.Reader;

public class App {
    public static void main(String[] args) {

        System.out.println("Enter sides of triangle...");
        try {
            int a = Integer.parseInt(Reader.read());
            int b = Integer.parseInt(Reader.read());
            int c = Integer.parseInt(Reader.read());

            if (checkTriangle(a,b,c)){
                System.out.println("This is rectangular triangle");
            } else {
                System.out.println("This is not rectangular triangle");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Enter correct numbers error");
        }
    }

    private static int sqr(int num) {
        return num * num;
    }

    private static boolean checkTriangle(int a, int b, int c) {
        return sqr(a) + sqr(b) == sqr(c) || sqr(a) + sqr(c) == sqr(b) || sqr(c) + sqr(b) == sqr(a);
    }
}
