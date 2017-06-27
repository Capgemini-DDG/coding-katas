package com.capgemini.ddg.numbersinwords;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by dev on 27/06/17.
 */
public class NumbersInWordsTest {

    @Test
    public void testZero() {
        Assert.assertEquals("zero", NumbersInWords.convertNumbersToWords(0));
    }

    @Test
    public void testOne() {
        Assert.assertEquals("one", NumbersInWords.convertNumbersToWords(1));
    }

    @Test
    public void testTwoToNine() {
        Assert.assertEquals("two", NumbersInWords.convertNumbersToWords(2));
        Assert.assertEquals("three", NumbersInWords.convertNumbersToWords(3));
        Assert.assertEquals("four", NumbersInWords.convertNumbersToWords(4));
        Assert.assertEquals("five", NumbersInWords.convertNumbersToWords(5));
        Assert.assertEquals("six", NumbersInWords.convertNumbersToWords(6));
        Assert.assertEquals("seven", NumbersInWords.convertNumbersToWords(7));
        Assert.assertEquals("eight", NumbersInWords.convertNumbersToWords(8));
        Assert.assertEquals("nine", NumbersInWords.convertNumbersToWords(9));
    }

}