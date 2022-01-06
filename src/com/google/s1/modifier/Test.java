package com.google.s1.modifier;

class Test { //default 인데 생략하라는 뜻 (Public을)

	private int num;
	
	public  Test() {
		
		
	}
	
	public void info(int num) { // private을 클래스에서 불러와서 값을 줌
		this.num =num;
		System.out.println(this.num);
	}
	
}
