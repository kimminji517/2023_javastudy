package com.ict.edu;

public class Ex03_break_continue {
	public static void main(String[] args) {
		// break 와 continue
		// break : 현재위치의 블록을 탈출하는 예약어(명령어)
		// continue : continue문을 만나면 아래 수행문을 포기하고 다음회차를 하기
		// 위해서 증감식으로 이동
		// break 는 for문, while문 모두 사용, continue 는 for문에 사용 (while문 도 사용은 가능함)

		// 1~10 출력
		for(int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 1~10 출력 6일때 break 사용
		for(int i = 1; i < 11; i++) { // if 위치에 따라 값 다름
			if(i == 6) break;
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if(i == 6) break;
		}
		System.out.println();	
		System.out.println("====================");
		
		// 1~10 출력 6일때 continue 사용
		for (int i = 1; i < 11; i++) { // if 위치에 따라 값 다름
			if (i == 6) continue;
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if (i == 6) continue;
		}
		System.out.println();
		System.out.println("====================");
		
		// 1~10 중 홀수 출력 (일반적인 if 사용법)
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1) {
			System.out.println(i);
			}
		}
		// 1~10 중 홀수 출력 (continue 사용)
		for (int i = 1; i < 11; i++) { 
			if (i % 2 == 0) continue;
			System.out.println(i);
		}

		
	}
}
