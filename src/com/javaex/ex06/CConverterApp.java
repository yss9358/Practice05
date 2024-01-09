package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
      
        //100만원을 달러로 출력하기
        
        System.out.println("백만원은 " + CConverter.toDollar(1000000) + "달러입니다.");
        
      
        //100달려를 원으로 출력하기
        System.out.println("백달러는 " + CConverter.toKWR(100) + "원 입니다.");
        
        /*
        
        //100만원을 달러로 출력하기
        
        CConverter con1 = new CConverter();
        
        System.out.println("백만원은 " + con1.toDollar(1000000) + "달러입니다.");
        
        //100달려를 원으로 출력하기
        
        CConverter con2 = new CConverter();
        
        System.out.println("백달러는 " + con2.toKWR(100) + "입니다.");
                
        */
    }

}
