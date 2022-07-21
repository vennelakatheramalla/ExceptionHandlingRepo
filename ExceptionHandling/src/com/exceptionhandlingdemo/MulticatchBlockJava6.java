package com.exceptionhandlingdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MulticatchBlockJava6 {
	public static void main(String[] args) throws IOException{
		
		File file=new File("msg.txt");//creating file object
		FileReader fileReader=new FileReader(file);//it reads the file in form of characters
		
		BufferedReader bufferedReader=new BufferedReader(fileReader);//reads group characters
		int i;
		while ((i=bufferedReader.read())!=-1) {
			System.out.println((char)i);
			
			
		}
		bufferedReader.close();
		fileReader.close();
	}

}
