package com.exceptionhandlingdemo;

public class A {
	public static void main(String[] args) {
		
	
	try {
		int a=50/0;
		
	}
	catch (ArithmeticException e) {
		//e.printStackTrace();
		e.toString();
		System.out.println("it is exit ");
		System.exit(0);
	}finally {
		System.out.println("finally block");

}
}
}
