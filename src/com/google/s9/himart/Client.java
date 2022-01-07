package com.google.s9.himart;

public class Client {
	
	int money;
	int point;
	
	public void buy(Himart p) {
		this.money=this.money-p.price;
		this.point  =this.point+point;
		System.out.println("최종금액 : "+this.money);
		System.out.println("최종 포인트 : "+this.point);
	}
	
//	public void buy(Computer p) {
//		this.money=this.money-p.price;
//		this.point  =this.point+point;
//		System.out.println("최종금액 : "+this.money);
//		System.out.println("최종 포인트 : "+this.point);        // 메인의 buy에서 뭐를 검색해도 가격p가 나옴
//	}
//	public void buy(Phone p) {
//		this.money=this.money-p.price;
//		this.point  =this.point+point;
//		System.out.println("최종금액 : "+this.money);
//		System.out.println("최종 포인트 : "+this.point);
//	}
	
}
