import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.student.manage.student;
import com.student.manage.studentDao;

public class start {

	public static void main(String[] args) {
		
//		System.out.println("hi I started learning java");
	 
		
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println(" Press 1 to Add Student ");
			System.out.println(" Press 2 to Delete Student ");
			System.out.println(" Press 3 to Show Student ");
			System.out.println(" Press 4 to Update Contact no. ");
			System.out.println(" Press 5 to Exit from App ");
			
			int input = sc.nextInt();
			
			if(input==1) 
			{
				
				System.out.println("Enter your name: ");	String name = sc.next() ;
				System.out.println("Enter your city: ");	String city = sc.next() ;
				System.out.println("Enter your contact: ");	String contact = sc.next() ;
				
				//create the student object
				student st = new student(name,city,contact);
				boolean isExecuted = studentDao.insertIntoDB(st);
				
				if(isExecuted==true) System.out.println("Student "+ name + " data saved successfully in DB");
				System.out.println("Data not stored in DB , an error occured");
				
				
				// use JDBC and add student data
				
			}else if(input==2) {
				// delete user
				
				System.out.println("Enter student name to delete : ");	String name = sc.next() ;
				
                   boolean isExecuted = studentDao.DeleteFromDB(name);		
				if(isExecuted==true) System.out.println("Student "+ name + " data Deleted successfully from DB");
				System.out.println("Data not deleted from DB , an error occured");
				
				
			}else if(input==3) {
				// show user
				
				 studentDao.showAllfromDB() ;
				
				
				
				
			}else if(input==4) {
				// update contact 
				System.out.println("Enter student name to update Contact no. : ");	String name = sc.next() ;
				System.out.println("Enter new Contact no. for "+name+" : ");	String newContact = sc.next() ;
				
				 boolean isExecuted = studentDao.UpdateContactfromDB(name, newContact);		
				 
					if(isExecuted==true) System.out.println("Student "+ name + " data Updated successfully from DB");
					System.out.println("Data not Updated from DB , an error occured");
				
			}
			else if(input==5) {
				// break
				break;
			}
			
		}
		
		System.out.println("Thank you for using our service ..See you soon ");
		

	}

}
