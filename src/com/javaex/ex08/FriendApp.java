package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		//java.util.Scanner 클래스를 이용하여 친구정보를 입력받아 Friend 객체를 생성하고 이들을 Friend 객체 배열에 저장하세요.
		//친구 즉, 친구(Friend)객체를 3개 입력 받으면 이들을 모두 화면에 출력하세요.
		//도움받음 다시해보기
		//따로따로 글쓰는게 가능했으면 좋겠음

		Scanner sc=new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해 주세요");
	
		
		Friend[] fArray= new Friend[3];
		
		for (int i=0; i<fArray.length; i++) {
			String s= sc.nextLine();	//입력받기
			
			Friend f= new Friend();
			
			String[] r= s.split(" ");
			f.setName(r[0]);
			f.setHp(r[1]);
			f.setSchool(r[2]);
			
			fArray[i]=f;
		}
		
		for (int i=0; i<fArray.length; i++) {
			System.out.println(fArray[i].showInfo());
		}
		
		
		
		sc.close();
	}

}
