package com.capgemini.ddg.numbersinwords;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dev on 27/06/17.
 */
public enum NumberWord {

    ZERO(0, "zero"),
    ONE(1, "one"),
    TWO(2, "two"),
    THREE(3, "three"),
    FOUR(4, "four"),
    FIVE(5, "five"),
    SIX(6, "six"),
    SEVEN(7, "seven"),
    EIGHT(8, "eight"),
    NINE(9, "nine");


    private final int number;
    private final String word;
    private static Map<Integer, NumberWord> map = new HashMap<Integer, NumberWord>();

    NumberWord(int number, String word) {
        this.number = number;
        this.word = word;
    }

    //Allows getting the enum from an integer
    static {
        for (NumberWord numberWord : NumberWord.values()) {
            map.put(numberWord.number, numberWord);
        }
    }

    public static NumberWord valueOf(int wantedNumber) {
        return map.get(wantedNumber);
    }

    public int getNumber() {
        return number;
    }

    public String getWord() {
        return word;
    }
}
