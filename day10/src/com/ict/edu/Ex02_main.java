package com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		// 인스턴스는 내 클래스 가져다 쓰려면 객체로 만들어서 호출, **인스턴스 그림은 그릴줄알아야함
		// static 클래스는 호출 가능
		System.out.println(Ex02_class.AVG);
		System.out.println(Ex02_class.sum);
		System.out.println();
		
		// System.out.println(Ex02_class.name); 인스턴스는 객체가 생성되야 쓸수있어서 오류
		// System.out.println(Ex02_class.GENDER);
		// 객체 생성 후 접근
		// 클래스이름 참조변수 = new 생성자([인자]);
		// ** 해당 클래스의 생성자가 없으면 기본생성자 사용
		// ** 기본 생성자란 인자가 없는 생성자, 클래스이름 () = 기본생성자()
		Ex02_class test = new Ex02_class();
		// 접근법 ; 참조변수.멤버필드
		System.out.println(test);
		System.out.println(test.name);
		System.out.println(test.GENDER);
		System.out.println(test.AVG);
		System.out.println(test.sum);
		System.out.println("============");
		
		// 변수와 상수의 차이
		test.name = "일지매";
		// test.GENDER = "여성"; -> 오류임 / 변수는 변경될수 있어서 오류안나는데
		//						   상수는 값 변경 안되서 remove 'final'이라는 오류 뜸
		
		Ex02_class.sum = 1000;
		// Ex02_class.AVG = 12345; -> 위 내용과 마찬가지
		
		System.out.println(test.name);
		System.out.println(Ex02_class.sum);
	}
}
