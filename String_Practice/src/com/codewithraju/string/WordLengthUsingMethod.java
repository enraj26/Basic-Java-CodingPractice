package com.codewithraju.string;
public class WordLengthUsingMethod {

	public static void main(String[] args) {
		String str = "Hello I am from India";
		int wordsLength = getWordsLength(str);
		System.out.println(wordsLength);
	}
	static int getWordsLength(String str) {
		String[] split = str.split(" ");
		return split.length;
	}
}
