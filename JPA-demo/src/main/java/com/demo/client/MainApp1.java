package com.demo.client;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.entity.*;

public class MainApp1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg=new Configuration().configure();
SessionFactory sf=cfg.buildSessionFactory();
Session session=sf.openSession();
org.hibernate.Transaction tx= session.beginTransaction();
try {
	Mydept e=new Mydept(200,"john","kamesh");
	session.persist(e);
	tx.commit();
}
catch(HibernateException e)
{
	tx.rollback();
}
finally {
	session.close();
}

	}
}
