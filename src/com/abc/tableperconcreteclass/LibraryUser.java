package com.abc.tableperconcreteclass;

public class LibraryUser 
{
	private int id;
	private String name;
	private String mailid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public LibraryUser(int id, String name, String mailid) 
	{
		super();
		this.id = id;
		this.name = name;
		this.mailid = mailid;
	}
	public LibraryUser() 
	{
		super();
	}
}
