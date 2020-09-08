package com.imooc.model;

public class Student {
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	
	
	public Student{
		
	}
	
	public Student( String studentNo,
	 String studentName,
	 String studentSex,
	 int studentAge){
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
	}
	
	public void setStudentNo(String studentNo) {
		this.studentNo= studentNo;
	}
	public String getStudentNo() {
		return this.studentNo;
	}
	
	public void setStudentName(String studentName) {
		this.studentName= studentName;
	}
	public String getStudentName() {
		return this.studentName;
	}
	
	public void setStudentSex(String studentSex) {
		this.studentSex= studentSex;
	}
	public String getStudentSex() {
		return this.studentSex;
	}
	
	public void setStudentAge(int studentAge) {
		this.studentAge= studentAge;
	}
	public int getStudentAge() {
		return this.studentAge;
	}
	
	public String introduction() {
		String str = 
	}
	
	
}

