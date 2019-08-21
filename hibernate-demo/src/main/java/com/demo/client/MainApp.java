package com.demo.client;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Emp;
import com.demo.entity.Mydept;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg=new Configuration().configure();
SessionFactory sf=cfg.buildSessionFactory();
Session session=sf.openSession();
org.hibernate.Transaction tx= session.beginTransaction();
try {
	Mydept dept=session.get(Mydept.class, 30);
	Emp e1=new Emp(201,"vijay",45000,"Humpi");
	Emp e2=new Emp(202,"rakhesh",45000,"hyderabad");
	e1.setDept(dept);
	e2.setDept(dept);
	session.persist(e1);
	session.persist(e2);
	tx.commit();
}
catch(HibernateException e)
{
	tx.rollback();
}
finally {
	session.close();
	sf.close();
}

	}

}
