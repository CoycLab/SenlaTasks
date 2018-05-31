package com.github.coyclab.task10;

import com.github.coyclab.utils.Reader;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        System.out.println("Please enter three numbers...");

        try {
            int a = Integer.parseInt(Reader.read());
            int b = Integer.parseInt(Reader.read());
            int c = Integer.parseInt(Reader.read());

            if (isCorrectInput(a) && isCorrectInput(b) && isCorrectInput(c)) {
                Set<Integer> set = makeCombinations(a, b, c);
                DecimalFormat df = new DecimalFormat("000");

                for (int item : set) {
                    System.out.println(df.format(item));
                }

            } else {
                throw new NumberFormatException();
            }

        } catch (NumberFormatException e) {
            System.out.println("Please enter correct numbers");
        }
    }

    private static boolean isCorrectInput(int a) {
        return !((a < 0 || a > 9));
    }

    private static Set<Integer> makeCombinations(int a, int b, int c) {
        List<Integer> tempList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        tempList.add(a);
        tempList.add(b);
        tempList.add(c);

        for (int i = 0; i < tempList.size(); i++) {
            for (int j = 0; j < tempList.size(); j++) {
                for (int k = 0; k < tempList.size(); k++) {
                    set.add(createNum(tempList.get(i), tempList.get(j), tempList.get(k)));
                }
            }
        }

        return set;
    }

    private static Integer createNum(int i, int j, int k) {
        return i * 100 + j * 10 + k;
    }
}
