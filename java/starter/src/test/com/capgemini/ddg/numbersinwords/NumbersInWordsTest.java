package com.capgemini.ddg.numbersinwords;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by dev on 27/06/17.
 */
public class NumbersInWordsTest {

    // converting numbers into words
    @Test
    public void testNumberZero() {
        Assert.assertEquals("zero", NumbersInWords.convertNumbersToWords(0));
    }

    @Test
    public void testNumberOne() {
        Assert.assertEquals("one", NumbersInWords.convertNumbersToWords(1));
    }

    @Test
    public void testNumbersTwoToNine() {
        Assert.assertEquals("two", NumbersInWords.convertNumbersToWords(2));
        Assert.assertEquals("three", NumbersInWords.convertNumbersToWords(3));
        Assert.assertEquals("four", NumbersInWords.convertNumbersToWords(4));
        Assert.assertEquals("five", NumbersInWords.convertNumbersToWords(5));
        Assert.assertEquals("six", NumbersInWords.convertNumbersToWords(6));
        Assert.assertEquals("seven", NumbersInWords.convertNumbersToWords(7));
        Assert.assertEquals("eight", NumbersInWords.convertNumbersToWords(8));
        Assert.assertEquals("nine", NumbersInWords.convertNumbersToWords(9));
    }

    @Test
    public void testNumberTen() {
        Assert.assertEquals("ten", NumbersInWords.convertNumbersToWords(10));
    }

    @Test
    public void testNumberElevenToNineteen() {
        Assert.assertEquals("eleven", NumbersInWords.convertNumbersToWords(11));
        Assert.assertEquals("twelve", NumbersInWords.convertNumbersToWords(12));
        Assert.assertEquals("thirteen", NumbersInWords.convertNumbersToWords(13));
        Assert.assertEquals("fourteen", NumbersInWords.convertNumbersToWords(14));
        Assert.assertEquals("fifteen", NumbersInWords.convertNumbersToWords(15));
        Assert.assertEquals("sixteen", NumbersInWords.convertNumbersToWords(16));
        Assert.assertEquals("seventeen", NumbersInWords.convertNumbersToWords(17));
        Assert.assertEquals("eighteen", NumbersInWords.convertNumbersToWords(18));
        Assert.assertEquals("nineteen", NumbersInWords.convertNumbersToWords(19));
    }

    @Test
    public void testNumberTwenty() {
        Assert.assertEquals("twenty", NumbersInWords.convertNumbersToWords(20));
    }

    @Test
    public void testNumberTwentyOneToNinetyNine() {
        Assert.assertEquals("twenty one", NumbersInWords.convertNumbersToWords(21));
        Assert.assertEquals("thirty two", NumbersInWords.convertNumbersToWords(32));
        Assert.assertEquals("forty three", NumbersInWords.convertNumbersToWords(43));
        Assert.assertEquals("fifty four", NumbersInWords.convertNumbersToWords(54));
        Assert.assertEquals("sixty five", NumbersInWords.convertNumbersToWords(65));
        Assert.assertEquals("seventy six", NumbersInWords.convertNumbersToWords(76));
        Assert.assertEquals("eighty seven", NumbersInWords.convertNumbersToWords(87));
        Assert.assertEquals("ninety eight", NumbersInWords.convertNumbersToWords(98));
        Assert.assertEquals("ninety nine", NumbersInWords.convertNumbersToWords(99));
    }

    @Test
    public void testNumberOneHundred() {
        Assert.assertEquals("one hundred", NumbersInWords.convertNumbersToWords(100));
    }

    @Test
    public void testNumberOneHundredAndOneToNineHundredAndNinetyNine() {
        Assert.assertEquals("one hundred and one", NumbersInWords.convertNumbersToWords(101));
        Assert.assertEquals("two hundred and twelve", NumbersInWords.convertNumbersToWords(212));
        Assert.assertEquals("three hundred and twenty three", NumbersInWords.convertNumbersToWords(323));
        Assert.assertEquals("four hundred and thirty four", NumbersInWords.convertNumbersToWords(434));
        Assert.assertEquals("five hundred and forty five", NumbersInWords.convertNumbersToWords(545));
        Assert.assertEquals("six hundred and fifty six", NumbersInWords.convertNumbersToWords(656));
        Assert.assertEquals("seven hundred and sixty seven", NumbersInWords.convertNumbersToWords(767));
        Assert.assertEquals("eight hundred and seventy eight", NumbersInWords.convertNumbersToWords(878));
        Assert.assertEquals("nine hundred and eighty nine", NumbersInWords.convertNumbersToWords(989));
        Assert.assertEquals("nine hundred and ninety nine", NumbersInWords.convertNumbersToWords(999));
    }

    @Test
    public void testNumberOneThousand() {
        Assert.assertEquals("one thousand", NumbersInWords.convertNumbersToWords(1000));
    }

    @Test
    public void testNumberOneThousandAndOne() {
        Assert.assertEquals("one thousand and one", NumbersInWords.convertNumbersToWords(1001));
        Assert.assertEquals("one thousand and twelve", NumbersInWords.convertNumbersToWords(1012));
        Assert.assertEquals("one thousand one hundred and twenty three", NumbersInWords.convertNumbersToWords(1123));
        Assert.assertEquals("one thousand two hundred and thirty four", NumbersInWords.convertNumbersToWords(1234));
        Assert.assertEquals("one thousand three hundred and forty five", NumbersInWords.convertNumbersToWords(1345));
        Assert.assertEquals("one thousand four hundred and fifty six", NumbersInWords.convertNumbersToWords(1456));
        Assert.assertEquals("one thousand five hundred and sixty seven", NumbersInWords.convertNumbersToWords(1567));
        Assert.assertEquals("one thousand six hundred and seventy eight", NumbersInWords.convertNumbersToWords(1678));
        Assert.assertEquals("one thousand seven hundred and eighty nine", NumbersInWords.convertNumbersToWords(1789));
        Assert.assertEquals("one thousand eight hundred and thirty eight", NumbersInWords.convertNumbersToWords(1838));
        Assert.assertEquals("one thousand nine hundred and ninety nine", NumbersInWords.convertNumbersToWords(1999));
    }

    //Converting words into numbers
    @Test
    public void testWordZero() {
        Assert.assertEquals(0, NumbersInWords.convertWordsToNumbers("zero"));
    }

    @Test
    public void testWordOne() {
        Assert.assertEquals(1, NumbersInWords.convertWordsToNumbers("one"));
    }

    @Test
    public void testWordsTwoToNine() {
        Assert.assertEquals(2, NumbersInWords.convertWordsToNumbers("two"));
        Assert.assertEquals(3, NumbersInWords.convertWordsToNumbers("three"));
        Assert.assertEquals(4, NumbersInWords.convertWordsToNumbers("four"));
        Assert.assertEquals(5, NumbersInWords.convertWordsToNumbers("five"));
        Assert.assertEquals(6, NumbersInWords.convertWordsToNumbers("six"));
        Assert.assertEquals(7, NumbersInWords.convertWordsToNumbers("seven"));
        Assert.assertEquals(8, NumbersInWords.convertWordsToNumbers("eight"));
        Assert.assertEquals(9, NumbersInWords.convertWordsToNumbers("nine"));
    }

}