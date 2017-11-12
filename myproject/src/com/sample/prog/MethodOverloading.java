package com.sample.prog;

public class MethodOverloading {

	static int sum(int i, int j) {
		return i+j;
	}
	static String sum(String i, String j) {
		return i + j;
	}

public static void main(String args[]) {
	int firstNum = 10;
	int secondNum = 20;
	String firstStr = "Hello ";
	String secondStr = "World";
	
	
	System.out.println("Sum "+ MethodOverloading.sum(firstNum,secondNum));
	System.out.println("Sum "+ MethodOverloading.sum(firstStr,secondStr));
}

}

