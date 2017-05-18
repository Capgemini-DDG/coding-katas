package com.capgemini.ddg;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculator {

    static int sum(String numbers) {
        if( numbers.isEmpty() ) {
            return 0;
        } else {
            Stream<String> sNums = Arrays.stream(numbers.split(","));
            Stream<Integer> iNums = sNums.map( i -> Integer.parseInt(i));
            return iNums.reduce(0, (i1, i2) -> i1 + i2);
        }
    }
}
