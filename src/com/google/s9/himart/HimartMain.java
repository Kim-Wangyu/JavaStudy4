package com.google.s9.himart;

public class HimartMain {

	public static void main(String[] args) {
		//	Tv, Computer, Phone 정보입력

		Computer computer = new Computer();
		computer.company = "SamSung";
		computer.brand = "갤럭시";
		computer.cpu="i7";
		computer.price=200;
		computer.point=2;
		
		Phone phone = new Phone();
		phone.company="Apple";
		phone.brand = "iphone12";
		phone.pixel=150;
		phone.point=5;
		
		Tv tv =new Tv();
		tv.company="LG";
		tv.brand="오브제";
		tv.size=100;
		tv.price = 300;
		tv.point=10;
		
		Client client =new Client();
		client.money=1000;
		client.point=0;
		client.buy(phone);

	}

}
