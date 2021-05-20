package com.codewithraju.string;

public class FiveWordString {
	
	public static void main(String[] args) {
		
		String str = "Hello I am from India";
		String[] split = str.split(" ");
		for(int  i=0;i<split.length;i++) {
			if(split[i].length()>=5) {
				System.out.print(split[i]+" ");
			}
			/*if(split[i].length()<=4) {
				System.out.print(split[i]+" ");
			}*/
		}
		
	}

}
