package com.abc.tableperclass;

public class Faculty extends LibraryUser
{
	private String course;
	private String department;
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Faculty(int id, String name, String mailid, String course, String department) 
	{
		super(id, name, mailid);
		this.course = course;
		this.department = department;
	}
	public Faculty() 
	{
		super();
	}
	public Faculty(int id, String name, String mailid) 
	{
		super(id, name, mailid);
	}
	
	
	
}
