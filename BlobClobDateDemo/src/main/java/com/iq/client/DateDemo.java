package com.iq.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.mysql.cj.protocol.a.SqlDateValueEncoder;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		
		Date date=new Date();
		System.out.println(date);
		
		Date date2=new Date(2018/05/02);
		System.out.println(date2);
		
		String myDate="2018/05/02";
		Date date3=new SimpleDateFormat("yyyy/mm/dd").parse(myDate);
		//System.out.println(simple.parse(myDate));
	//	simple.format(date2);
		
		System.out.println(date3);
		
		java.sql.Date sqlDate=new java.sql.Date(date.getDate());
		System.out.println(sqlDate);
		
	}

}
