package com.imooc.model;

public class Subject {
	//
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	
	// 无参构造方法
	public Subject() {
		
	}
	public Subject(String subjectName,String subjectNo,int subjectLife) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName= subjectName;
	}
	public String getSubjectName() {
		return this.subjectName;
	}
	
	public void setSubjectNo(String subjectNo) {
		this.subjectNo= subjectNo;
	}
	public String getSubjectNo() {
		return this.subjectNo;
	}
	
	public void setSubjectLife(int subjectLife) {
		if(subjectLife<=0) {
			return;
		}
		this.subjectLife= subjectLife;
	}
	public int getSubjectLife() {
		return this.subjectLife;
	}
	
	public void info() {
		System.out.println("hello world!");
	}
}
