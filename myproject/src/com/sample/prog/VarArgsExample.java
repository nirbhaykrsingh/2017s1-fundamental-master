package com.sample.prog;

public class VarArgsExample {
public static void main(String args[]) {
	//int sum = VarArgsExample.sum(10,20);
	//VarArgsExample varArgsExample = new VarArgsExample();
//	varArgsExample.sum(10,20);
	System.out.println("Sum of the digits: "+ VarArgsExample.sum(10,20,40));
	
}
//var-args  ...
static int sum(int... vals) {
	int sum=0;
	for(int i=0;i<vals.length;i++) {
		sum=sum+vals[i];
	}
	return sum;
}

}
