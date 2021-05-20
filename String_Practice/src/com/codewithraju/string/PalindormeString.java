package com.codewithraju.string;

public class PalindormeString {

	public static void main(String[] args) {
		String str = "abcba";
		getPalindrome(str);
	}

	static void getPalindrome(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);
		if (str.equals(rev)) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String is not Palindrome");
		}

	}

}
