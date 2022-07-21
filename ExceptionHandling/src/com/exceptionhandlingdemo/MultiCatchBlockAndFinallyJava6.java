package com.exceptionhandlingdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiCatchBlockAndFinallyJava6 {
	public static void main(String[] args) {
		
		File file=new File("msg.txt");//creating file object
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//it reads the file in form of characters
		
		BufferedReader bufferedReader=new BufferedReader(fileReader);//reads group characters
		int i;
		try {
			while ((i=bufferedReader.read())!=-1) {
				System.out.println((char)i);
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}}
