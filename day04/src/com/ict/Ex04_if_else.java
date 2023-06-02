package com.ict;

public class Ex04_if_else {
	public static void main(String[] args) {
		// int k1이 60 이상이면 합격 아니면 불합격
		int k1 = 89;
		String str = "";
		
		if(k1 >= 60) {
			str = "합격";
		}else {
			str = "불합격";
		}
		System.out.println("결과 : " + str);
		
		// int k2가 홀수인지, 짝수인지 판별하자
		
		int k2 = 69;
		str = "";
		
		if(k2 % 2 == 0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		System.out.println("결과 : " + str);
		
		// char k3가 대문자인지, 대문자가 아닌지 판별하자
		
		char k3 = 'T';
		str = "";
		
		if(k3 >= 'A' && k3 <= 'Z') {
			str = "대문자";
		}else {
			str = "대문자 아님";
		}
		System.out.println("결과 : " + str);
		
		//근무시간이 8시간까지는 시간당 9620이고 
		//8시간을 초과한 시간 만큼은 1.5배 지급한다. 현재 근무한 시간은 10이다.
		//얼마를 받아야 하는가?
				
		int wh = 10;
		int h = 8;
		int dan = 9620;
		int pay = 0;
		
		if(wh <= 8) {
			pay = wh * dan;
		}else {
			pay = (h * dan) + (int)(dan * 1.5)*(wh - h);
		}
		System.out.println("받을돈은 : " + pay);
		
		
	}
}
