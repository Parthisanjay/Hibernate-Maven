package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchByName {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		
		Query q=em.createQuery("select p from Person p where Name='Sanjay'");
		
//		Object o=q.getSingleResult();
//		Person p=(Person)o;
		
	  //Upcasting and Downcasting directly
		Person p=  (Person) q.getSingleResult(); 
		
		System.out.println(p);
		
	}
}