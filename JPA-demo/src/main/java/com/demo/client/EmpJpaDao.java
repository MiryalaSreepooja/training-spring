package com.demo.client;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.Emp;

@Repository
@Transactional
public class EmpJpaDao {
	@PersistenceContext
	private EntityManager em;
	
	public String saveEmp(Emp e)
	{
		em.persist(e);
		return "emp saved";
	}
	public void findEmp(int id)
	{
		Emp e=em.find(Emp.class, id);
		System.out.println(e.getEmpId()+" "+e.getName());
	}
}
