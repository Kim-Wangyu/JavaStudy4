package com.google.s3.member;

public class MemberMain {

	public static void main(String[] args) {
		Member member = new Member();
		member.setAge(40000);
		member.setEmail("test#gamil.com");
		
		String email = member.getEmail();
		
		System.out.println(email);
		
		System.out.println(member.getAge());

	}

}
