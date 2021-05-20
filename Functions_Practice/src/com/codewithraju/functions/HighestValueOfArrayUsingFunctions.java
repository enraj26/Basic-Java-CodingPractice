package com.codewithraju.functions;

public class HighestValueOfArrayUsingFunctions {

	public static void main(String[] args) {

		int a1[] = { 2, 67, 23, 45, 90, 1, 45, 78, 98 };
		int highestValue = getHighestValue(a1);
		System.out.println(highestValue);
	}

	static int getHighestValue(int arr[]) {
		int highestValue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highestValue) {
				highestValue = arr[i];
			}
		}
		return highestValue;
	}
}
