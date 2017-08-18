package com.abc.tableperclass;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration().configure("com/abc/tableperclass/Hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		
		Transaction tx=ses.beginTransaction();
		/*
		LibraryUser lu=new LibraryUser();
		lu.setId(10);
		lu.setName("mounika");
		lu.setMailid("mounika@gmail.com");
		
		Student s1=new Student();
		s1.setId(11);
		s1.setName("velma");
		s1.setMailid("velma@gmail.com");
		s1.setNoofbooks(5);
		
		
		Faculty f1=new Faculty();
		f1.setId(12);
		f1.setName("shane");
		f1.setMailid("shane@gmail.com");
		f1.setCourse("algorithms");
		f1.setDepartment("computer science");
		
		ses.save(lu);
		ses.save(s1);
		ses.save(f1);
		*/
		Query q1=ses.createQuery("update Faculty set department='cs' where department='computer science'");
		q1.executeUpdate();
		
		tx.commit();
		
		System.out.println("success");
		

	}

}
