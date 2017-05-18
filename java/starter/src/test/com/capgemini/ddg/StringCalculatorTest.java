package com.capgemini.ddg;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for FizzBuzz application.
 */
public class StringCalculatorTest {

    @Test
    public void testEmpty() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void testSingleNumber() {
        assertEquals(2, StringCalculator.add("2"));
        assertEquals(5, StringCalculator.add("5"));
        assertEquals(10, StringCalculator.add("10"));
        assertEquals(15, StringCalculator.add("15"));
    }

    @Test
    public void testTwoNumbers() {
        assertEquals(5, StringCalculator.add("2,3"));
        assertEquals(10, StringCalculator.add("1,9"));
    }

    @Test
    public void testMoreNumbers() {
        assertEquals(15, StringCalculator.add("1,2,3,4,5"));
    }

    @Test
    public void testWithNewLineDelimiter() {
        assertEquals(15, StringCalculator.add("1\n2\n3\n4\n5"));
    }

}