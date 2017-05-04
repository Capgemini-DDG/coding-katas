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
    public void testFizzValues() {
        Assert.assertEquals("fizz", FizzBuzz.fizzBuzz(3));
        Assert.assertEquals("fizz", FizzBuzz.fizzBuzz(6));
        Assert.assertEquals("fizz", FizzBuzz.fizzBuzz(27));
    }

    @Test
    public void testBuzzValues() {
        Assert.assertEquals("buzz", FizzBuzz.fizzBuzz(5));
        Assert.assertEquals("buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void testFizzBuzzValues() {
        Assert.assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(15));
        Assert.assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(30));
    }

    @Test
    public void testOtherValues() {
        Assert.assertEquals("1", FizzBuzz.fizzBuzz(1));
    }

    @Test
    public void testCollection1() {
        Collection<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
        Collection<String> expected = Arrays.asList("1", "2", "fizz", "4", "buzz");
        Assert.assertEquals(expected, FizzBuzz.fizzBuzz(values));
    }

    @Test
    public void testCollection2() {
        Collection<Integer> values = Arrays.asList(1, 3, 5, 8, 9, 10, 12, 13, 15, 20);
        Collection<String> expected = Arrays.asList("1", "fizz", "buzz", "8", "fizz", "buzz", "fizz", "13", "fizzbuzz", "buzz");
        Assert.assertEquals(expected, FizzBuzz.fizzBuzz(values));
    }

}
