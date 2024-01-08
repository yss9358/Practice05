package com.javaex.ex04;

public class Base {
    
	// 필드
	
	private String state;
	
	// 생성자
	
	public Base() {
		
	}
		
	public Base(String state) {
		this.state = state;
	}
	
	// 메소드 - g/s
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
    
	
	// 메소드 - 일반
	
	
	
    public void service(String state) {
    	switch( state ) { 
    	
    	case "낮":
    		System.out.println("낮에는 열심히 수업듣자");
    		break;
    	
    	case "밤":
    		System.out.println("밤에는 숙면");
    		break;
    		
    	case "오후":
    		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    		break;
    	}
        
        //코드작성할것
    }
    
   
	
	public void service() {
		
	}

	public void day() {
       
    }

    public void night() {
    	
        System.out.println("밤에는 숙면");
    	//코드작성할것
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
    
    
    
    
    
    
}

