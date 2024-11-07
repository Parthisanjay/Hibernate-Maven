package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FetchAll {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		
		Query q= em.createQuery("select p from Person p");
		List<Person> l=q.getResultList();	
		
		for(Person p: l) {
			System.out.println(p);
		}
//		System.out.println(l);
	}
}
