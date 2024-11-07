package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchNameandAge {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		
		Query q=em.createQuery("select p.name,p.age from Person p");
		
		List<Object[]> l=q.getResultList();
//		System.out.println(l);
		
		for(Object[] arr: l) {
			System.out.println("Name: "+arr[0]+" "+"Age: "+arr[1]);
		}
	}
}
