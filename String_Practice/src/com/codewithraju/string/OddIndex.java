package com.codewithraju.string;

public class OddIndex {
	
	public static void main(String[] args) {
		
		String str = "Hello I am from Ongole";
		for(int i=0;i<str.length();i++) {
			if(i %2 != 0) {
				System.out.print(str.charAt(i));
			}
		}
	}

}
