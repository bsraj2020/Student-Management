package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class c_Provider 
{
	static Connection cnn;
	public static Connection  createConnection( )
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver") ;
			
			String url = "jdbc:mysql://localhost:3306/mydb" ;
			String user="root" ;
			String password="root" ;
			cnn = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return cnn ;
	}
}
