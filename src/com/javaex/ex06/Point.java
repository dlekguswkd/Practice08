package com.javaex.ex06;

public class Point {
	
	//아래의 프로그램 실행시 결과를 예상하고 주어진 프로그램을 실행 후 확인해 보세요.
	//equals() 메소드가 없는데 실행되는 이유를 말하세요.
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
		/*
		 equals() 메소드가 없는데 실행되는 이유는
		 부모클래스인 Object 클래스에 equals() 메소드가 존재하기 때문이다.
		 부모에 있는 메소드를 끌어쓰기때문
		 */
		
		
	}

	
	
}
