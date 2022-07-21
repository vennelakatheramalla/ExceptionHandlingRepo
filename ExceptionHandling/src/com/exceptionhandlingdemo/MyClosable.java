package com.exceptionhandlingdemo;

public class MyClosable implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("closing");
		
	}
	public static void main(String[] args) {
		try(MyClosable myClosable=new MyClosable();){
			
		} catch (Exception e) {
			System.out.println("exception");
			//e.printStackTrace();
		}
	}

}
