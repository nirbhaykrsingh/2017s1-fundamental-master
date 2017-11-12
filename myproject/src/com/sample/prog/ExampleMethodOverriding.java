package com.sample.prog;

public class ExampleMethodOverriding {
public static void main(String args[]) {
	MyAbstractClassExample myAbstractClassExample = new MyCompleteClass();
	myAbstractClassExample.test();
	myAbstractClassExample.firstabstractMethod();
}
}


class MyCompleteClass extends MyAbstractClassExample{
	 void firstabstractMethod() {
	System.out.println("This is from firstabstractMethod");	
	}
	 void test() {
		 System.out.println("This is a test  method from MyCompleteClass");
	 }
}

abstract class MyAbstractClassExample{
	 abstract void firstabstractMethod();
	
	 void test() {
		 System.out.println("This is a test  method from MyAbstractClassExample");
	 }
}


interface MyIntf{
	void test();
}