package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {
	
	//계산기 본체 클래스는 CalcApp 입니다. 계산기 실행 결과는 다음과 같습니다.

    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.print(">> ");
    	String n = sc.nextLine();	//입력받은거
    	
    	String[] s =n.split(" ");
    	
    	

    	
    	sc.close();
    	
    	/*
   	 	//문자열->정수
   	 	int result02=Integer.parseInt("123456");
		System.out.println(result02);
		
		//정수--->문자열
		String s99=String.valueOf(5555);
		System.out.println(s99);
		
		//콤마를 기준으로 나누기
		String[] sArray=a.split(",");	
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
   	 */
    	
    }
}
