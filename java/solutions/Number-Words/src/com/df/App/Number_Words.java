package com.df.App;

import java.util.LinkedList;
import java.util.Queue;

public class Number_Words 
{
	public String Convert(int in)
	{
		char[] cTemp = Integer.toString(in).toCharArray();
		int places = cTemp.length;
		Queue<Character> qIn = new LinkedList<Character>();
		
		for (char c : cTemp)
			qIn.add(c);
		
		while (qIn.peek() == '0')
		{
			qIn.remove();
		}
		
		boolean teen = false;
		boolean[] place = new boolean[4];
		
		for (int s = 0; s < 4; s++)
			place[s] = false;
		
		
		String[] units = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"}; 
		String[] teens = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		String[] tens = {"", "Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		
		StringBuilder out = new StringBuilder();
		
		while (!qIn.isEmpty())
		{
			for (int k = 0; k < 10; k++)
			{
				char[] t = Integer.toString(k).toCharArray();

				if (places > 4 && !place[0])
				{}
				else if (places > 3 && !place[1])
				{
					if (qIn.peek() == t[0])
					{
						qIn.remove();
						out.append(units[k] + " Thousand");
						place[1] = true;
					}
				}
				else if (places > 2 && !place[2])
				{
					if (qIn.peek() == t[0] && qIn.peek() != '0')
					{
						qIn.remove();
						if (place[1])
							out.append(", " + units[k] + " Hundred");
						else
							out.append(units[k] + " Hundred");
						
						place[2] = true;
						break;
					}
				}
				else if (places > 1 && !place[3])
				{
					if (qIn.peek() == '1')
					{
						qIn.remove();
						if (qIn.peek() != '0')
						{
							if (qIn.peek() == t[0])
							{
								qIn.remove();
								if (place[2])
									out.append(" and " + tens[k]);
								else
									out.append(teens[k-1]);
							
								place[3] = true;
								teen = true;
								break;
							}
						}
						else
						{
							if (place[2] && qIn.peek() != '0')
							{
								qIn.remove();
								out.append(" and " + "Ten");
							}
							else if (qIn.peek() == t[0])
							{
								qIn.remove();
								out.append("Ten");
							}
						}
					}
					else if (qIn.peek() == t[0])
					{
						qIn.remove();
						if (place[2] && qIn.peek() != '0')
						{
							qIn.remove();
							out.append(" and " + tens[k]);
						}
						else if (qIn.peek() == t[0])
						{
							qIn.remove();
							out.append(tens[k]);
						}

						place[3] = true;
						break;
					}
				}
				else if (!teen)
				{
					if (qIn.peek() == t[0])
					{
						qIn.remove();
						if (place[3] && qIn.peek() != '0')
						{
							out.append(" " + units[k]);
						}
						else if (!place[3])
						{
							out.append(units[k]);
						}
					}
				}
			}
		}
		return out.toString();
	}
}
