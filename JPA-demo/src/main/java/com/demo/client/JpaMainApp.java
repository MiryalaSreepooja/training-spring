package com.demo.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.demo.entity.Emp;
import com.demo.entity.Mydept;

public class JpaMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql");
EntityManager em=emf.createEntityManager();

try {
	em.getTransaction().begin();;
	Mydept dept=em.find(Mydept.class, 30);
	Emp e1=new Emp(203,"vijaya",45000,"Humpie");
	Emp e2=new Emp(204,"rakhi",45000,"kolkata");
	e1.setDept(dept);
	e2.setDept(dept);
	em.persist(e1);
	em.persist(e2);
	em.getTransaction().commit();
}
catch(Exception e)
{
	e.printStackTrace();
	em.getTransaction().rollback();
}
finally {
	em.close();
}
	}

}
