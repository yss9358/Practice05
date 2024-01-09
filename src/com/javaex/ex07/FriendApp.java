package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    private static final Object[] Friend = null;

	public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
       
       Friend f01 = new Friend();
       Friend f02 = new Friend();
       Friend f03 = new Friend();
      
        //for문 시작
        //친구정보 3명 입력 로직 --> 반복문 사용
       
       	for(int i=0; i<3; i++) {
       		
       		
       		System.out.print("이름: ");
       		sc.nextLine();
       		System.out.print("핸드폰: ");
       	    sc.nextLine();
       		System.out.print("학교: ");
       		sc.nextLine();
       		System.out.println("-------------------------");
  
       	}
       	
        //for문 끝
        
       	friendArray[0] = f01;
        friendArray[1] = f02;
        friendArray[2] = f03;
       	
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
