package com.codewithraju.string;

public class WordReverseUsingMethod {
	
	public static void main(String[] args) {
		
		String str = "Hello I am From Hydreabad";
		getReverseWord(str);
		
	}
	
	static void getReverseWord(String str) {
		String[] split = str.split(" ");
		for(int i =split.length-1;i>=0;i--) {
			System.out.print(split[i]+" ");
		}
	}

}
