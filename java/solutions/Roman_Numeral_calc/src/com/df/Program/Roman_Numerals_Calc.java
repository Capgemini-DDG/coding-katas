package com.df.Program;

public class Roman_Numerals_Calc 
{
	public String Calc (String in1, String in2)
	{	
		int total1 = 0;
		int total2 = 0;
		int skipper = 0;
		boolean nxtBreak = false;
		
		for (int i = 0; i < in1.length(); i++)
		{
			if (!nxtBreak)
			{
				switch (in1.substring(i, i+1))
				{
					case "I":
						if (in1.length() >= i+2)
							if (in1.substring(i, i+2).equals("IV"))
							{
								total1 += 4;
								nxtBreak = true;
								skipper = i;
							}
							else if (in1.substring(i, i+2).equals("IX"))
							{
								total1 += 9;
								nxtBreak = true;
								skipper = i;
							}
							else					
								total1 += 1;
						else
							total1 += 1;
						break;
					case "V":
						total1 += 5;
						break;
					case "X":
						if (in1.length() >= i+2)
							if (in1.substring(i, i+2).equals("XL"))
							{
								total1 += 40;
								nxtBreak = true;
								skipper = i;
							}
							else if (in1.substring(i, i+2).equals("XC"))
							{
								total1 += 90;
								nxtBreak = true;
								skipper = i;
							}
							else
								total1 += 10;
						else
							total1 += 10;
						break;
					case "L":
						total1 += 50;
						break;
					case "C":
						if (in1.length() >= i+2)
							if (in1.substring(i, i+2).equals("CD"))
							{
								total1 += 400;
								nxtBreak = true;
								skipper = i;
							}
							else if (in1.substring(i, i+2).equals("CM"))
							{
								total1 += 900;
								nxtBreak = true;
								skipper = i;
							}
							else
								total1 += 100;
						else
							total1 += 100;
						break;
					case "D":
						total1 += 500;
						break;
					case "M":
						total1 += 1000;
						break;
					default:
						System.err.println("Error: Not a Roman Numeral");
				}
			}
			if (skipper != i)
			{
				nxtBreak = false;
				skipper = 0;
			}
		}
		
		nxtBreak = false;
		
		for (int i = 0; i < in2.length(); i++)
		{
			if (!nxtBreak)
			{
				switch (in2.substring(i, i+1))
				{
					case "I":
						if (in2.length() >= i+2)
							if (in2.substring(i, i+2).equals("IV"))
							{
								total2 += 4;
								nxtBreak = true;
								skipper = i;
							}
							else if (in2.substring(i, i+2).equals("IX"))
							{
								total2 += 9;
								nxtBreak = true;
								skipper = i;
							}
							else					
								total2 += 1;
						else
							total2 += 1;
						break;
					case "V":
						total2 += 5;
						break;
					case "X":
						if (in2.length() >= i+2)
							if (in2.substring(i, i+2).equals("XL"))
							{
								total2 += 40;
								nxtBreak = true;
								skipper = i;
							}
							else if (in2.substring(i, i+2).equals("XC"))
							{
								total2 += 90;
								nxtBreak = true;
								skipper = i;
							}
							else
								total2 += 10;
						else
							total2 += 10;
						break;
					case "L":
						total2 += 50;
						break;
					case "C":
						if (in2.length() >= i+2)
							if (in2.substring(i, i+2).equals("CD"))
							{
								total2 += 400;
								nxtBreak = true;
								skipper = i;
							}
							else if (in2.substring(i, i+2).equals("CM"))
							{
								total2 += 900;
								nxtBreak = true;
								skipper = i;
							}
							else
								total2 += 100;
						else
							total2 += 100;
						break;
					case "D":
						total2 += 500;
						break;
					case "M":
						total2 += 1000;
						break;
					default:
						System.err.println("Error: Not a Roman Numeral");
				}
			}
			if (skipper != i)
			{
				nxtBreak = false;
				skipper = 0;
			}
		}
		
		int overall = total1 + total2;
		
		String output = "";
		
		while (overall > 0)
		{
			if (overall >= 1000)
			{
				output = output+"M";
				overall = overall - 1000;
			}
			else if (overall >= 900)
			{
				output = output+"CM";
				overall = overall - 900;
			}
			else if (overall >= 500)
			{
				output = output+"D";
				overall = overall - 500;
			}
			else if (overall >= 400)
			{
				output = output+"CD";
				overall = overall - 400;
			}
			else if (overall >= 100)
			{
				output = output+"C";
				overall = overall - 100;
			}
			else if (overall >= 90)
			{
				output = output+"XC";
				overall = overall - 90;
			}
			else if (overall >= 50)
			{
				output = output+"L";
				overall = overall - 50;
			}
			else if (overall >= 40)
			{
				output = output+"XL";
				overall = overall - 40;
			}
			else if (overall >= 10)
			{
				output = output+"X";
				overall = overall - 10;
			}
			else if (overall >= 9)
			{
				output = output+"IX";
				overall = overall - 9;
			}
			else if (overall >= 5)
			{
				output = output+"V";
				overall = overall - 5;
			}
			else if (overall >= 4)
			{
				output = output+"IV";
				overall = overall - 4;
			}
			else if (overall >= 1)
			{
				output = output+"I";
				overall = overall - 1;
			}
		}
		
		return output;
	}
}