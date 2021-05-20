package com.codewithraju.pattrens;

public class Five {

	public static void main(String[] args) {

		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'E'; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
