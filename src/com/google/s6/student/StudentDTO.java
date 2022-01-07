package com.google.s6.student;

public abstract class StudentDTO {

	String name;
	int num;
	int kor;
	int eng;
	int math;
	// int history; //2
	// int physics; //3학년
	int total;

//	public StudentDTO() {} //빈생성자 그냥 만들어주는게 좋다?
//
//
//	public StudentDTO(String name) { // 생성자를 생성하고 내용을 입력하면 오류가 생김,
//		this.name = name;
	
	public abstract int setTotal();
	
	
	
	
	}

