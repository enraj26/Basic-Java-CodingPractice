package com.codewithraju.functions;

public class AverageOfArrayUsingFunctions {
	
	public static void main(String[] args) {
		
		int a1[] = {100,600,300};
		int average = getAvgOfArray(a1);
		System.out.println(average);
	}
	static int getAvgOfArray(int arr[]) {
		int sum = 0;
		int avg = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			avg  = sum/arr.length;
		}
		return avg;
	}

}
