package com.capgemini.ddg;

public class StringCalculator {

    static int sum(String numbers) {
        if( numbers.isEmpty() ) {
            return 0;
        } else {
            return Integer.parseInt(numbers);
        }
    }
}
