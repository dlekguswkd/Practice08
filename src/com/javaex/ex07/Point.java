package com.javaex.ex07;

public class Point {
	
	/*
	 아래의 프로그램에서 Point의 정의는 x값이 같으면 같은 Point로 정의합니다.
	예) p1=2, 3 p2=2, 12 는 같다.
	p3=2, 3 p4=5, 3 은 다르다.
	아래의 결과와 같이 되도록 Point.java 파일의 equals()메소드를 작성 하세요.
	 */
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//equals() 메소드를 작성하세요.
	@Override
	public boolean equals(Object obj) {
		Point p=(Point)obj;
		
		if(this.x==p.x) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
