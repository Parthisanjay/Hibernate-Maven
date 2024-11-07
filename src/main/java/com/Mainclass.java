package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person p=new Person();
		p.setPid(1);
		p.setName("Partha");
		p.setGender("Male");
		p.setAge(26);
		
//		p.setAge(27);
//		p.setGender("Male");
//		p.setName("Sanjay");
//		p.setPid(2);
		
		et.begin();
		em.persist(p);
		et.commit();
	}
}
