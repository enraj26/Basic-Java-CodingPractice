package com.codewithraju.functions;

public class getMaxValue {

	public static void main(String[] args) {

		int a = 39;
		int b = 96;
		int c = 45;
		int maxValue = getMaxValue(a, b, c);
		System.out.println(maxValue);
	}

	static int getMaxValue(int a, int b, int c) {
		if (a > b & a > c) {
			return a;
		} else if (b > a & b > c) {
			return b;
		} else {
			return c;
		}
	}

}
