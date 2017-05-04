package com.capgemini.ddg;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    static String fizzBuzz(int value) {
        String returnValue;
        if (value % 15 == 0) {
            returnValue = "FizzBuzz";
        } else if (value % 3 == 0) {
            returnValue = "Fizz";
        } else if(value % 5 == 0) {
            returnValue = "Buzz";
        } else {
            returnValue = String.valueOf(value);
        }
        return returnValue;
    }

    /**
     * Use Java 8 stream API to iterate over collection of Integers, map each value to the result of
     * a call to the fizzBuzz function (via method reference)
     * and then collect the results in a List.
     * @param numbers
     * @return Collection<String> collection of string values
     */
    static Collection<String> runFizzBuzz(Collection<Integer> numbers) {
        return numbers.stream()
                .map(FizzBuzz::fizzBuzz)
                .collect(Collectors.toList());
    }

    /**
     * Sample main to achieve the original task of printing numbers 1..100
     * and performing the 'Fizz Buzz' calculation, via runFizzBuzz.
     * @param args
     */
    public static void main(String[] args) {
        // Create a simple IntStream with value 1 through to 100
        IntStream numbers = IntStream.range(1, 100);

        // Box the IntStream to a collection of Integer objects ready to pass to runFizzBuzz
        Collection<Integer> numberCollection = numbers.boxed().collect(Collectors.toList());

        // Call the runFizzBuzz function with the collected numberCollection and print the results
        runFizzBuzz(numberCollection).forEach(System.out::println);
    }
}
