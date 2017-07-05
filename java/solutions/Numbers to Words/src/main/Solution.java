package main;

public class Solution {
	String result = "";
	boolean pass = false;

	public String Main(int input) {

		String value = String.valueOf(input);

		for (int i = 0; i <= value.length(); i++) {

			if (i < value.length()) {
				char ch = value.charAt(i);

				if (ch == '1') {

					if (value.length() == 1) {
						result += "one";
					} else if (i > value.length() + 2) {
						result += " one";
						pass = true;
					} else if (value.length() >= 3 && i < value.length() - 2) {
						result += " one";
						pass = true;
					}

					else if (i == value.length() - 1 && value.charAt(i - 1) == '1') {

						result += " eleven";
						if (i < value.length()) {
							pass = false;
						}
					}
				}

				else if (ch == '2') {

					if (value.length() == 1) {
						result += "two";
					}

					else if (i == value.length() - 2 || (value.length() + 1) % 3 == 0 && i % 3 == 0
							|| i == value.length() - 5) {
						if (value.length() >= 2) {
							result += " twen";
							pass = true;
						} else {
							result += "twen";
							pass = true;
						}

					}

					else if (i >= value.length() - 1 && value.charAt(i - 1) != '0') {
						if ((i + 1) <= value.length() && value.charAt(i - 1) == '1') {
							result += " twelve";
							if (i < value.length()) {
								pass = false;
							}
						} else if (value.length() >= 2 && i > 0) {
							result += " two";
							pass = true;
						} else {
							result += "two";
							pass = true;
						}
					} else {
						if (i == 0 || (i + 1) == value.length() || i == value.length() - 4) {
							if (value.length() >= 2) {
								result += " two";
							} else {
								result += "two";
							}
						} else {
							result += "twelve";
							if (i < value.length()) {
								pass = false;
							}
						}
					}
				}

				else if (ch == '3') {

					if (value.length() == 1) {
						result += "three";
					}

					else if (i >= (value.length() - 2) && value.charAt(i - 1) == '1'
							|| i >= (value.length() - 2) && value.charAt(i - 1) != '0' && (i + 1) < value.length()
							|| i == (value.length() - 5) && value.charAt(i - 1) != '0' && (i + 1) < value.length()) {
						if (value.length() >= 2 && i > 0) {
							result += " thir";
							pass = true;
						} else {
							result += "thir";
							pass = true;
						}

					} else {
						if (value.length() >= 2 && i > 0) {
							result += " three";
							pass = true;
						} else {
							result += "three";
							pass = true;
						}
					}
				}

				else if (ch == '4') {
					if (value.length() >= 2 && i > 0) {
						result += " four";
						pass = true;
					}

					else {
						result += "four";
						pass = true;
					}

				}

				else if (ch == '5') {
					if (value.length() == 1) {
						result += "five";
					}

					else if (value.length() >= 2 && i == value.length() || (value.length() + 1) % 3 == 0 && i % 3 == 0
							|| i >= (value.length() - 2) && value.charAt(i - 1) != '0' && (i + 1) < value.length()) {
						result += " fif";
						pass = true;
					}

					else if (i + 2 >= value.length() && value.charAt(i - 1) == '1' || i == value.length() - 5) {
						if (value.length() >= 2 && i > 0 || (value.length() + 1) % 3 == 0 && i % 3 == 0) {
							result += " fif";
							pass = true;
						} else {
							result += "fif";
							pass = true;
						}
					} else {
						if (value.length() >= 2 && i > 0) {
							result += " five";
							pass = true;
						} else {
							result += "five";
							pass = true;
						}
					}
				}

				else if (ch == '6') {
					if (value.length() >= 2 && i > 0) {
						result += " six";
						pass = true;
					} else {
						result += "six";
						pass = true;
					}
				}

				else if (ch == '7') {
					if (value.length() >= 2 && i > 0) {
						result += " seven";
						pass = true;
					} else {
						result += "seven";
						pass = true;
					}
				}

				else if (ch == '8') {
					if ((value.length() + 1) % 3 == 0 && i % 3 == 0 || value.length() % 3 == 0 && (i + 2) % 3 == 0) {
						result += " eigh";
						pass = true;
					} else if (value.length() >= 2 && i > 0) {
						result += " eight";
						pass = true;
					}

					else {
						result += "eight";
						pass = true;
					}
				}

				else if (ch == '9') {
					if (value.length() >= 2 && i > 0) {
						result += " nine";
						pass = true;
					} else {
						result += "nine";
						pass = true;
					}
				}

				if (value.length() == i) {
					pass = false;
				}

				if (value.length() == 1) {
					pass = false;
				}

				else if (value.length() - 1 == i) {
					if (pass == true) {
						if (value.charAt(i - 1) == '1') {
							result += "teen ";
						}
					}
				}

				else if (value.length() - 2 == i || value.length() - 5 == i) {
					if (ch == '0') {
						// doing nothing
					} else if (value.charAt(i) == '1') {
						if (value.charAt(i + 1) == '0') {
							result += "ten";

						} else {
							if (pass == true && value.charAt(i - 1) == '1' && i < value.length() - 2) {
								result += "teen";
							}
						}
					} else {
						result += "ty";
					}
				}

				else if (value.length() - 3 <= i || value.length() - 6 == i) {
					if (ch == '0' && value.length() == 5) {
						result += " hundred";
					} else if (ch == '0') {

					} else {
						result += " hundred";
					}
					if (value.length() - 2 >= i && value.charAt(i + 1) != '0'
							|| value.length() - 2 >= i && value.charAt(i + 2) != '0') {
						result += " and";
					}

				} else if (value.length() - 4 == i) {

					if (ch == '0' && value.length() > 4) {
						result += " thousand";
					} else if (ch == '0') {

					} else {
						result += " thousand";
					}
				} else if (i % 3 == 0 && (value.length() + 1) % 3 == 0) {
					result += "ty";
				}

			}

			else {

			}
		}

		System.out.println(result);

		return result.trim();
	}

}
