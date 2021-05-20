package com.codewithraju.string;

public class StringCharcters {

	int getNoOfWords(String str) {
		int count = 0;
		String[] split = str.split(" ");
		/*for (int i = 0; i < split.length; i++) {
			count++;
		}*/
		return split.length;
	}
	
	int getNoOfChar(String str) {
		int count = 0;
		for(int i =0 ;i<str.length();i++) {
			/*if((str.charAt(i)>=65) | (str.charAt(i)<=90 & str.charAt(i)>=97) | str.charAt(i)>=122) {
				
				excluding specail charcters
			}*/
			count++; 
		}
				return count;
	}

	int getNoOfSmallCharcters(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 & str.charAt(i) <= 122) {
				// System.out.println(str.charAt(i));
				count++;
			}
		}
		return count;
	}

	int getNoOfCaptailCharcter(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 & str.charAt(i) <= 90) {
				// System.out.println(str.charAt(i));
				count++;
			}
		}
		return count;
	}

	int getSpecailCharcters(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (!((str.charAt(i) >= 65 & str.charAt(i) <= 90) | (str.charAt(i) >= 97 & str.charAt(i) <= 122))) {
				count++;
			}
		}
		return count;
	}

	void getResverse(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

	void getReverseOrder(String str) {
		String[] split = str.split(" ");
		for (int i =split.length-1; i>=0; i--) {
			System.out.print(split[i]+" ");
		}
	}
}
