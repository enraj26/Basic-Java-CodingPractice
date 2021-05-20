package com.codewithraju.functions;

public class EvenCountOfArrayUsingFunctions {

	public static void main(String[] args) {

		int a1[] = { 1, 4, 5, 7, 19, 11 };
		int evenCount = getEvenCount(a1);
		System.out.println(evenCount);
	}

	static int getEvenCount(int arr[]) {
		int evenCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			}
		}
		return evenCount;
	}

}
