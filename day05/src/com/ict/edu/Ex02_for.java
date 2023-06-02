package com.ict.edu;

public class Ex02_for {

	public static void main(String[] args) {
		// 안녕하세요 열번 출력하기
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " = 안녕하세요");
		}

		// 0~10까지 출력
		for (int i = 0; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 0~10까지 짝수만 출력
		for (int i = 0; i < 11; i = i + 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < 11; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 구구단 7단 출력
		for(int i = 1; i < 10; i++) {
			System.out.println("7 x "+i+" = "+(7*i));
		}
		
		// 1~10 누적합 (합계 구하기)
		int sum = 0;
		for(int i = 1; i < 11; i++) {
			sum = sum + i;				
		}
		System.out.println("누적합 : " + sum);
		
		// 0~10까지 짝수의 누적합
		int even = 0;
		for(int i = 0; i < 11; i++) {
			if(i % 2 == 0) {
				even = even + i;
			}
		}
		System.out.println("짝수의 누적합 : " + even);
		
		// 7! = 누적곱
		int a = 1;
		for(int i = 1; i < 8; i++) {
			a *= i;
		}
		System.out.println("7! : " + a);
		
	}	
}