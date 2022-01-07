package com.google.s6.student;

public class StudentDTOSecond extends StudentDTO {
	
	//String name; 상속받음
	
	public StudentDTOSecond() {
//		super("iu");  //부모클래스에 생성자에 매개변수가 있으면 이렇게 직접 적어야함.
		//자식의 생성자에서 사용, 부모의 생성자를 호출함, / 생략가능
		//생성자의 첫줄에 위치하고, this(),super()랑 같이 사용 불가
	}
	

			
	int history;
	
	public int setTotal() {
		//overriding
		this.total=this.kor+this.eng+this.math+this.history;
		System.out.println(this.total);
		
		return this.total;
	}

}
