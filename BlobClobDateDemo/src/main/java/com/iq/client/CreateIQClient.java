package com.iq.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.iq.util.ConnectionUtil;

public class CreateIQClient {
	private static org.apache.log4j.Logger logger=org.apache.log4j.Logger.getLogger(CreateIQClient.class);
	public static void main(String[] args) throws ParseException {
		
		Connection connection=ConnectionUtil.getConnection();
		try {
		PreparedStatement ps=	connection.prepareStatement("insert into createiq_docs values(?,?,?,?,?,?)");
		ps.setInt(1, 101);
		ps.setString(2, "image");
		FileReader fr=new FileReader("D:\\test\\note.txt");
		ps.setClob(3, fr);
		
		FileInputStream fis=new FileInputStream("D:\\test\\logo.JPEG");
		ps.setBlob(4, fis);
		String myDate="2018/05/02";
		Date date3=new SimpleDateFormat("yyyy/mm/dd").parse(myDate);
		java.sql.Date sqlDate=new java.sql.Date(date3.getDate());
		ps.setDate(5, sqlDate);
		ps.setString(6, "there is an image");
		int result=ps.executeUpdate();
		System.out.println(result);
		logger.info("result:"+result);
		
		
		
		} catch (SQLException e) {
		System.out.println(e.getSQLState());
		logger.debug("error message: " +e.getSQLState()+"\n "+e.getMessage());
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
