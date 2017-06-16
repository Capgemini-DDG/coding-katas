package mainPackage;

import java.util.Scanner;

public class Main {

	int letterValue = 0;
	int letterValue2 = 0;
	int result = 0;
	String output = "";
	String user1;
	String user2;
	String userInput1;
	String userInput2;

	int[] Array = new int[26];
	int[] Array2 = new int[26];

	public String result(String input1, String input2) {

		userInput1 = input1.toLowerCase();
		userInput2 = input2.toLowerCase();

		Scanner input = new Scanner(System.in);

		if (input1 == "QWERTY" && input2 == "QWERTY") {
			System.out.print("Please enter a number in roman numerals: ");
			user1 = input.next();
			userInput1 = user1.toLowerCase();

			System.out.println("");

			System.out.print("Please enter a second number in roman numerals: ");
			user2 = input.next();
			userInput2 = user2.toLowerCase();
		}

		for (int i = 0; i < userInput1.length(); i++) {
			char ch = userInput1.charAt(i);
			int value = (int) ch;

			if (ch == 'v') {
				if (i >= 1) {
					if (userInput1.charAt(i - 1) == 'i') {
						letterValue = letterValue + 3;
					} else {
						letterValue = letterValue + 5;
					}
				} else {
					letterValue = letterValue + 5;
				}
			}

			else if (ch == 'x') {
				if (i >= 1) {
					if (userInput1.charAt(i - 1) == 'i') {
						letterValue = letterValue + 8;
					} else {
						letterValue = letterValue + 10;
					}
				} else {
					letterValue = letterValue + 10;
				}
			}

			else if (ch == 'l') {
				if (i >= 1) {
					if (userInput1.charAt(i - 1) == 'i') {
						letterValue = letterValue + 48;
					} else if (userInput1.charAt(i - 1) == 'v') {
						letterValue = letterValue + 40;
					} else if (userInput1.charAt(i - 1) == 'x') {
						letterValue = letterValue + 30;
					} else {
						letterValue = letterValue + 50;
					}
				} else {
					letterValue = letterValue + 50;
				}
			}

			else if (ch == 'c') {
				if (i >= 1) {
					if (userInput1.charAt(i - 1) == 'i') {
						letterValue = letterValue + 98;
					} else if (userInput1.charAt(i - 1) == 'v') {
						letterValue = letterValue + 90;
					} else if (userInput1.charAt(i - 1) == 'x') {
						letterValue = letterValue + 80;
					} else {
						letterValue = letterValue + 100;
					}
				} else {
					letterValue = letterValue + 100;
				}
			} else if (ch == 'd') {
				if (i >= 1) {
					if (userInput1.charAt(i - 1) == 'i') {
						letterValue = letterValue + 498;
					} else if (userInput1.charAt(i - 1) == 'v') {
						letterValue = letterValue + 490;
					} else if (userInput1.charAt(i - 1) == 'x') {
						letterValue = letterValue + 480;
					} else if (userInput1.charAt(i - 1) == 'l') {
						letterValue = letterValue + 400;
					} else if (userInput1.charAt(i - 1) == 'c') {
						letterValue = letterValue + 300;
					} else {
						letterValue = letterValue + 500;
					}
				} else {
					letterValue = letterValue + 500;
				}
			} else if (ch == 'm') {
				if (i >= 1) {
					if (userInput1.charAt(i - 1) == 'i') {
						letterValue = letterValue + 998;
					} else if (userInput1.charAt(i - 1) == 'v') {
						letterValue = letterValue + 990;
					} else if (userInput1.charAt(i - 1) == 'x') {
						letterValue = letterValue + 980;
					} else if (userInput1.charAt(i - 1) == 'l') {
						letterValue = letterValue + 900;
					} else if (userInput1.charAt(i - 1) == 'c') {
						letterValue = letterValue + 800;
					} else {
						letterValue = letterValue + 1000;
					}
				} else {
					letterValue = letterValue + 1000;

				}
			}

			else if (ch == 'i') {
				letterValue = letterValue + 1;
			}

			if (value >= 97 && value <= 122) {
				Array[ch - 'a']++;
			}
		}

		for (int i = 0; i < userInput2.length(); i++) {
			char ch2 = userInput2.charAt(i);
			int value2 = (int) ch2;

			if (ch2 == 'v') {
				if (i >= 1) {
					if (userInput2.charAt(i - 1) == 'i') {
						letterValue2 = letterValue2 + 3;
					} else {
						letterValue2 = letterValue2 + 5;
					}
				} else {
					letterValue2 = letterValue2 + 5;
				}
			}

			else if (ch2 == 'x') {
				if (i >= 1) {
					if (userInput2.charAt(i - 1) == 'i') {
						letterValue2 = letterValue2 + 8;
					} else {
						letterValue2 = letterValue2 + 10;
					}
				} else {
					letterValue2 = letterValue2 + 10;
				}
			}

			else if (ch2 == 'l') {
				if (i >= 1) {
					if (userInput2.charAt(i - 1) == 'i') {
						letterValue2 = letterValue2 + 48;
					} else if (userInput2.charAt(i - 1) == 'v') {
						letterValue2 = letterValue2 + 40;
					} else if (userInput2.charAt(i - 1) == 'x') {
						letterValue2 = letterValue2 + 30;
					} else {
						letterValue2 = letterValue2 + 50;
					}
				} else {
					letterValue2 = letterValue2 + 50;
				}
			}

			else if (ch2 == 'c') {
				if (i >= 1) {
					if (userInput2.charAt(i - 1) == 'i') {
						letterValue2 = letterValue2 + 98;
					} else if (userInput2.charAt(i - 1) == 'v') {
						letterValue2 = letterValue2 + 90;
					} else if (userInput2.charAt(i - 1) == 'x') {
						letterValue2 = letterValue2 + 80;
					} else {
						letterValue2 = letterValue2 + 100;
					}
				} else {
					letterValue2 = letterValue2 + 100;
				}
			} else if (ch2 == 'd') {
				if (i >= 1) {
					if (userInput2.charAt(i - 1) == 'i') {
						letterValue2 = letterValue2 + 498;
					} else if (userInput2.charAt(i - 1) == 'v') {
						letterValue2 = letterValue2 + 490;
					} else if (userInput2.charAt(i - 1) == 'x') {
						letterValue2 = letterValue2 + 480;
					} else if (userInput2.charAt(i - 1) == 'l') {
						letterValue2 = letterValue2 + 400;
					} else if (userInput2.charAt(i - 1) == 'c') {
						letterValue2 = letterValue2 + 300;
					} else {
						letterValue2 = letterValue2 + 500;
					}
				} else {
					letterValue2 = letterValue2 + 500;
				}
			} else if (ch2 == 'm') {
				if (i >= 1) {
					if (userInput2.charAt(i - 1) == 'i') {
						letterValue2 = letterValue2 + 998;
					} else if (userInput2.charAt(i - 1) == 'v') {
						letterValue2 = letterValue2 + 990;
					} else if (userInput2.charAt(i - 1) == 'x') {
						letterValue2 = letterValue2 + 980;
					} else if (userInput2.charAt(i - 1) == 'l') {
						letterValue2 = letterValue2 + 900;
					} else if (userInput2.charAt(i - 1) == 'c') {
						letterValue2 = letterValue2 + 800;
					} else {
						letterValue2 = letterValue2 + 1000;
					}
				} else {
					letterValue2 = letterValue2 + 1000;
				}
			}

			else if (ch2 == 'i') {
				letterValue2 = letterValue2 + 1;
			}

			if (value2 >= 97 && value2 <= 122) {
				Array2[ch2 - 'a']++;
			}
		}
		
		
		System.out.println("");
		System.out.println("Input 1 contents:");
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] > 0) {
				char ch = (char) (i + 97);
				System.out.println(ch + "  : " + Array[i]);
			}
		}

		System.out.println("");
		System.out.println("Input 2 contents:");
		for (int i = 0; i < Array2.length; i++) {
			if (Array2[i] > 0) {
				char ch2 = (char) (i + 97);
				System.out.println(ch2 + "  : " + Array2[i]);

			}
		}


		result = letterValue + letterValue2;

		System.out.println("");
		System.out.println("input 1 numerical value: ");
		System.out.println(letterValue);
		System.out.println("");
		System.out.println("input 2 numerical value: ");
		System.out.println(letterValue2);
		System.out.println("");
		System.out.println("Numerical result:");
		System.out.println(result);
		System.out.println("");

		while (result > 0) {
			if (result >= 1000) {
				output = output + "M";
				result = result - 1000;
			} else if (result >= 900) {
				output = output + "CM";
				result = result - 900;
			} else if (result >= 500) {
				output = output + "D";
				result = result - 500;
			} else if (result >= 400) {
				output = output + "CD";
				result = result - 400;
			} else if (result >= 100) {
				output = output + "C";
				result = result - 100;
			} else if (result >= 90) {
				output = output + "XC";
				result = result - 90;
			} else if (result >= 50) {
				output = output + "L";
				result = result - 50;
			} else if (result >= 40) {
				output = output + "XL";
				result = result - 40;
			} else if (result >= 10) {
				output = output + "X";
				result = result - 10;
			} else if (result >= 9) {
				output = output + "IX";
				result = result - 9;
			} else if (result >= 5) {
				output = output + "V";
				result = result - 5;
			} else if (result >= 4) {
				output = output + "IV";
				result = result - 4;
			} else if (result >= 1) {
				output = output + "I";
				result = result - 1;
			}
		}

		System.out.println("Roman numeral result:");
		System.out.println(output);
		System.out.println("");
		System.out.println("____________________________________________________________________");
		System.out.println("");
		System.out.println("");
		

		input.close();
		return output;
		
		
		/*
		 * switch (result) {
		 * 
		 * case 2: return "II";
		 * 
		 * case 3: return "III";
		 * 
		 * case 4: return "IV";
		 * 
		 * case 5: return "V";
		 * 
		 * case 6: return "VI";
		 * 
		 * case 7: return "VII";
		 * 
		 * case 8: return "VIII";
		 * 
		 * case 9: return "IX";
		 * 
		 * case 10: return "X";
		 * 
		 * case 15: return "XV";
		 * 
		 * default: return "N/A";
		 * 
		 * }
		 * 
		 * 
		 * /* if (result == 2) { return "II"; }
		 * 
		 * else if (result == 3) { return "III"; }
		 * 
		 * else if (result == 4) { return "IV"; }
		 * 
		 * else if (result == 5) { return "V"; }
		 * 
		 * else if (result == 6) { return "VI"; }
		 * 
		 * else if (result == 8) { return "VIII"; }
		 * 
		 * else if (result == 9) { return "IX"; }
		 * 
		 * else if (result == 10) { return "X"; }
		 * 
		 * else if (result == 15) { return "XV"; }
		 */

	}

}
