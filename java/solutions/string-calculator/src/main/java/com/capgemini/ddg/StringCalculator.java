package com.capgemini.ddg;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculator {

    public static int add(String numbers) {
        Integer result;
        if(numbers.isEmpty()) {
            result = 0;
        } else {
            result = processAndCalculateNumbers(numbers);
        }
        return result;
    }

    private static Integer processAndCalculateNumbers(String numbers) {
        return createNumberStream(numbers)
                .filter(num -> !num.isEmpty())
                .map(num -> Integer.valueOf(num.trim()))
                .mapToInt(Integer::intValue)
                .sum();
    }

    private static Stream<String> createNumberStream(String numbers) {
        String cleanNumbers = numbers.replace("\n", "");
        return Arrays.stream(cleanNumbers.split(",|;"));
    }
}
