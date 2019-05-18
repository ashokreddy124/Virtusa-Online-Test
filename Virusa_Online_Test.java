package com.ex;

import java.util.Scanner;

public class Virusa_Online_Test {

	public static String ToRoman(int number) {
		StringBuilder br = new StringBuilder("");
		while (number != 0) {
			if (number >= 1000) {
				br.append("M");
				number -= 1000;
			}
			if (number >= 900) {
				br.append("CM");
				number -= 900;
			}
			if (number >= 500) {
				br.append("D");
				number -= 500;
			}
			if (number >= 400) {
				br.append("CD");
				number -= 400;
			}
			if (number >= 100) {
				br.append("C");
				number -= 100;
			}
			if (number >= 90) {
				br.append("XC");
				number -= 90;
			}
			if (number >= 50) {
				br.append("L");
				number -= 50;
			}
			if (number >= 40) {
				br.append("XL");
				number -= 40;
			}
			if (number >= 10) {
				br.append("X");
				number -= 10;
			}
			if (number >= 9) {
				br.append("IX");
				number -= 9;
			}
			if (number >= 5) {
				br.append("V");
				number -= 5;
			}
			if (number >= 4) {
				br.append("IV");
				number -= 4;
			}
			if (number >= 1) {
				br.append("I");
				number -= 1;
			}
		}
		return br.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter Number");
		String result = ToRoman(scanner.nextInt());
		System.out.println("Result=" + result);
	}
}
