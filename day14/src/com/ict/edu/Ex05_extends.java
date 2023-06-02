package com.ict.edu;

import java.util.Random;

public class Ex05_extends extends Random{
	int su = nextInt();
	
		// int su = nextInt(); > 메인메소드는 static이어서 오류, 자기자신도 객체생성해야 Random이 생성됨
		
		// static 메소드는 static 변수만 사용 가능
		// System.out.println(su); > 사용불가
	
	public void play() {
		System.out.println("ex05 : " + su);
	}
	
	// static 메소드는 static만 사용가능
	public static void main(String[] args) {
		// system.out.println(su);
		// play();
		
		// 자기자신이라도 객체를 만들자
		Ex05_extends test = new Ex05_extends(); // 원래 static안에는 인스턴스 사용 불가하지만 참조변수(지역변수)라서 static안에서 기재 가능
		test.play();
	}
}
