package com.codewithraju.functions;

public class OddSumOfArrayUsingFunctions {

	public static void main(String[] args) {

		int a1[] = { 12, 13, 45, 67, 76, 45, 34, 43, 99 };
		int oddSum = getOddSumOfArray(a1);
		System.out.println(oddSum);
	}

	static int getOddSumOfArray(int arr[]) {
		int oddSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddSum = oddSum + arr[i];
			}
		}
		return oddSum;
	}

}
