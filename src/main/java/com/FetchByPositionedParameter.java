package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchByPositionedParameter {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter name");
	String name=s.next();
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em= emf.createEntityManager();
	
	Query q=em.createQuery("select p from Person p where p.name=?10");
	q.setParameter(10,name);
	
	Person p=(Person)q.getSingleResult();
	System.out.println(p);
  }	
}
