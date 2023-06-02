package com.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Homework_mjb_0512 {
// 가위바위보 게임
	// 컴퓨터가 랜덤으로 가위바위보 중 하나 생성
	
	public static void main(String[] args) {
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	int count = 0;
	int win = 0;
	   
	while(true) {
	count++;
	// 랜덤 생성
	int create = ran.nextInt(3);
	// System.out.println(create); // 생성된 랜덤 보기위해 임시 기재
	System.out.print("가위(0), 바위(1), 보(2)를 입력하세요 : ");
	int user = scan.nextInt();
	if(create == 0) {
		switch(user) {
		case 0: System.out.println("비겼습니다."); break;
		case 1: System.out.println("이겼습니다."); win++; break;
		case 2: System.out.println("졌습니다."); break;}
	}else if(create == 1) {
		switch(user) {
		case 0: System.out.println("졌습니다."); break;
		case 1: System.out.println("비겼습니다."); break;
		case 2: System.out.println("이겼습니다."); win++; break;}
	}else if(create == 2) {
		switch(user) {
		case 0: System.out.println("이겼습니다."); win++; break;
		case 1: System.out.println("졌습니다."); break;
		case 2: System.out.println("비겼습니다."); break;}
	}else {
		System.out.println("가위(0), 바위(1), 보(2)중에 입력하세요.");
		count--;
		continue;
	}
	if(count > 10) {
		System.out.println("계속할까요? 1.yes / 2.no >> ");
		int res = scan.nextInt();
		if(res == 1) {
			continue;
		}else {
			break;
		}
	}
	double per = ((int)(win*1000.0/count*1.0))/10.0;
	System.out.println("승률은 " + per + "입니다."  );    
	   } 
	}
}
