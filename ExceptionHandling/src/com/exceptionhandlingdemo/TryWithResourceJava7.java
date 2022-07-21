package com.exceptionhandlingdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceJava7 {
	public static void main(String[] args) {
		
		File file=new File("msg.txt");
		try(FileReader fileReader=new FileReader(file);BufferedReader bufferedReader=new BufferedReader(fileReader);){
			
			int i;
			while ((i=bufferedReader.read())!=-1) {
				System.out.println((char)i);
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("given file not found,please give valid file name");
		
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO Exception found");
			
			e.printStackTrace();
		}
	}

}
