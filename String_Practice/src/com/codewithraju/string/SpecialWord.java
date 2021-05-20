package com.codewithraju.string;

public class SpecialWord {
	
	public static void main(String[] args) {
		
		String str = "Hello I am from Ongole";
		getSpecailWord(str);
		
	}

	/**
	 * @param str
	 */
	static void getSpecailWord(String str) {
		String[] split = str.split(" ");
		for(int i = 0;i<=split.length-1;i++) {
			if(split[i].length() >=5) {
				System.out.print(split[i]+" ");
			}
		}
	}
}
