package com.exceptionhandlingdemo;

public class FinallyDemo {
	
	public static int division(int a,int b) {
		try {
			return a/b;
			
	
		}
		catch (ArithmeticException e) {
			//System.out.println(e.toString());
		e.printStackTrace();
			System.exit(0);
			return 0;
		}
		finally {
			System.out.println("finally block");
			return 6;
		}
		
	}
	public static void main(String[] ags) {
		System.out.println(division(10, 20));
	}

}
