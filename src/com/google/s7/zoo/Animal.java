package com.google.s7.zoo;

public abstract class Animal {// 추상메서드가 있으니까 추상클래스로 바꿔야함
	
	String name;
	int age;
	
	public void eat() {
		System.out.println("냠냠");
		
	}
	
	public abstract void sleep (); //내용이 다를수도 있으니까 일단 지워놓고 abstract선언
	//추상메서드가 있으면 클래스에도 abstract추가해야함

}
