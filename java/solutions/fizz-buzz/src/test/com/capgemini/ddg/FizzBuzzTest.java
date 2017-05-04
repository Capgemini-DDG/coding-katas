package com.capgemini.ddg;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

/**
 * Unit test for FizzBuzz application.
 */
public class FizzBuzzTest {

    @Test
    public void testFizz() {
        Assert.assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        Assert.assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
        Assert.assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    @Test
    public void testBuzz() {
        Assert.assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        Assert.assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void testFizzBuzz() {
        Assert.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        Assert.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
        Assert.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(45));
    }

    @Test
    public void testNumbers() {
        Assert.assertEquals("1", FizzBuzz.fizzBuzz(1));
        Assert.assertEquals("52", FizzBuzz.fizzBuzz(52));
    }

    @Test
    public void testRunFizzBuzzWith100() {
        Collection<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 15);
        Collection<String> results = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "FizzBuzz");

        Assert.assertEquals(results, FizzBuzz.runFizzBuzz(numbers));
    }
}
