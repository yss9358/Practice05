package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member member01 = new Member();
		
		member01.setName("정우성");
		member01.setId("jws");
		member01.setPoint(50000);
		
		Member member02 = new Member("유재석", "yjs", 30000);
			
		Member member03 = new Member("이효리", "ihr", 40000);
		
		member01.showinfo();
		member02.showinfo();
		member03.showinfo();
		
		

		
	}

}
