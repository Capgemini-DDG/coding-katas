package main;

public class FizzBuzzMain {

	String output;
	int i;

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

	public String experiment(int value) {

		for (i = value; i <= 100; i++) {
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
		}
		return output;
	}

}
