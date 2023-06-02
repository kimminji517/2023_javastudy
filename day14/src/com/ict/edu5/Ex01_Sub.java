package com.ict.edu5;

public class Ex01_Sub extends Ex01_Super{
	int weight = 35;
	
	@Override // 부모정보를 숨긴것 = 정보은닉
	public void sound() {
		System.out.println("음악소리");
	}
	public void hobby() {
		System.out.println("잠자기");
	}
}
