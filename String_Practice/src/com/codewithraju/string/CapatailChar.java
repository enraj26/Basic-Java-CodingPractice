package com.codewithraju.string;

public class CapatailChar {

	public static void main(String[] args) {
		String str = "Hello I Am From Ongole";
		getCaptatialChar(str);
	}

	static void getCaptatialChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = (char) str.charAt(i);
			int ascii = ch;
			if (ascii >= 65 & ascii <= 90) {
				System.out.println(str.charAt(i));
			}
		}
	}
}
