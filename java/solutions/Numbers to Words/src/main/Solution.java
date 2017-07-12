package main;

public class Solution 
{
	String result = "";
	int passNum = 0;
	boolean skip;
	boolean[] pass = {false, false, false, false, false, false};

	public String Convert(int input) 
	{
		String value = String.valueOf(input);
		int len = value.length();

		for (int i = 0; i < len; i++) 
		{
			skip = false;
			char ch = value.charAt(i);

			switch (ch)
			{
			case '1':
				placeValue(len, i);
				
				if (i != 0)
				{
					if (pass[0] && value.charAt(i - 1) == '1')
					{
						result += " eleven";
						skip = true;
					}
					else if (pass[0] || pass [2] || pass[3] || pass[5])
						result += " one";
				}
				else if (pass[0] || pass [2] || pass[3] || pass[5])
					result += " one";
					
				if (skip)
					pass[passNum] = false;
				break;
			case '2':
				placeValue(len, i);
				
				if (i != 0)
				{
					if ((pass[0] || pass[3]) && value.charAt(i - 1) == '1')
					{
						result += " twelve";
						skip = true;
					}
					else if (pass[0] || pass[2] || pass[3] || pass[5])
						result += " two";
					else
						result += " twen";
				}
				else if (pass[0] || pass [2] || pass[3] || pass[5])
					result += " two";
				else
					result += " twen";

				if (skip)
					pass[passNum] = false;
				break;
			case '3':
				placeValue(len, i);
				
				if (pass[1] || pass[4])
				{
					result += " thir";
					skip = true;
				}
				else if (i != 0) 
				{
					if ((pass[0] && value.charAt(i - 1) == '1'))
					{
						result += " thir";
						skip = true;
					}
					else if (pass[0] || pass [2] || pass[3] || pass[5])
						result += " three";
				}
				else if (pass[0] || pass [2] || pass[3] || pass[5])
					result += " three";
				break;
			case '4':
				result += " four";
				
				placeValue(len, i);
				break;
			case '5':
				placeValue(len, i);

				if (len == 1) 
					result += "five";
				else if (len >= 2 && i == len || (len + 1) % 3 == 0 && i % 3 == 0 || i >= (len - 2) && value.charAt(i - 1) != '0' && (i + 1) < len) 
					result += " fif";
				else if (i + 2 >= len && value.charAt(i - 1) == '1' || i == len - 5) 
					result += " fif";
				else 
					result += " five";
				break;
			case '6':
				result += " six";
					
				placeValue(len, i);
				break;
			case '7':
				result += " seven";
				
				placeValue(len, i);
				break;
			case '8':
				placeValue(len, i);

				if (pass[1] || pass[4])
				{
					result += " eigh";
					skip = true;
				}
				else if (i != 0) 
				{
					if ((pass[0] && value.charAt(i - 1) == '1'))
					{
						result += " eigh";
						skip = true;
					}
					else if (pass[0] || pass [2] || pass[3] || pass[5])
						result += " eight";
				}
				else if (pass[0] || pass [2] || pass[3] || pass[5])
					result += " eight";
				break;
			case '9':
				result += " nine";
					
				placeValue(len, i);
				break;
			case '0':
				if (len == 1)
					result += "zero";

				placeValue(len, i);
				break;
			}

			skip = false;
			
			if (ch == '1' && len > 1) 
				if (i + 2 <= len)
					if (value.charAt(i + 1) == '0' && (pass[1] || pass[4])) 
						result += " ten";
			
			if ((pass[1] || pass[4]) && ch != '1'  && ch != '0')
				result += "ty";		
			
			if ((passNum == 3 || (passNum == 4 && value.charAt(i+1) == '0'))  && ch != '0') 
				result += " thousand";
				
			if ((pass[2] || pass[3]  || pass[5]) && ch != '0')
			{
				for (int x = i+1; x < len-1; x++)
					if (value.charAt(x) != '0')
						skip = true;
				
				if (pass[2] || pass[5])
					result += " hundred";
			
				if (pass[5] && value.charAt(i+1) == '0' && value.charAt(i+2) == '0')
				{
					result += " thousand";
					skip = false;
					placeValue(len, i+2);
				}
			}
				
			if (pass[0] && len > 1)
				if (value.charAt(i - 1) == '1' && ch != '0')
				{
					result += "teen ";
					pass[passNum] = false;
				}
				
			if (passNum == 2 || passNum == 5)
				for (int x = i+1; x < len; x++)
					if (value.charAt(x) != '0')
					{
						result += " and";
						break;
					}
			
			pass[passNum] = false;
			try
			{
				pass[passNum+2] = false;
			}
			catch (Throwable t)
			{}
		}
		return result.trim();
	}

	private void placeValue(int length, int place)
	{
		passNum = (length - place) - 1;
		
		pass[passNum] = true;
	}
}