package com.ict.edu;

public class Ex04_while {

	public static void main(String[] args) {
		// while문 : for문과 같은 반복문
		// 1~10까지 출력하자

		int i = 1;
		while (i < 11) {
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("===============");

		i = 1;
		while (true) {
			if (i >= 11)
				break;
			System.out.println("i = " + i);
			i++;
		}

		// 0~10까지 짝수 출력
		i = 0;
		while (i < 11) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("===============");

		// 구구단 7단 출력
		/*
		 * 내가한거 i = 1; while(i < 65) { if(i % 7 == 0) { System.out.println(i); } i++; }
		 * System.out.println("===============");
		 */

		i = 1; // 쌤이한거
		while (i < 10) {
			System.out.println("7 * " + i + " = " + (7 * i));
			i++;
		}

		// 1~10 누적합
		int sum = 0;
		i = 1;
		while (i < 11) {
			sum += i;
			i++;
		}
		System.out.println(sum);

		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0

		i = 1;
		while (i < 5) {
			System.out.println("0 0 0 0");
			i++;

		}
		System.out.println("===============");

		i = 1;
		while (i < 17) {
			System.out.print("0 ");
			if (i % 4 == 0) {
				System.out.println();
			}
			i++;
		}
		
		
	}
}
