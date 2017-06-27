package com.capgemini.ddg.numbersinwords;

/**
 * Problem Description
 * It occurs now and then in real life that people want to write about money, especially about a certain amount of money.
 * If it comes to cheques or contracts for example some nations have laws that state that you should write out the amount
 * in words additionally to the amount in numbers to avoid fraud and mistakes. So if you want to transfer 745 \$ to someone
 * via cheque you have to fill out to fields:
 * 745.00 \$ (amount in numbers)
 * seven hundred and forty five dollars (amount in words)
 * Step 1
 * The Kata is now to write a little converter class or function (depends on your favourite language and flavour) to
 * convert numbers into words.
 * Step 2
 * Convert it back.
 */
public class NumbersInWords {

    public static String convertNumbersToWords(int number) {

        StringBuilder sb = new StringBuilder();
        sb = sb.append(NumberWord.valueOf(number).getWord());

        return sb.toString();
    }
}
