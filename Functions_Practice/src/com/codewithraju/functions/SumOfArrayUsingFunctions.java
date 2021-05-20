package com.codewithraju.functions;

public class SumOfArrayUsingFunctions {
	
	public static void main(String[] args) {
		
		int a1[] = {6,12,34,54,1,23,67};
		int sum = getSumOfArrays(a1);
		System.out.println(sum);
	}
	
	static int getSumOfArrays(int arr[]) {
		int sum = 0;
		for(int i =0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
