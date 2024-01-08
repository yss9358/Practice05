package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    private static final Object[] Friend = null;

	public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
       /* 
        
       Friend f01 = new Friend("정우성", "010-1111-1111", "서울초등학교");
       Friend f02 = new Friend("이효리", "010-2222-2222", "제주중학교");
       Friend f03 = new Friend("유재석", "010-3333-3333", "강남고등학교");
       */
        
        
        
        //for문 시작
        //친구정보 3명 입력 로직 --> 반복문 사용
        Friend f_i = new Friend();
        
       
       	for(int i=0; i<3; i++) {
       		
       		
       		System.out.print("이름: ");
       		friendArray[i].setName(sc.nextLine());
       		System.out.print("핸드폰: ");
       		friendArray[i].setHp(sc.nextLine());;
       		System.out.print("학교: ");
       		friendArray[i].setSchool(sc.nextLine());
       		System.out.println("-------------------------");
  
       	}
       	
       
        //for문 끝
        
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
