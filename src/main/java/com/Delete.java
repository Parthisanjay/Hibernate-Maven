package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person p=em.find(Person.class,2);
		
		if(p!=null) {
			et.begin();
			em.remove(p);
			et.commit();
			System.out.println("Data removed");
		}
		else {
			System.out.println("Data Notfound");
		}
	}
}
