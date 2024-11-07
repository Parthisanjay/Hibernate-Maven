package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		
		Person p= em.find(Person.class,2);
		
		System.out.println(p);
		System.out.println(emf);
		}
}
