package com.capgemini.ddg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Greed {

    private Integer[][] tripleSingleScore = new Integer[][]{ {1, 1, 1 } , {1000} };
    private Integer[][] tripleTwoScore = new Integer[][]{ {2, 2, 2 }, {200} };
    private Integer[][] tripleThreeScore = new Integer[][]{ {3, 3, 3}, {300} };
    private Integer[][] tripleFourScore = new Integer[][]{ {4, 4, 4}, {400}};
    private Integer[][] tripleFiveScore = new Integer[][]{ {5, 5, 5}, {500}};
    private Integer[][] tripleSixScore = new Integer[][]{ {6, 6, 6}, {600}};

    private List<Integer[][]> diceCombinations;

    Integer score(Integer[] dice) {
        buildDiceScores();
        int result = 0;
        if (dice.length == 1) {
            result = checkSingleScore(dice);
        } else if(dice.length == 3) {
            result = checkTripleScore(dice);
        }
        return result;
    }

    private void buildDiceScores() {
        diceCombinations = new ArrayList<Integer[][]>();
        diceCombinations.add(tripleSingleScore);
        diceCombinations.add(tripleTwoScore);
        diceCombinations.add(tripleThreeScore);
        diceCombinations.add(tripleFourScore);
        diceCombinations.add(tripleFiveScore);
        diceCombinations.add(tripleSixScore);
    }

    private int checkTripleScore(Integer[] dice) {
        int result = 0;
        for (Integer[][] diceCombinations : diceCombinations) {
            if(Arrays.equals(dice, diceCombinations[0])) {
                result = diceCombinations[1][0];
            }
        }
        return result;
    }

    private int checkSingleScore(Integer[] dice) {
        int result = 0;
        int diceValue = dice[0];
        switch (diceValue) {
            case 1:
                result = 100;
                break;
            case 3:
                result = 30;
                break;
            case 5:
                result = 50;
                break;
        }
        return result;
    }
}
