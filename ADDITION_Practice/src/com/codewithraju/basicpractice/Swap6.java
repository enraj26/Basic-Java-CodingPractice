package com.codewithraju.basicpractice;


public class Swap6 {
	
	public static void main(String[] args) {
		
		int v1 = 0;
		int v2  =2;
		int v3 = 1;
		int v4 = 9;
		int v5 = v1;  //  v1 save
		
		v1 = v4;  // v4 save
		v4 = v3;	// v3 save
		v3 = v2;  // v2 save
		v2 = v5;	//  v5 = v1
		System.out.println(v1);//50
		System.out.println(v2);//20
		System.out.println(v3);//30
		System.out.println(v4);//50
	}

}
