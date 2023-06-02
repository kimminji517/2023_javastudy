package com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		//전체 진행한 횟수, 짝수 횟수, 짝수가 나온 퍼센트 구하기 (소숫점 첫째자리까지 구하기)	
		Scanner scan = new Scanner(System.in);
		int all = 0;
		int a = 0;

				
		while (true) {
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();
			String str = "";
			if (su % 2 == 0) {
				str = "짝수";
				a++;
			} else {
				str = "홀수";
			}
			System.out.println(su + "는 " + str + " 입니다.");
			
			System.out.println("계속할까요?(1.yes, 2.no) >> ");
			int s1 = scan.nextInt();
			if(s1 == 2) {
				break;
			}else if (s1 == 1){
				all++;
			}else {
				System.out.println("잘못 입력했습니다.");
				System.out.println("계속할까요?(1.yes, 2.no) >> ");
				int s2 = scan.nextInt();
			}
			double cc = (int)(a*1000.0/all)/10.0;
			System.out.println("총 횟수는 " + all +"회 이고, 짝수는 " + a + "번, 짝수가 나온 확률은 " + cc + "%입니다.");
			
				
				
		}
	}
}
