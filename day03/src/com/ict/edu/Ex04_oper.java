package com.ict.edu;

public class Ex04_oper {
	public static void main(String[] args) {
		// 논리연산자 : &&(AND, 논리곱), ||(OR, 논리합), !(NOT, 논리부정)
		int su1 = 10;
		int su2 = 7;
		boolean result;
		result = (su1 >= 7) && (su2 >= 5);
		System.out.println(result);
		
		result = (su1 <= 7) && (su2 >= 5);
		System.out.println(result);
		
		result = (su1 >= 7) && (su2 <= 5);
		System.out.println(result);
		
		result = (su1 <= 7) && (su2 <= 5);
		System.out.println(result);
		
		System.out.println("============================");
		su1 = 10;
		su2 = 7;
		
		result = ((su1 = su1 + 2)< su2 ) && (su1 == (su2 = su2 + 5));
		System.out.println("결과 : " + result);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		System.out.println("============================");
		int su3 = 34; 
		result = su3 >= 20 && su3 <= 40;
		System.out.println(result);
		
		char c1 = 'g';
		result = c1 >= 'a' && c1 <= 'z';
		System.out.println(result);
	}
}
