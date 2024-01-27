package com.example.uppgift2;

public class IncrementalKata {


    public static int add(String numbers) {
        if (numbers.isEmpty())
            return 0;

        else {
            String[] numArray = numbers.split("[,\n]");

            if(numbers.contains(",\n"))
                throw new IllegalArgumentException("Error: invalid input, contains ',\\n'");

            int sum = 0;
            for (String num : numArray) {
                sum += Integer.parseInt(num);
            }
            return sum;
        }
    }

}
