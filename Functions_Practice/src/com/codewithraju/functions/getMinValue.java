package com.codewithraju.functions;

public class getMinValue {

	public static void main(String[] args) {

		int a = 80;
		int b = 40;
		int c = 50;
		int minValue = getMinValue(a, b, c);
		System.out.println(minValue);
	}

	static int getMinValue(int a, int b, int c) {

		if (a < b & a < c) {
			return a;
		} else if (b < a & b < c) {
			return b;
		} else {
			return c;
		}
	}

}
