package com.javaex.ex10;

public class Book {

	// 필드

	private int bookNo;    // 번호
	private String title;  // 제목
	private String author; // 작가
	private int stateCode; // 상태코드 ( 대여유무를 나타내는 상태코드 )

	// 생성자
	public Book() {
		
	}

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		
	}
	
	public Book(int bookNo, String title, String author, int stateCode) {
		this(bookNo,title,author);
		this.stateCode = stateCode;
	}

	// 메소드 - g/s

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getStateCode() {
		return stateCode;
	}
	
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	// 메소드 - 일반
	
	/*public void displayBookInfo() {
		System.out.println(bookNo + " 책 제목:" + title + ", 작가:" + author + ", 대여 유무:" + stateCode );
	}*/
	
	public static void displayBookInfo(String books) {
		list = "";
		System.out.println(books);
		return 
		
	}
	

}
