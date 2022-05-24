package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class studentDao 
{
   
   public static boolean  insertIntoDB(student st)
   {
	   boolean isExecuted=false;
	  try {
		  // get connection object
		  Connection cnn  = c_Provider.createConnection();
		   
		   String query = "insert into student(sname, city, contact) value(?, ?, ?)" ;
		   // prepare Statement
		   PreparedStatement prepareStt = cnn.prepareStatement(query);	
		   prepareStt.setString(1, st.getSname());
		   prepareStt.setString(2, st.getCity());
		   prepareStt.setString(3, st.getContact());
		   
		   prepareStt.executeUpdate() ;
		   isExecuted=true;
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	  return isExecuted;
   }
	
   

   public static boolean  DeleteFromDB(String sname)
   {
	   boolean isExecuted=false;
	  try {
		  // get connection object
		  Connection cnn  = c_Provider.createConnection();
		   
		   String query = "delete from student where sname=?" ;
		   // prepare Statement
		   PreparedStatement ps = cnn.prepareStatement(query);
		   ps.setString(1, sname);
		   
		   ps.executeUpdate() ;
		   isExecuted=true;
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	  return isExecuted;
   }
   
   public static void  showAllfromDB()
   {
	  
	  try {
		  // get connection object
		  Connection cnn  = c_Provider.createConnection();
		   
//		   String query = "select *  from student where sname=?" ;
		 String query = "select *  from student " ;
		   // prepare Statement
//		   PreparedStatement ps = cnn.prepareStatement(query);
		 Statement ps = cnn.createStatement();
//		   ps.setString(1, sname) ;
		 ResultSet rs =   ps.executeQuery(query) ;
		  
		  while(rs.next())
		  {
			  System.out.println("Id - "+ rs.getInt(1));
			  System.out.println("Name - "+ rs.getString(2));
			  System.out.println("City - "+ rs.getString(3));
			  System.out.println("Mobile No. - "+ rs.getString(4));
			  System.out.println("++++++++++++++++++++++++++++++++");
		  }
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	  
//	 return rs ;
   }
   
   
   public static boolean UpdateContactfromDB( String sname,String newContact)
   {
	  boolean isExecued=false;
	  try {
		  // get connection object
		  Connection cnn  = c_Provider.createConnection();
		   
//		   String query = "select *  from student where sname=?" ;
		 String query = "update student set contact = ? where sname=?" ;
		   // prepare Statement
		 PreparedStatement ps = cnn.prepareStatement(query) ;
		 ps.setString(1, newContact);
		 ps.setString(2, sname);
		 
		 ps.executeUpdate();
		 isExecued = true;
		   
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	  
  return isExecued ;
   }
	
	
}
