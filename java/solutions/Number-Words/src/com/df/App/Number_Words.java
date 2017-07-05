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
		boolean teenThousand = false;
		boolean[][] place = new boolean[6][2];
		
		for (int s = 0; s < 6; s++)
		{
			place[s][0] = false;
			place[s][1] = false;
		}
		
		
		String[] units = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"}; 
		String[] teens = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		String[] tens = {"", "Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		
		StringBuilder out = new StringBuilder();
		
		while (!qIn.isEmpty())
		{
			for (int k = 0; k < 10; k++)
			{
				char[] t = Integer.toString(k).toCharArray();

				if (places > 6 && !place[5][0])
				{
					
				}
				else if (places > 5 && !place[4][0])
				{
					if (qIn.peek() == t[0] && qIn.peek() != '0')
					{
						qIn.remove();
						if (place[5][0])
							out.append(", " + units[k] + " Hundred");
						else
							out.append(units[k] + " Hundred");
						
						place[4][0] = true;
						break;
					}
					else if (qIn.peek() == '0')
					{
						qIn.remove();
						place[4][0] = true;
						place[4][1] = true;
						break;
					}
				}
				else if (places > 4 && !place[3][0])
				{
					if (qIn.peek() == '1' || teenThousand)
					{
						if (!teenThousand)
							qIn.remove();
						
						if (qIn.peek() != '0')
						{
							teenThousand = true;
							if (qIn.peek() == t[0])
							{
								qIn.remove();
								if (place[4][0])
									out.append(" and " + teens[k-1] + " Thousand");
								else
									out.append(teens[k-1] + " Thousand");
							
								place[3][0] = true;
								teenThousand = true;
								break;
							}
						}
						else
						{
							if (place[4][0] && qIn.peek() == '0')
							{
								qIn.remove();
								out.append(" and Ten Thousand");
							}
							else if (qIn.peek() == t[0])
							{
								qIn.remove();
								out.append("Ten Thousand");
							}
							
							place[3][0] = true;
							teenThousand = true;
							break;
						}
					}
					else if (qIn.peek() == t[0])
					{
						qIn.remove();
						if (place[4][0] && qIn.peek() == '0' && t[0] == '0')
							out.append("");
						else if (place[4][0] && qIn.peek() == '0')
							out.append(" and " + tens[k] + " Thousand");
						else if (place[4][0])
							out.append(" and " + tens[k]);
						else
							out.append(tens[k]);

						place[3][0] = true;
						break;
					}
				}
				else if (places > 3 && !place[2][0] && !teenThousand)
				{
					if (qIn.peek() == t[0])
					{
						qIn.remove();
						if (place [3][0] && t[0] != '0')
							out.append(" " + units[k] + " Thousand");
						else if (t[0] != '0')
							out.append(units[k] + " Thousand");
						else
							out.append(" Thousand");
						
						place[2][0] = true;
					}
				}
				else if (places > 2 && !place[1][0])
				{
					if (qIn.peek() == t[0] && qIn.peek() != '0')
					{
						qIn.remove();
						if (place[2][0])
							out.append(", " + units[k] + " Hundred");
						else
							out.append(units[k] + " Hundred");
						
						place[1][0] = true;
						break;
					}
					else if (qIn.peek() == '0')
					{
						qIn.remove();
						place[1][0] = true;
						place[1][1] = true;
						break;
					}
				}
				else if (places > 1 && !place[0][0])
				{
					if (qIn.peek() == '1' || teen)
					{
						if (!teen)
							qIn.remove();
						
						if (qIn.peek() != '0')
						{
							teen = true;
							if (qIn.peek() == t[0])
							{
								qIn.remove();
								if (place[1][0])
									out.append(" and " + teens[k-1]);
								else
									out.append(teens[k-1]);
							
								place[0][0] = true;
								teen = true;
								break;
							}
						}
						else
						{
							if (place[1][0] && qIn.peek() != '0')
							{
								qIn.remove();
								out.append(" and Ten");
							}
							else if (qIn.peek() == t[0])
							{
								qIn.remove();
								out.append("Ten");
							}
							
							break;
						}
					}
					else if (qIn.peek() == t[0])
					{
						if (place[1][0] && qIn.peek() != '0')
						{
							qIn.remove();
							out.append(" and " + tens[k]);
						}
						else if (qIn.peek() == t[0] && qIn.peek() != '0')
						{
							qIn.remove();
							out.append(tens[k]);
						}
						else if (qIn.peek() == '0')
						{
							qIn.remove();
							place[0][1] = true;
						}

						place[0][0] = true;
						break;
					}
				}
				else if (!teen)
				{
					if (qIn.peek() == t[0])
					{
						if (place[0][0] && qIn.peek() != '0' && place[0][1] && place[1][1])
						{
							qIn.remove();
							out.append(", and " + units[k]);
						}
						else if (place[0][0] && qIn.peek() != '0' && place[0][1])
						{
							qIn.remove();
							out.append(" and " + units[k]);
						}
						else if (place[0][0] && qIn.peek() != '0')
						{
							qIn.remove();
							out.append(" " + units[k]);
						}
						else if (!place[0][0])
						{
							qIn.remove();
							out.append(units[k]);
						}
						else if (qIn.peek() == '0')
							qIn.remove();
						
						break;
					}
				}
			}
		}
		return out.toString();
	}
}