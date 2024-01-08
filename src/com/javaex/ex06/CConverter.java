package com.javaex.ex06;

public class CConverter {

	// 필드

	public static double rate = 1118.70;
	private double dollar;
	private double won;

	// 생성자

	public CConverter() {

	}

	// 메소드 - g/s

	

	public double getDollar() {
		return dollar;
	}

	public void setDollar(double dollar) {
		this.dollar = dollar;
	}

	public double getWon() {
		return won;
	}

	public void setWon(double won) {
		this.won = won;
	}

	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		CConverter.rate = rate;
	}

	// 메소드 - 일반

	public static double toDollar(double won) {
		return won / rate;
		
	}

	public static double toKWR(double dollar) {
		return dollar * rate;
	}

}
