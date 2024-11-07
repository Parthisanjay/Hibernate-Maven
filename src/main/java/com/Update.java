package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	//	1st way
//		Person p=new Person();
//		p.setPid(2);
//		p.setAge(27);
//		p.setGender("Male");
//		p.setName("Sanjay");
		
	//2nd way
		Person p=em.find(Person.class,2);
		System.out.println(p);
		
		p.setAge(27);
		
		et.begin();
		em.merge(p);
		et.commit();
	}
}
