package com.javaex.ex01;

public class LastNumberApp {
	
	//LastNumberApp.java 코드 실행시 아래와 같이 예외가 발생합니다.

	public static void main(String[] args) {

		// 수정하지 마세요
		lastValue();
	}


	//런타임시 오류발생
	public static void lastValue() {

		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;

		int result;
		
		//아래부분을 try~catch문을 사용하여 수정하세요
		try {
			for(int i=0; i<=intArray.length; i++) {
				result = intArray[3];
				System.out.println(result);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어나 강제 종료합니다.");
		}
		
		
	}

}
