package com.ict.edu;

public class Ex03_for2 {

	public static void main(String[] args) {
		// 중첩 For문
		for (int i = 1; i < 4; i++) {
			System.out.println("실행문 - 1");
			for (int j = 1; j < 6; j++) {
				System.out.println("i = " + i + ", j = " + j);
				
			} // 안쪽 for문 끝
			System.out.println("실행문 - 1");
		} // 바깥쪽 for문 끝
		
		// 구구단1
		for(int i = 2; i < 10; i++) {
			System.out.println("	");
			for(int j = 1; j < 10; j++) {
				System.out.print(i + " x " + j + " = " + (i*j)+ "	");
			}
		}
		System.out.println("");
		
		// 구구단2
		for(int i = 1; i < 10; i++) {
			System.out.println("	");
			for(int j = 2; j < 10; j++) {
				System.out.print(j + " x " + i + " = " + (j*i)+ "");
			
			}
		}
		
		
	}
}
