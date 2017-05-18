package com.capgemini.ddg;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculator {

    static int add(String numbers) {
        if( numbers.isEmpty() ) {
            return 0;
        } else {
            return splitString(numbers).reduce(0, (i1, i2) -> i1 + i2);
        }
    }

    private static Stream<Integer> splitString(String numbers) {
        return Arrays.stream(numbers.split("[,\n]")).
                map( i -> Integer.parseInt(i));
    }
}
