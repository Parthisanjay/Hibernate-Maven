package com;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAge {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter starting age");
	int start=s.nextInt();
	System.out.println("Enter ending age");
	int end=s.nextInt();
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em= emf.createEntityManager();
	
	Query q=em.createQuery("select p from Person p where p.age between :start and :end");
	q.setParameter("start",start);
	q.setParameter("end",end);
	
	List<Person> l=q.getResultList();
	
	System.out.println(l);
  }	
}
