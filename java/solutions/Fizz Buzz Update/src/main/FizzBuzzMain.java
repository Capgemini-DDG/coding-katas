package main;

import java.util.ArrayList;

public class FizzBuzzMain {

	String output;
	int i;
	@SuppressWarnings("rawtypes")
	ArrayList Results;
	Object ReturnResult;

	public String result(int input) {

		i = input;

		if (i % 5 == 0 && i % 3 == 0 || String.valueOf(i).contains("3") && String.valueOf(i).contains("5")
				|| String.valueOf(i).contains("3") && i % 5 == 0 || String.valueOf(i).contains("5") && i % 3 == 0) {
			System.out.println("FizzBuzz");
			output = "FizzBuzz";
		}

		else if (i % 3 == 0 || String.valueOf(i).contains("3")) {
			System.out.println("Fizz");
			output = "Fizz";
		}

		else if (i % 5 == 0 || String.valueOf(i).contains("5")) {
			System.out.println("Buzz");
			output = "Buzz";
		}

		else {
			System.out.println(i);
			output = "Null";
		}

		return output;
	}

	public void Loop() {

		for (i = 1; i <= 100; i++) {
			result(i);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object experiment(int value) {

		Results = new ArrayList();

		for (i = value; i <= 100; i++) {
			if (i % 5 == 0 && i % 3 == 0 || String.valueOf(i).contains("3") && String.valueOf(i).contains("5")
					|| String.valueOf(i).contains("3") && i % 5 == 0 || String.valueOf(i).contains("5") && i % 3 == 0) {
				System.out.println("FizzBuzz");
				output = "FizzBuzz";
				Results.add(output);
			}

			else if (i % 3 == 0 || String.valueOf(i).contains("3")) {
				System.out.println("Fizz");
				output = "Fizz";
				Results.add(output);
			}

			else if (i % 5 == 0 || String.valueOf(i).contains("5")) {
				System.out.println("Buzz");
				output = "Buzz";
				Results.add(output);
			}

			else {
				System.out.println(i);
				output = "Null";
				Results.add(output);
			}
		}

		ReturnResult = Results.get(0);

		return ReturnResult;
	}

}
