package com.exceptionhandlingdemo;

public class ClassNotFoundEx {
	public static void main(String[] args) {
		System.out.println("my name is class not found");
	
		
		try {
			Class.forName("java");
		}
		
		catch (ClassNotFoundException e) {
			System.out.println(e);
			
		}
		System.out.println("rest of the code");
	
	try {
		String name =null;
		
	}catch(NullPointerException ex) {
		ex.printStackTrace();
		System.out.println("my name is null");
	}
	
	System.out.println("my name is null");
		
	try {
		int data=20/0;
	}
	catch(ArithmeticException e) {
		System.out.println("data");
	}

}
}
	