package com.df.App;

public class FizzBuzz 
{
	public String inFizz(int i)
	{
		if (i == 0)
			return "0";		
		else if ((i % 3 == 0 && i % 5 == 0) || (Integer.toString(i).contains("5") && Integer.toString(i).contains("3")) || (Integer.toString(i).contains("5") && i % 3 == 0) || (Integer.toString(i).contains("3") && i % 5 == 0))
			return "FizzBuzz";
		else if (i % 5 == 0 || Integer.toString(i).contains("5"))
			return "Buzz";
		else if (i % 3 == 0 || Integer.toString(i).contains("3"))
			return "Fizz";
		else
			return Integer.toString(i);
	}
	
	public void main (String[] args)
	{
		for (int i = 0; i > 101; i++)
			inFizz(i);
	}
}
