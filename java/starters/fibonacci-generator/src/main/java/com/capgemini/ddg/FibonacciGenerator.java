package com.capgemini.ddg;

public class FibonacciGenerator 
{
	static int fibonacciNumber = 0;
	
	public static int generate(int input)
	{		
//		if (input == 6)
//			return input + 2;
//		else if (input <= 1 || input >= 5)
//			return input;
//		else
//			return input - 1;
		
		if (input == 0)
			return 0;
		else if (input == 1)
			return 1;
		else
			return generate(input-1) + generate(input-2);
	}
}
