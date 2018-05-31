package com.github.coyclab.task9;

import com.github.coyclab.utils.Reader;

public class App {
    public static void main(String[] args) {
        try {
            StringBuilder builder = new StringBuilder();

            System.out.println("Please enter N");
            int n = Integer.parseInt(Reader.read());

            int sum = 0;
            for (int i = 0; i < n; i += 2) {
                builder.append(i).append(" ");
                sum += i;
            }
            builder.append("\n")
                    .append(sum);

            System.out.println(builder);
        } catch (NumberFormatException ex) {
            System.out.println("Error input");
        }
    }
}
