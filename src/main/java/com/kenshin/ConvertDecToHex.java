package com.kenshin;

public class ConvertDecToHex {
	public String convertDecToHex(int n) {
		if (n < 0) {
			return "";
		}
		if (n == 0) {
			return "0";
		}
		StringBuilder hex = new StringBuilder();
		int i = n;
		while (i > 0) {
			hex.append(numberToChar(i % 16));
			i = (int) i / 16;
		}

		return hex.reverse().toString();
	}
	
	private char numberToChar(int n) {
		if (n >= 0 && n <= 9) {
			return (char) ('0' + n);
		} else if (n > 9 && n < 16) {
			return (char) ('A' + n - 10);
		} else {
			return ' ';
		}
	}
}
