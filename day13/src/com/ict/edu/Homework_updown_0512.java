package com.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Homework_updown_0512 {
	public static void main(String[] args) {
		/*
		 * 높음 , 낮음 맞추는 게임 (랜덤함수 써서 컴퓨터가가진 높음, 낮음중에 맞추는것)
		 * - 공통사항 : 계속할까요(y/n) 사용 승률 구하기 (퍼센트)
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int com = ran.nextInt(10);
		
		while(true) {
		count++;
		System.out.println("게임을 시작합니다. 0~9 숫자를 입력하세요: ");
		int user = scan.nextInt();
		if (com == user) {
			System.out.print(count + "회 만에 맞추셨습니다.");
			break;
		} else if (com > user) {
			System.out.print(user + "숫자보다 높습니다.");
			continue;
		} else if (com < user) {
			System.out.print(user + "숫자보다 낮습니다.");
			continue;
		}

	}
}
}
