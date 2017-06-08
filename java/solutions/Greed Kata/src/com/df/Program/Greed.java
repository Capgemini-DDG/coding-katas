package com.df.Program;

public class Greed 
{
	public int score(Integer[] input)
	{
		Integer[] count = {0,0,0,0,0,0};
		
		for (int temp : input)
		{
			if (temp == 1)
				count[0] += 1;
			else if (temp == 2)
				count[1] += 1;
			else if (temp == 3)
				count[2] += 1;
			else if (temp == 4)
				count[3] += 1;
			else if (temp == 5)
				count[4] += 1;
			else if (temp == 6)
				count[5] += 1;
			else
			{}
		}
		
		if (count[0] == 1)
			return 100;
		else if (count[0] >= 3)
		{
			int i = (count[0] - 3) + 1;
			return 1000 * i;
		}
		if (count[1] >= 3)
		{
			int i = (count[1] - 3) + 1;
			return 200 * i;
		}
		if (count[2] >= 3)
		{
			int i = (count[2] - 3) + 1;
			return 300 * i;
		}
		if (count[3] >= 3)
		{
			int i = (count[3] - 3) + 1;
			return 400 * i;
		}
		if (count[4] == 1)
			return 50;
		else if (count[4] >= 3)
		{
			int i = (count[4] - 3) + 1;
			return 500 * i;
		}
		if (count[5] >= 3)
		{
			int i = (count[5] - 3) + 1;
			return 600 * i;
		}
		else
			return 0;
	}
}
