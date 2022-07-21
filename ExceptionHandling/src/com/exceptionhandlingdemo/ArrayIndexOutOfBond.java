package com.exceptionhandlingdemo;


public class ArrayIndexOutOfBond {
public static void main(String[] args) {
	
	try {
	
	int arr[]= {1,2,3,4,5,6};
	for(int i=0;i<=arr.length;i++) {
		System.out.println(arr[8]);
	}
	}
	
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	
	}
	System.out.println("it is out of bound");
	
}
}
