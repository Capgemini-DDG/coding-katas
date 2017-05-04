package com.capgemini.ddg;

import java.util.Collection;
import java.util.stream.Collectors;

public class FizzBuzz {

    static Collection<String> fizzBuzz(Collection<Integer> values) {
        // technique for converting the collection on ints using Java 8 enhancements
        return values.stream().
                map(i -> fizzBuzz(i)).
                collect(Collectors.toList());
    }

    static String fizzBuzz(int value) {
        if ((value % 15) == 0) {
            return "fizzbuzz";
        } else if ((value % 5) == 0) {
            return "buzz";
        } else if ((value % 3) == 0) {
            return "fizz";
        } else {
            return "" + value;
        }
    }

}

