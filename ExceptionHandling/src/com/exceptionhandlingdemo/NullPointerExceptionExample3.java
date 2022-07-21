package com.exceptionhandlingdemo;

public class NullPointerExceptionExample3 {
	public static void main(String[] args) {

		try {
			String name = null;
			System.out.println(name.length());

		}

		catch (NullPointerException e) {
			System.out.println(e);
		}

		System.out.println("my name is vennela");
	}
}
