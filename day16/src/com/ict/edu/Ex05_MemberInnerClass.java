package com.ict.edu;

public class Ex05_MemberInnerClass {
	String name = "홍길동";
	private int age = 24;
	static boolean gender = true;
	
	public Ex05_MemberInnerClass() {
		System.out.println("외부 : " + this);
	}
	
	public void play() {
		int money = 1000;
		System.out.println("외부 메소드 : " + name);
		System.out.println("외부 메소드 : " + money);
	}
	
	// 내부 클래스
	public class Inner01{
		String addr = "서울 마포구";
		int roomNumber = 1;
		
		public Inner01() {
			System.out.println("내부 생성자 : " + this);
		}
		
		public void prn() {
			int weight = 79;
			System.out.println(addr);
			System.out.println(roomNumber);
			
			// 외부클래스의 멤버도 마음대로 사용가능(private 도 가능)
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
			
			// 외부클래스의 메소드
			play();
		}
	}
}
