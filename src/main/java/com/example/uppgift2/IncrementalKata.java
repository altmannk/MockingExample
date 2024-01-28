package com.example.uppgift2;

import java.util.regex.Pattern;

public class IncrementalKata {


    public static int add(String numbers) {
        if (numbers.isEmpty())
            return 0;

        String delimiter = "[,|\n]";
        if (numbers.startsWith("//")) {
            int delStartIndex = numbers.indexOf("//") + 2;
            int delEndIndex = numbers.indexOf("\n");
            String customDelimiter = numbers.substring(delStartIndex, delEndIndex);
            delimiter = "[" + Pattern.quote(customDelimiter) + "|\n]";
            numbers = numbers.substring(delEndIndex + 1);
        }

        String[] numArray = numbers.split(delimiter);

        if (numbers.contains(",\n"))
            throw new IllegalArgumentException("Error: invalid input, contains ',\\n'");

        StringBuilder negativeNumbers = new StringBuilder();
        for (String element : numArray) {
            if (element.startsWith("-"))
                negativeNumbers.append(element).append(",");
        }
        if (numbers.contains("-"))
            throw new IllegalArgumentException("negatives not allowed " + negativeNumbers);

        int sum = 0;
        for (String element : numArray) {
            if (!element.isEmpty()) {
                int num = Integer.parseInt(element);
                if (num > 1000)
                    num = 0;
                sum += num;
            }
        }

        return sum;
    }
}
