package com.example.uppgift2;

public class IncrementalKata {


    public static int add(String numbers) {
        if (numbers.isEmpty())
            return 0;

        String delimiter = "[,|\n]";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 1);
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
            int num = Integer.parseInt(element);
            sum += num;
        }

        return sum;
    }
}
