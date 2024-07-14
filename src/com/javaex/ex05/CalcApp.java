package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {
	
	//계산기 본체 클래스는 CalcApp 입니다. 계산기 실행 결과는 다음과 같습니다.
	//도움받음 다시해보기

    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	
    	Add add = new Add();
		Div div = new Div();
		Mul mul = new Mul();
		Sub sub = new Sub();
    	
		while (true) {
			System.out.print(">> ");
			String numLine = sc.nextLine();

			String[] nArray = numLine.split(" "); // 공백 기준으로 자르기
			int num1 = Integer.parseInt(nArray[0]); // 첫번째 입력을 정수형으로 배열에 담기
			String symbol = nArray[1]; // 기호
			int num2 = Integer.parseInt(nArray[2]); // 두번째 입력을 정수형으로 배열에 담기

			if (symbol.equals("+")) {
				add.setValue(num1, num2);
				System.out.println(add.calculate());
			} else if (symbol.equals("/")) {
				div.setValue(num1, num2);
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
				} else {
					System.out.println(div.calculate());
				}
			} else if (symbol.equals("*")) {
				mul.setValue(num1, num2);
				System.out.println(mul.calculate());
			} else if (symbol.equals("-")) {
				sub.setValue(num1, num2);
				System.out.println(sub.calculate());
			} else {
				System.out.println("알 수 없는 연산입니다.");
			}

			if (numLine.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}
		}
    	
    	
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
