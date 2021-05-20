package com.codewithraju.functions;

public class EvenSumOfArrayUsingFunctions {

	public static void main(String[] args) {

		int a1[] = { 12, 56, 33, 45, 67, 88, 22, 11, 12 };
		int evenSum = getEvenSum(a1);
		System.out.println(evenSum);
	}

	static int getEvenSum(int arr[]) {
		int evenSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenSum = evenSum + arr[i];
			}
		}
		return evenSum;
	}

}
