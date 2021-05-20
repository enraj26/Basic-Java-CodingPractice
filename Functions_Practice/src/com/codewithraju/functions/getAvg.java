package com.codewithraju.functions;

public class getAvg {

	public static void main(String[] args) {

		int a = 100;
		int b = 600;
		int c = 300;
		int avg = getAvgValue(a, b, c);
		System.out.println(avg);
	}

	static int getAvgValue(int a, int b, int c) {
		int avg = (a + b + c) / 3;
		return avg;
	}

}
