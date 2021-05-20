package com.codewithraju.string;

public class LowerChar {
	public static void main(String[] args) {

		String str = "Hello i am From Ongole";
		getLowerCase(str);

	}
	static void getLowerCase(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int assci = ch;
			if (assci >= 97 & assci <= 122) {
				System.out.print(str.charAt(i)+" ");
			}
		}
	}

}
