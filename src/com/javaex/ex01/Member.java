package com.javaex.ex01;

public class Member {
	
	// 필드
	
	private String id;
	private String name;
	private int point;
	
	// 생성자
	public Member() {
		
	}
	
	public Member(String name, String id, int point) {
		this.name = name;
		this.id = id;
		this.point = point;
		
	}
	
	// 메소드 - g/s
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	// 메소드 - 일반
	
	public String toString() {
		return "Member[name: " + name + "(" + id + ")" + ", " + point + "점";
	}
	
	public void showinfo() {
		System.out.println("회원정보: " + name + "(" + id + ")" + "," + point + "점"); 
	}
}
