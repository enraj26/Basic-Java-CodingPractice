package com.codewithraju.string;

public class EvenIndex {
	
	public static void main(String[] args) {
		
		String str= "Hello I am from AndhraPradesh";
		for(int i =0;i<str.length();i++) {
			if(i %2 == 0) {
				System.out.println(str.charAt(i));
			}
		}
		
	}

}
