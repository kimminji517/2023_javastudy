package com.ict;

public class Ex03_if {
	public static void main(String[] args) {
		// int k1이 60 이상이면 합격
		int k1 = 60;
		String res = "초기값";
		if(k1 >= 60) {
			res = "합격";
		}
		
		if(k1 <= 60)
			res = "불합격";
		
		System.out.println("결과 : " + res);
		
		//int k2가 홀수인지 짝수인지 판별하자.
		int k2 = 43;
		res = "짝수";
		if(k2 % 2 == 1) {
			res = "홀수";
		}
		System.out.println("결과 : " + res);
		
		// char k3 가 대문자인지, 아닌지 판별하자
		char k3 = 'b';
		res = "대문자 아님";
		if(k3 >= 'A' && k3 <= 'Z') {
			res = "대문자";
		}
		System.out.println("결과 : " + res);
		
		//근무시간이 8시간까지는 시간당 9620이고 
		//8시간을 초과한 시간 만큼은 1.5배 지급한다. 
		//현재 근무한 시간이 10이다. 
		//얼마를 받아야 하는가?
		
		int h = 10;
		int wh = 8;
		int dan = 9620;
		int pay = h * dan;
		if(h > 8) {
			pay = dan * wh + (int)(dan*1.5)*(h - wh);
		}
		System.out.println("결과 : " + pay);
		
	}

}
