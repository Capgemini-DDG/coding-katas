package com.capgemini.ddg;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Unit test for StringCalculator application.
 */
public class StringCalculatorTest {

    @Test
    public void testEmptyString() {
        Assert.assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void test1Number() {
        Assert.assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void test2Numbers() {
        Assert.assertEquals(2, StringCalculator.add("1,1"));
    }

    @Test
    public void test2NumbersWithWhitespace() {
        Assert.assertEquals(2, StringCalculator.add("1, 1"));
    }

    @Test
    public void test3Numbers() {
        Assert.assertEquals(3, StringCalculator.add("1, 1,1"));
    }

    @Test
    public void test4Numbers() {
        Assert.assertEquals(4, StringCalculator.add("1, 1,1,1"));
    }

    @Test
    public void testWith1NumberAndNewlineCharacter() {
        Assert.assertEquals(1, StringCalculator.add("1,\n"));
    }

    @Test
    public void testWith2NumberAndNewlineCharacter() {
        Assert.assertEquals(2, StringCalculator.add("1,\n,1"));
    }

    @Test
    public void testWith2NumbersWithSemicolon() {
        Assert.assertEquals(2, StringCalculator.add("1;1"));
    }
}
