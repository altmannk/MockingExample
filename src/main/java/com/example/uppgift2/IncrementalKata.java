package com.example.uppgift2;

public class IncrementalKata {


    public static int add(String numbers) {
        if (numbers.isEmpty())
            return 0;

        int commaIndex = numbers.indexOf(",");
        if (commaIndex == -1) {
            return Integer.parseInt(numbers);
        }

        String num1 = numbers.substring(0, commaIndex);
        String num2 = numbers.substring(commaIndex + 1);
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);

        return x + y;
    }

}
