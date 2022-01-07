package com.google.s8.rpg;

public class Knight extends Character implements Act{

	@Override
	public void attack() {
		System.out.println("칼 휘두르기");
		
	}

	@Override
	public void move() {
		System.out.println("걸어다니기");
		
	}
	
//	public void slagh() {
//		System.out.println("칼 휘두르기");
//	}   
	 //이것을 인터페이스로 만들기
	

}
