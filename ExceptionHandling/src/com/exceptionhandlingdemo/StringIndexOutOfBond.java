package com.exceptionhandlingdemo;

public class StringIndexOutOfBond {
	public static void main(String[] args) {
		String name="vennela";
		try {
		
		System.out.println(name.charAt(9));
		
		}
		catch (StringIndexOutOfBoundsException e) {
		}
		System.out.println("it is string index out of bond");
		
	}

}
