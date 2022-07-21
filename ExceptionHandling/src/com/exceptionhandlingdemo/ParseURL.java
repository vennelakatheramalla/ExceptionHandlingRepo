package com.exceptionhandlingdemo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class ParseURL {
	
	public static void main(String[] args) {
		
		try {
			URL url=new URL("http://javaprograming.com.80 /");
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getPath());
			System.out.println(url.getProtocol());
			
		
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
