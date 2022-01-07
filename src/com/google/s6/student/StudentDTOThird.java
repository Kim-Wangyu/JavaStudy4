package com.google.s6.student;

public class StudentDTOThird extends StudentDTO {

	
	int physics;
	
@Override  //annotation (설명+행동)
public int setTotal() {
	this.total=this.eng+this.kor+this.math+this.physics;
	System.out.println(this.total);	

return this.total;
}



}
