package com.codewithraju.string;

public class Testing {

	private String[] split;

	public static void main(String[] args) {
		String str = "Hello Java World I am coming";
		Testing tes = new Testing();

		System.out.println("Captail Charcters Of Given String :");
		tes.getCaptailCharcters(str);
		System.out.println("");

		int captailCharctersCount = tes.getCaptailCharctersCount(str);
		System.out.println("Captail Charcters Count Of Given String : " + captailCharctersCount);

		int evenIndexCount = tes.evenIndexCount(str);
		System.out.println("Even Index Count Of Given String : " + evenIndexCount);

		System.out.println("Even Index Position Of Charcters Of Given String : ");
		tes.evenIndexPositionCharcters(str);
		System.out.println("");

		int oddIndexCount = tes.oddIndexCount(str);
		System.out.println("Odd Index Count Of Given String : " + oddIndexCount);

		System.out.println("Odd Index Position Of Charcters Of Given String :");
		tes.oddIndexPositionCharcters(str);
		System.out.println();

		System.out.println("Five Words Charcter Given String :");
		tes.getFiveWordsInString(str);
		
		int fiveWordsStringCount = tes.getFiveWordsStringCount(str);
		System.out.println("Five Words Charcter count Of Given String : "+fiveWordsStringCount);
	
	
		tes.PalindromeString(str);
		tes.StringReverse(str);
		tes.getStringReverseOrder(str);
	}

	void getCaptailCharcters(String str) {
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (charAt >= 65 && charAt <= 90) {
				System.out.print(charAt + " ");
			}
		}
	}

	int getCaptailCharctersCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (charAt >= 65 && charAt <= 90) {
				count++;
			}
		}
		return count;
	}

	int evenIndexCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	void evenIndexPositionCharcters(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				char charAt = str.charAt(i);
				System.out.print(charAt + " ");
			}
		}
	}

	int oddIndexCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 != 0) {
				count++;
			}
		}
		return count;
	}

	void oddIndexPositionCharcters(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 != 0) {
				char charAt = str.charAt(i);
				System.out.print(charAt + " ");
			}
		}
	}

	void getFiveWordsInString(String str) {
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			if (split[i].length() >= 5) {
				System.out.print(split[i] + " ");
			}
		}
	}

	int getFiveWordsStringCount(String str) {
		int count = 0;
		String[] split2 = str.split(" ");
		for (int i = 0; i < split2.length; i++) {
			if (split2[i].length() >= 5) {
				count++;
			}
		}
		return count;
	}
	
	void PalindromeString(String str) {
		str= "abcba";
		String rev ="";
		for(int  i=str.length()-1;i>=0;i--) {
			char charAt = str.charAt(i);
			rev = rev + charAt;
		}
		if(str.equals(rev)) {
			System.out.println("Given String is Palindrome..");
		} else {
			System.out.println("Given String Is Not Palindrome...");
		}
	}
	
	void StringReverse(String str) {
		String rev ="";
		for(int i=str.length()-1;i>=0;i--) {
			char charAt = str.charAt(i);
			rev = rev + charAt;
		}
		System.out.println(rev);
	}
	
	void getStringReverseOrder(String str) {
		String[] split2 = str.split(" ");
		for(int i=split2.length-1;i>=0;i--) {
			System.out.print(split2[i]+" ");
		}
	}

}
