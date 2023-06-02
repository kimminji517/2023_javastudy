package com.ict.edu;

public class Ex01_Constructor {
	// this와 this()
	// this : 객체 내부에서 객체 자신을 지칭하는 예약어
	// 		  지역변수와 전역변수 이름이 같을때 전역변수 앞에 this를 붙인다. this를 붙이면 전역변수가됨
	
	
	// this() : 객체 내부에서 객체 자신의 생성자를 지정하는 예약어
	private String name = "홍길동";
	private int age = 34;
	
	public Ex01_Constructor() { // p1 주소와 생성자 주소가 동일한것을 확인할수있음
		// this() 으로 기재시 호출할 인자가 없어서 오류지만 인자 기재시
		// 생성자가 다른 생성자 호출(반드시 첫번째 줄에서)
		this("임꺽정");  
		System.out.println("기본생성자 : " + this);
		// 생성자에서 메소드 호출
		// prn(); 아래행과 동일의미
		// this.prn();
	}
	// 생성자 오버로딩 (같은 이름의 생성자가 2개 이상 있음)
	public Ex01_Constructor(String name) {
		this.name = name;
	}
	// 아래랑 차이점은 언제든지 바꿀수있는것은 setter 한번 바꿀수 있는것은 생성자
	public String getName() {
		return name; // return this.name; this 붙여도 오류 안남
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void prn() {
	
	}
	
}
