package com.codewithraju.functions;

public class OddCountOfArrayUsingFunctions {

	public static void main(String[] args) {

		int a1[] = { 12, 11, 3, 5, 7, 9 };
		int oddCount = getOddCountOfArray(a1);
		System.out.println(oddCount);
	}

	static int getOddCountOfArray(int arr[]) {
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddCount++;
			}
		}
		return oddCount;
	}
}
