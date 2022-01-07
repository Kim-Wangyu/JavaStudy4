package com.google.s6.student;

public class StudentMain {

	public static void main(String[] args) {
		//StudentDTO studentDTO = new StudentDTO(); 추상클래스되어서 객체생성 안됨
		StudentDTOSecond ss = new StudentDTOSecond();
		ss.history=30;
		ss.name="iu";
		System.out.println(ss.name);
		ss.setTotal();
		
		StudentDTOThird st = new StudentDTOThird();
		st.physics=50;
		st.setTotal();
		
//		//StudentDTOThird st = new StudentDTOThird();
//		st.physics=10;
//		st.eng=20;
//		st.name="choa";
//System.out.println(st.name);
//System.out.println(st.physics);
//
//
//		StudentDTOFourth sf=new StudentDTOFourth();
//		sf.physics = 50;
//		sf.music=4;
//		System.out.println(sf.physics);

	}

}
