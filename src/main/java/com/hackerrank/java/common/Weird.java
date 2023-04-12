package com.hackerrank.java.common;

public class Weird {
	public String calculate(int n) {
		boolean isEven = n % 2 == 0;
		String result = "Weird";
		if (isEven) {

			if (n >= 6 && n <= 20)
				result = "Weird";
			else
				result = "Not Weird";
		}
		return result;

	}

}
