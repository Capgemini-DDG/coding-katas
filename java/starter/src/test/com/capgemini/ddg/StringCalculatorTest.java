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
}
