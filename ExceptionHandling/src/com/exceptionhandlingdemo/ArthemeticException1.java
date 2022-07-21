package com.exceptionhandlingdemo;

public class ArthemeticException1 {
	public static void main(String[] args) {
		
		try {
int data=50/0;
		}
		catch(ArithmeticException ex) {
			
		System.out.println(ex);
System.out.println("Arthemetic Exception");

}
}
}