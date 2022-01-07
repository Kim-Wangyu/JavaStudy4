package com.google.s8.rpg;

public class RpgMain {

	public static void main(String[] args) {
/*		
 * Knight k1 =new Knight();
 
		Magition m1 = new Magition();
		//Magition type 은 Character type 도 된다. 상속을 받았기 때문 !
		int num =10;
		
		m1.name="간달프";
		m1.hp=100;
		m1.mp=50;
		
		Character c1 = m1;
		
		System.out.println(c1.name);
		System.out.println(c1.hp);
	//	System.out.println(c1.mp);
		m1= (Magition)c1;
		
		System.out.println(m1.name);
		System.out.println(m1.mp);
		
		//m1 =c1; 은 안됨, 매지션은 캐릭터 타입이어도 캐릭터타입은 매지션 타입이 아닐 수 있기 때문 !
		//m1 = (Magition)c1;   //같은 타입인 부분만 넣을 수 있음
		
		
		
		k1.attack();
		k1.move();
		m1.attack();/*
		
*/
		
		Knight k1= new Knight();
		Magition m1 = new Magition();
		Archer a1 = new Archer();
		
		Character [] ch =new Character[3];
		ch[0]=k1;
		ch[1]=m1;
		ch[2]=a1;
		
	}

}
