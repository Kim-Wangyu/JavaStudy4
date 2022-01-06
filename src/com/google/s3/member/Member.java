package com.google.s3.member;

import java.util.Scanner;

public class Member {

	//이름,이메일주소,몸무게,키,나이
	
	
	private String name;
	private String email;
	private double weight;
	private double high;
	private int age;
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public void setAge(int age) {
		this.age=20;
		if(age>0&&age<200) {
		this.age = age;
		}
	}
	
	public int getAge() {
		return this.age;
		
	}
	
	

	
	
	
	
}
