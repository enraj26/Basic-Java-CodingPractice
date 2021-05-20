package com.codewithraju.basicpractice;


public class Swap3 {
	
	public static void main(String[] args) {
		
		int a= 20;	// a = 20
		int b= 30;	// b = 30
		int c= 40;	// c = 40
		int d = b;	// d = 30
		int e = c;	// e = 40
		b = a;		// b = 20
		c = d;		// c = 30
		a = e;		// a = 40
		System.out.println(a);  // a = 40
		System.out.println(b);  // b = 20
		System.out.println(c);  // c = 30
	}

}
