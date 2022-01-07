package com.google.s8.rpg;

public class Magition extends Character implements Act{

	//마법사 is a 캐릭터  --이게 더 맞음
	//마법사 has a 캐릭터
	int mp;
	
	@Override
	public void attack() {
		System.out.println("마법공격");
		
	}

	@Override
	public void move() {
		System.out.println("걸어가기");
		
	}

	
	
	
	private void spel() {
		System.out.println("마법공격");
	}
	
}
