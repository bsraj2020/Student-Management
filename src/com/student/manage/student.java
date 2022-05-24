package com.student.manage;

public class student 
{
   private int studentId ;
   private String sname;
   private String city; 
   private String contact;
   
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}

public student(int studentId, String sname, String city, String contact) {
	super();
	this.studentId = studentId;
	this.sname = sname;
	this.city = city;
	this.contact = contact;
}
public student(String sname, String city, String contact) {
	super();
	this.sname = sname;
	this.city = city;
	this.contact = contact;
}

public student() {
	super();
	// TODO Auto-generated constructor stub
}
   

 

   
}
