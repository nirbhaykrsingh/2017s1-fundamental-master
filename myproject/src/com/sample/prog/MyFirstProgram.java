package com.sample.prog;

public class MyFirstProgram {
	public static void main(String args[]) {
		System.out.println("This is my first program");
		Test test = new Test();
		System.out.println("Value of i in test = " + test.getI());
		test.setI(5);
	//	System.out.println("New Value of i = " + test.getI());
		
		Test test1 = new Test();
		System.out.println("Value of i in test1 = " + test1.getI());
		test1.setI(10);
	//	System.out.println("New Value of i = " + test1.getI());
		
		System.out.println("New Value of i = " + test.getI()+ " "+ test1.getI());

		Test test2 = new Test();
		System.out.println("Value of i in test1 = " + test2.getI());
		
		
		Card card1 = new Test();
		card1.chargeCustomer(5, "sometest", 001);
	}
}

final class Test implements Card{
	 static int  i = 0;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	public String chargeCustomer(int value, String comment, int merc_id) {
		
		System.out.println("some code goes here");
		return "some output";
	}

}


class CardImplementor implements Card{
	public String chargeCustomer(int value, String comment, int merc_id) {
		System.out.println("call from cardImplementor");
		return "some output";
	}

}

interface Card{
	int i=0;
	
	String chargeCustomer(int value, String comment, int merc_id);
}