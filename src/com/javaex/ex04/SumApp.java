package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {
	
	//아래와 같이 숫자를 입력받고 출력되도록 프로그램을 작성하세요.

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		String[] n =numLine.split(" ");	//공백기준으로 나누기
		
		for(int i=0; i<n.length; i++) {
			sum=sum+Integer.parseInt(n[i]); //문자열을 정수로 바꾸기 static의 이해필요
		}
		
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
