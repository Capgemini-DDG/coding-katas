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

    /**
     * Converts numbers into their equivalent words.
     * @param numberToConvert
     * @return
     */
    public static String convertNumbersToWords(int numberToConvert) {

        StringBuilder sb = new StringBuilder();

        String numberAsString = String.valueOf(numberToConvert);
        Integer numberOfDigits = numberAsString.length();
        Integer remainingDigits = numberOfDigits;

        for (int i = 0; i < numberOfDigits; i++) {
            String currentDigit = numberAsString.substring(i, i +1);

            switch (remainingDigits) {
                case 1:
                    // don't add zero to numbers that aren't zero (e.g. don't return "ten zero" for the number 10)
                    if (numberOfDigits == 1 || (numberOfDigits > 1 && !currentDigit.equals("0"))) {
                        sb = sb.append(NumberWord.valueOf(Integer.valueOf(currentDigit)).getWord());
                    }
                    break;
                case 2:
                    //special cases for teens.
                    if (currentDigit.startsWith("1")) {
                        String currentValue = numberAsString.substring(i);
                        sb = sb.append(NumberWord.valueOf(Integer.valueOf(currentValue)).getWord());
                        return sb.toString();
                    } else if (currentDigit.startsWith("0")) {
                        //do nothing
                    }
                    else {
                        String currentValue = currentDigit + "0";
                        sb = sb.append(NumberWord.valueOf(Integer.valueOf(currentValue)).getWord());
                    }
                    break;
                case 3:
                    if (currentDigit.startsWith("0")) {
                        //do nothing
                    }
                    else {
                        sb = sb.append(NumberWord.valueOf(Integer.valueOf(currentDigit)).getWord());
                        sb = sb.append(" " + NumberWord.HUNDRED.getWord());
                        String nextValue = numberAsString.substring(i+1);
                        if (!nextValue.equals("00")) {
                            sb = sb.append(" and");
                        }
                    }
                    break;
                case 4:
                    if (currentDigit.startsWith("0")) {
                        //do nothing
                    }
                    else {
                        sb = sb.append(NumberWord.valueOf(Integer.valueOf(currentDigit)).getWord());
                        sb = sb.append(" " + NumberWord.THOUSAND.getWord());
                        String nextValue = numberAsString.substring(i+1);
                        if (!nextValue.equals("000") && nextValue.startsWith("0")) {
                            sb = sb.append(" and");
                        }
                    }
                    break;
                default:

                    break;

            }
            //add a space if it is not a zero.
            if (!currentDigit.startsWith("0")) {
                sb.append(" ");
            }
            remainingDigits--;
        }

        return sb.toString().trim();
    }

    /**
     * Changes words into equivalent numbers.
     * @param words
     * @return
     */
    public static int convertWordsToNumbers(String words) {

        int number = NumberWord.valueOf(words.toUpperCase()).getNumber();

        return number;
    }
}
