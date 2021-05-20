package com.codewithraju.string;

public class StringLength {

	public static void main(String[] args) {

		String s = "Hello I am,from,Hyderabad";
		String s2 = "sad";
		int length = s.length();
		String upperCase = s.toUpperCase();
		int codePointAt = s.lastIndexOf(4);
		int codePointCount = s.codePointCount(2, 4);
		String trim = s.trim();
		System.out.println("--"+codePointCount);
		String[] split = s.split(",");
		for(int i =0;i<split.length;i++) {
			System.out.println(split[i]);
		}
		System.out.println(codePointAt);
		System.out.println(length);
	}

}
