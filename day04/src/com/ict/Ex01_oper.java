package com.ict;

public class Ex01_oper {

	public static void main(String[] args) {
		// 삼항 연산자 : 조건식 -> 조건이 참일때와 거짓일때를 구분해서 실행
		String str = (true) ? "강아지" : "고양이";
		System.out.println("결과 : " + str);
		
		//int avg = 55;
		double avg = 85.3;
		str = (avg >= 60) ? "합격" : "불합격";
		System.out.println("결과 : " + str);
		
		char c1 = 'g';
		str = (c1 >= 'a' && c1 <= 'z') ? "소문자" : "소문자아님";
		System.out.println("결과 : " + str);
		

		int gender = 1;
		str = (gender == 1 || gender == 3) ? "남자" : "여자";
		System.out.println("결과 : " + str);

		gender = 4;
		str = (gender % 2 == 1) ? "남자" : "여자";
		System.out.println("결과 : " + str);
		
		int su1 = 157;
		str = (su1 % 3 == 0) ? "3의배수" : "3의배수가 아니다";
		System.out.println(str);
		
		//근무시간이 8시간까지는 시간당 9620이고 
		//8시간을 초과한 시간 만큼은 1.5배 지급한다. 현재 근무한 시간은 10이다.
		//얼마를 받아야 하는가?
		// int a = (조건) ? a : b
				
		int h = 10;
		int a = 9620;
		int money = (h <= 8) ? (a*h) : ((a*8) + (int)((a*1.5*(h-8))));
		System.out.println(money);
		
		
		int num1 = 47; //큰값 구하기
		int num2 = 32;
		int res = (num1 > num2) ? num1 : num2;
		System.out.println("큰값 : " + res);
		
		res = (num1 - num2 > 0) ? num1 : num2;
		System.out.println("큰값 : " + res);
				
		int res2 = Math.max(num1, num2);
		System.out.println("큰값 : " + res2);
		
		int res3 = -38;   //절대값 구하기
		int res4 = (res3 > 0) ? res3 : res3*-1;
		System.out.println("큰값 : " + res4);
		
		int res5 = Math.abs(res3);
		System.out.println("큰값 : " + res5);

		
		
	}
}
