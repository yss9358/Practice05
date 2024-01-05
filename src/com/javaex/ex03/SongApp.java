package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args){
		
		Song s1 = new Song("좋은날", "아이유", "Real", "이민수", "2010", 3);
		
		// Song(파라미터6개)
		
		// -> 파라미터5개 짜리 생성자가 실행된 값을 파라미터6개짜리 생성자가 받아서 사용
		// Song(파라미터5개) 출력 후 Song(파라미터6개) 출력됨
	}

}


