package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity     //this Entity annotation is used to create table
public class Person {
	@Id    //this Id annotation is used to set primary key of the table
	private int pid;
	private String name;
	private String gender;
	private int age;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}	
	
}
