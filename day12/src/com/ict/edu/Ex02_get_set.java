package com.ict.edu;

public class Ex02_get_set {
	
	// 직접 접근을 막기 위해서 접근제한자(private)를 사용한다.
	private String name = "홍길동";
	private int age = 24;
	private double weight = 72.6;
	private boolean gender = true; // 중간에 추가
	
	public boolean isGender() { // boolean형만 is라고 붙음
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	// 접근제한자 사용시 데이터 가져올수 없으므로
	// get() / set() 를 이용
	public String getName() {
		return name;
	}
	public void setName(String name) {//지역변수라서 이름같아도 사용가능
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
