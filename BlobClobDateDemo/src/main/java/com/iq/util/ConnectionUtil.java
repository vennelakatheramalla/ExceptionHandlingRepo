package com.iq.util;

import java.io.IOException;
import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class ConnectionUtil {
	private static org.apache.log4j.Logger logger=org.apache.log4j.Logger.getLogger(ConnectionUtil.class);
	private static Connection connection=null;
	private static Statement st=null;
	private static ResultSet rs=null;
	private static Properties properties=null;
	
	static {
		try {
			properties=new Properties();
			try {
				properties.load(ConnectionUtil.class.getClassLoader().getResourceAsStream("db.properties"));
			} catch (IOException e) {
				logger.error("error messages: " +e.getMessage());
			}
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("pw"));
		logger.info("connection details +connection ");
			
			//System.out.println(connection);
		
		} catch (ClassNotFoundException | SQLException e) {
			
			logger.info("connection details +connection ");
		}
	}
	public static Connection getConnection() {
		return connection;
	}
	public static void closeConnection(Connection connection) {
		if(connection!=null ) {
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	public static void closeConnection(Connection connection,Statement st) {
		if(st!=null) {
			try {
				closeConnection(connection);
				st.close();
			}
			catch (SQLException e) {
				
			}
		}
		}
		public static void closeConnection(Connection connection, Statement st,ResultSet rs) {
			if(rs!=null) {
				
				try {
					closeConnection(connection,st);
					rs.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
		}
	}
		public static void main(String[] args) {
			System.out.println(getConnection());
		}

}
