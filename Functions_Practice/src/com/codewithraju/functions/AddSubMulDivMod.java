package com.codewithraju.functions;

public class AddSubMulDivMod {
	public static void main(String[] args) {
		int a = 40;
		int b = 30;
		int c = 50;

		int Sum = add(a, b, c);
		int Sub = sub(a, b, c);
		int mul = mul(a, b, c);
		int div = diveded(a, b);
		int modules = modules(a, b);
		System.out.println("Sum :" + Sum);
		System.out.println("Sub :" + Sub);
		System.out.println("Mul :" + mul);
		System.out.println("Div :" + div);
		System.out.println("Mod :" + modules);
	}
	static int add(int value1, int value2, int value3) {
		int result = value1 + value2 + value3;
		return result;
	}

	static int sub(int value1, int value2, int value3) {
		int result = value1 - value2 - value3;
		return result;
	}

	static int mul(int value1, int value2, int value3) {
		int result = value1 * value2 * value3;
		return result;
	}

	static int diveded(int value1, int value2) {
		int result = value1 / value2;
		return result;
	}

	static int modules(int value1, int value2) {
		int result = value1 % value2;
		return result;
	}

}
