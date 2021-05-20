package com.codewithraju.string;

public class WordInReverse {
	
	public static void main(String[] args) {
		
		String str = "Hello i am from Ongole";
		String[] split = str.split(" ");
		for(int i =split.length-1;i>=0;i--) {
			System.out.print(split[i]+" ");
		}
		
	}

}
