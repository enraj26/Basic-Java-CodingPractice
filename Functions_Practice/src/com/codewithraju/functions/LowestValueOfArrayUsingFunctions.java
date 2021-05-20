package com.codewithraju.functions;

public class LowestValueOfArrayUsingFunctions {

	public static void main(String[] args) {

		int a1[] = { 23, 43, 12, 34, 17, 11, 54, 9, 22, 4 };
		int smallestValue = getSmallestValue(a1);
		System.out.println(smallestValue);
	}

	static int getSmallestValue(int arr[]) {
		int lowest = arr[0];
		for (int i = 0; i <arr.length; i++) {
			if (arr[i] < lowest) {
				lowest = arr[i];
			}
		}
		return lowest;
	}

}
