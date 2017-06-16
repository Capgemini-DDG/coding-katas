package main;

import java.util.Random;

public class Dice {

	public int score = 0;
	public int first = 0;
	public int second = 0;
	public int third = 0;
	public int fourth = 0;
	public int fifth = 0;
	public int sixth = 0;
	public int doubles = 0;
	public int sequence = 0;
	public int[] intArray;
	public boolean doubling = false;
	public boolean doubling2 = false;
	public Random rand;
	public int max = 6;
	public int min = 1;
	public int in1 = (int) Math.ceil(Math.random() * 6);
	public int in2 = (int) Math.ceil(Math.random() * 6);
	public int in3 = (int) Math.ceil(Math.random() * 6);
	public int in4 = (int) Math.ceil(Math.random() * 6);
	public int in5 = (int) Math.ceil(Math.random() * 6);
	public int in6 = (int) Math.ceil(Math.random() * 6);

	public int input(int[] diceResults) {

		if (diceResults == null) {
			diceResults = new int[] { in1, in2, in3, in4, in5, in6 };
		}

		for (int i = 0; i < diceResults.length; i++) {
			if (diceResults[i] == 1) {
				first += 1;
			} else if (diceResults[i] == 2) {
				second += 1;
			} else if (diceResults[i] == 3) {
				third += 1;
			} else if (diceResults[i] == 4) {
				fourth += 1;
			} else if (diceResults[i] == 5) {
				fifth += 1;
			} else if (diceResults[i] == 6) {
				sixth += 1;
			}
		}

		intArray = new int[] { first, second, third, fourth, fifth, sixth };

		calculation();

		return score;

	}

	public int calculation() {

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == 1) {
				sequence += 1;
			} else if (intArray[i] == 2) {
				doubles += 1;
				if (i == 0) {
					doubling = true;
				} else if (i == 4) {
					doubling2 = true;
				}
			}

			switch (intArray[i]) {

			case 1:
				if (i == 0) {
					score += (i + 1) * 100;
				} else if (i == 4) {
					score += (i + 1) * 10;
				} else {

				}
				break;
			case 2:
				if (i == 0) {
					score += (i + 1) * 200;
				} else if (i == 4) {
					score += (i + 1) * 20;
				} else {

				}
				break;
			case 3:
				if (i == 0) {
					score += (i + 1) * 1000;
				} else {
					score += (i + 1) * 100;
				}
				break;
			case 4:
				if (i == 0) {
					score += (i + 1) * 2000;
				} else {
					score += (i + 1) * 200;
				}
				break;
			case 5:
				if (i == 0) {
					score += (i + 1) * 4000;
				} else {
					score += (i + 1) * 400;
				}
				break;
			case 6:
				if (i == 0) {
					score += (i + 1) * 8000;
				} else {
					score += (i + 1) * 800;
				}
				break;
			}

		}

		if (sequence == 6) {
			score += 1050;
		}

		if (doubles >= 3) {
			if (doubling == true && doubling2 == true) {
				score += 500;
			} else if (doubling == true && doubling2 == false) {
				score += 600;
			} else if (doubling == false && doubling2 == true) {
				score += 700;
			} else if (doubling == false && doubling2 == false) {
				score += 800;
			}
		}

		output();

		return score;
	}

	public void output() {

		System.out.println("");
		System.out.println("Dice 1 is: " + in1);
		System.out.println("");
		System.out.println("Dice 2 is: " + in2);
		System.out.println("");
		System.out.println("Dice 3 is: " + in3);
		System.out.println("");
		System.out.println("Dice 4 is: " + in4);
		System.out.println("");
		System.out.println("Dice 5 is: " + in5);
		System.out.println("");
		System.out.println("Dice 6 is: " + in6);
		System.out.println("");
		System.out.println("Score Is: " + score);
		System.out.println("");
		System.out.println("_____________________________________________________");
		System.out.println("");

	}

}
