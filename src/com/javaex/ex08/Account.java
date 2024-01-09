package com.javaex.ex08;

public class Account {

	// 필드
	
	private String accountNo;
	private int balance;

	// 생성자 작성

	public Account() {

	}

	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(accountNo + " 계좌가 개설되었습니다.");
	}

	// 메소드 - g/s

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 메소드 - 일반
	
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", balance=" + balance + "]";
	}
	
	public int deposit (int balance){
		return this.balance + balance;
	}
	
	public int withdraw (int balance) {
		return balance ;
	}
	
	public void showBalance() {
		System.out.println("잔고액");
	}

}
