package com.abc.tableperclass;

public class Student extends LibraryUser
{
	private int noofbooks;

	public int getNoofbooks() {
		return noofbooks;
	}

	public void setNoofbooks(int noofbooks) {
		this.noofbooks = noofbooks;
	}

	public Student(int id, String name, String mailid, int noofbooks) 
	{
		super(id, name, mailid);
		this.noofbooks = noofbooks;
	}

	public Student() 
	{
		super();
	}

	public Student(int id, String name, String mailid) 
	{
		super(id, name, mailid);
	}
	

}
