package com.javaex.ex02;

public class Goods {

	// 필드
	
	private String name;
	private int price;
	
	// 생성자
	
	public Goods() { 
		// 생성자를 적지 않으면 생성자가 default 값으로 자동 생성된다.
		// 생성자를 적으면 default 값이 사라져 추가로 작성해야한다.(사용하려면)
		
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// 메소드 - g/s
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// 메소드 - 일반
	
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}
	
	
	
}




