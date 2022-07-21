package com.exceptionhandlingdemo;

public class NumberFormatException {
	
	
private static final String inputString="123.2";

	public static void main(String[] args) {
		
		try {
		
		int a=Integer.parseInt(inputString);
		}
		
	catch (Exception e) {
		System.out.println(e);
	} 
		System.out.println("invalid");
}
		
		

}
