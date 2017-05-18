package com.capgemini.ddg;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Unit test for FizzBuzz application.
 */
public class StringCalculatorTest {

    @Test
    public void testEmpty() {
        assertEquals(0, StringCalculator.sum(""));
    }

    @Test
    public void testSingleNumber() {
        assertEquals(2, StringCalculator.sum("2"));
        assertEquals(5, StringCalculator.sum("5"));
        assertEquals(10, StringCalculator.sum("10"));
        assertEquals(15, StringCalculator.sum("15"));
    }

    @Test
    public void testTwoNumbers() {
        assertEquals(5, StringCalculator.sum("2,3"));
        assertEquals(10, StringCalculator.sum("1,9"));
    }

    @Test
    public void testMoreNumbers() {
        assertEquals(15, StringCalculator.sum("1,2,3,4,5"));
    }

    @Test
    public void testWithNewLineDelimiter() {
        assertEquals(15, StringCalculator.sum("1\n2\n3\n4\n5"));
    }

}